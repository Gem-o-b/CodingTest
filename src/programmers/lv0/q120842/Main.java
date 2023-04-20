package src.lv0.q120842;

import java.util.Arrays;
import java.util.stream.IntStream;

class Solution {
    public int[][] solution(int[] num_list, int n) {
        int[][] answer = new int[num_list.length/n][n] ;
        int count =0;
        for (int i = 0; i < answer.length; i++) {
            for (int j = 0; j < answer[i].length; j++) {
                answer[i][j] = num_list[count++];
            }
        }
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        int[] num_list = {100, 95, 2, 4, 5, 6, 18, 33, 948};
        int n = 3;
        Solution solution = new Solution();
//        System.out.println(solution.solution(n));
        System.out.println(Arrays.deepToString(solution.solution(num_list,n)));
    }

}
