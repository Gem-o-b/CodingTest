package src.Lv1.q12982;

import java.util.Arrays;

class Solution {
    public int solution(int[] d, int budget) {
        int total =0;
        int answer = 0;
        Arrays.sort(d);

        for (int i = 0; i < d.length; i++) {
            if(total +d[i] > budget){
                break;

            }

            total+=d[i];
            answer++;
        }


        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        int[] d = {2,2,3,3};
        int budget = 10;

        Solution solution = new Solution();
        System.out.println(solution.solution(d,budget));
//        System.out.println(Arrays.toString(solution.solution(n)));
    }

}
