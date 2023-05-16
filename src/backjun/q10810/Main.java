package src.backjun.q10810;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(stringTokenizer.nextToken());
        int M = Integer.parseInt(stringTokenizer.nextToken());
        int[] arr = new int[N+1];
        for (int i = 0; i < M; i++) {
            stringTokenizer = new StringTokenizer(br.readLine());
            int S = Integer.parseInt(stringTokenizer.nextToken());
            int E = Integer.parseInt(stringTokenizer.nextToken());
            int A = Integer.parseInt(stringTokenizer.nextToken());
            for (int j = S; j <= E; j++) {
                arr[j] = A;
            }
        }
        for (int i = 1; i <= N; i++) {
            System.out.print(arr[i]+" ");
        }
    }

}
