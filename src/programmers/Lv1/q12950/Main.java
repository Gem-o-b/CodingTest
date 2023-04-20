package src.Lv1.q12950;

import java.util.Arrays;

class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int [arr1.length][arr1[0].length];
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                answer[i][j] = arr1[i][j]+arr2[i][j];
            }
        }


        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        int[][] arr1 = {{1,2},{2,3}};
        int[][] arr2= {{3,4},{5,6}};
        Solution solution = new Solution();

//        System.out.println(solution.solution(n));
//        System.out.println(Arrays.toString(solution.solution(n)));
        System.out.println(Arrays.deepToString(solution.solution(arr1,arr2)));
    }

}
