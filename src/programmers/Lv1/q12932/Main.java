package src.Lv1.q12932;

import java.util.Arrays;

class Solution {
    public int[] solution(long n) {

        int[] answer = Arrays.stream(String.valueOf(n).split("")).mapToInt(i->Integer.parseInt(i)).toArray();
        int[] tmp =new int[answer.length];

        for (int i = answer.length-1; i >=0 ; i--) {
            tmp[answer.length-i-1] += answer[i];
        }
        return tmp;

//        return new StringBuilder().append(n).reverse().chars().map(Character::getNumericValue).toArray();
//        다른사람 풀이
    }
}

public class Main {
    public static void main(String[] args) {
        int n =12345;
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.solution(n)));
    }

}
