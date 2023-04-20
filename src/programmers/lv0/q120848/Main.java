package src.lv0.q120848;

import java.util.stream.IntStream;

class Solution {
    public int solution(int n) {
        int answer = 0;
        int total =1;
        while(true){
            if (total*(answer+1) > n){
                break;
            }
            total *=++answer;
        }

        return answer;

    }
}

public class Main {
    public static void main(String[] args) {
        int n =7;
        Solution solution = new Solution();
        System.out.println(solution.solution(n));
    }

}
