package src.exam.uteco.num2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    private static final int MOD = 10_000_019;
    public int solution(int width, int height, int[][] diagonals) {
        // 대각선 정보를 2차원 배열로 변환
        boolean[][] isDiagonal = new boolean[width + 1][height + 1];
        for (int[] diagonal : diagonals) {
            int x = diagonal[0];
            int y = diagonal[1];
            isDiagonal[x][y] = true;
            isDiagonal[x][y - 1] = true;
            isDiagonal[x - 1][y] = true;
            isDiagonal[x - 1][y - 1] = true;
        }

        // 경로 개수를 저장할 2차원 배열
        int[][] dp = new int[width + 1][height + 1];

        // 경로 개수 초기화
        dp[1][1] = 1;
        for (int i = 2; i <= width; i++) {
            if (!isDiagonal[i][1]) {
                dp[i][1] = dp[i - 1][1];
            }
        }
        for (int j = 2; j <= height; j++) {
            if (!isDiagonal[1][j]) {
                dp[1][j] = dp[1][j - 1];
            }
        }

        // 경로 개수 계산
        for (int i = 2; i <= width; i++) {
            for (int j = 2; j <= height; j++) {
                if (!isDiagonal[i][j]) {
                    dp[i][j] = (dp[i - 1][j] + dp[i][j - 1]) % MOD;
                }
                if (!isDiagonal[i - 1][j] && !isDiagonal[i][j - 1] && isDiagonal[i - 1][j - 1]) {
                    dp[i][j] = (dp[i][j] + dp[i - 1][j - 1]) % MOD;
                }
            }
        }

        // 결과 반환
        return dp[width][height];
    }
}


public class Main {
    public static void main(String[] args) {
//        int width = 2;
//        int hight = 2;
//        int[][] diagonals = {{1,1},{2,2}};
//
//        Solution solution = new Solution();
//        System.out.println(solution.solution(width, hight, diagonals));
//        System.out.println(Arrays.toString(solution.solution(n)));
        int width = 51;
        int height = 37;
        int[][] diagonals = {{17, 19}};
        Solution solution = new Solution();
        System.out.println(solution.solution(width, height, diagonals));

        width = 2;
        height = 2;
        diagonals = new int[][]{{1, 1}, {2, 2}};
        System.out.println(solution.solution(width, height, diagonals));
    }

}
