package src.Lv1.q87389;

import java.util.stream.IntStream;

class Solution {
    public int solution(int n) {
        int answer = 0;
        for (int i = 2; i <= n ; i++) {
            if (n%i==1){
                answer=i;
                break;
            }
        }

        return answer==0?n-1:answer;
//        다른사람의 답
//        return IntStream.range(2, n).filter(i -> n % i == 1).findFirst().orElse(0);

    }
}

public class Main {
    public static void main(String[] args) {
        int n = 12;
        Solution solution = new Solution();
        System.out.println(solution.solution(n));
    }

}
