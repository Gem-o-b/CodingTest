package src.backjun.q11050;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//조합, DP
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(stringTokenizer.nextToken());
        int K = Integer.parseInt(stringTokenizer.nextToken());
        int[][] dp = new int [N+1][N+1];
        for (int i = 1; i <= N; i++) {
            dp[i][0] =1;
            dp[i][i] =1;
            dp[i][1] =i;
        }
        for (int i = 2; i <= N; i++) {
            for (int j = 1; j < i; j++) {
                if (dp[i][j] ==0){
                    dp[i][j] = dp[i-1][j]+dp[i-1][j-1];
                }
            }
        }
        System.out.println(dp[N][K]);
    }

}
