package src.backjun.q11404;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        int[][] A = new int[N+1][N+1];
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                if(i==j) A[i][j] = 0;
                else A[i][j] = 10000000;
            }
        }
        for (int i = 0; i < M; i++) {
            StringTokenizer stringTokenizer = new StringTokenizer(br.readLine());
            int S = Integer.parseInt(stringTokenizer.nextToken());
            int E = Integer.parseInt(stringTokenizer.nextToken());
            int C = Integer.parseInt(stringTokenizer.nextToken());
            if (A[S][E] > C) {
                A[S][E] = C;
            }
        }
        for (int K = 1; K <= N; K++) {
            for (int S = 1; S <= N; S++) {
                for (int E = 1; E <= N; E++) {
                    A[S][E] = Math.min(A[S][E], A[S][K]+A[K][E]);
                }
            }
        }
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N ; j++) {
                if (A[i][j] == 10000000) sb.append("0 ");
               else sb.append(A[i][j]).append(" ");
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }

}
