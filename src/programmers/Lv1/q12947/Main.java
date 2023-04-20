package src.Lv1.q12947;

import java.util.Arrays;

class Solution {
    public boolean solution(int x) {

        return x%Arrays.stream(String.valueOf(x).split("")).mapToInt(Integer::parseInt).reduce(0,(a,b)->a+b)==0;
    }
}

public class Main {
    public static void main(String[] args) {
        int n =10;
        Solution solution = new Solution();
        System.out.println(solution.solution(n));
    }

}
