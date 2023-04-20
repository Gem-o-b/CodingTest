package src.Lv1.q77884;

import java.util.stream.IntStream;

class Solution {
    public int solution(int left, int right) {
//        System.out.println(IntStream.rangeClosed(left,right).map(i->IntStream.rangeClosed(1,i).reduce()).sum());

        //i%2==0?(int)IntStream.rangeClosed(1,i).filter(q->i%q==0).count()
        int answer = 0;
        int tmpCount = 0;
        for (int i = left; i <= right ; i++) {
            tmpCount =0;
            for (int j = 1; j <= i; j++) {
                if (i%j==0){
                    tmpCount++;
                }

            }
            answer = tmpCount%2==0?answer+i:answer-i;

        }


        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        int left = 13;
        int right = 17;
        Solution solution = new Solution();
        System.out.println(solution.solution(left,right));
//        System.out.println(Arrays.toString(solution.solution(n)));
    }

}
