package src.backjun.q1934;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());
        StringTokenizer stringTokenizer;
        for (int i = 0; i < cnt; i++) {
            stringTokenizer = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(stringTokenizer.nextToken());
            int M = Integer.parseInt(stringTokenizer.nextToken());
            System.out.println(lcm(N,M));
        }
    }

    public static int gcd(int N, int M) {
        if (N % M == 0) return M;
        return gcd(M, N % M);

    }

    public static int lcm(int N, int M) {
        return (N * M) / gcd(N, M);
    }
}
