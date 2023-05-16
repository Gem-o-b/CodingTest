package src.backjun.q11726;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        long[] DP = new long [1001];
        DP[1] = 1;
        DP[2] = 2;
        for (int i = 3; i <= N; i++) {
            DP[i] = (DP[i-2]+DP[i-1])%10007L;
        }
        System.out.println(DP[N]);
    }
}
