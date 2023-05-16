package src.backjun.q2747;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int[] D;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        D = new int[N+1];

        D[0] = 0;
        D[1] = 1;
        for (int i = 2; i <= N; i++) {
            D[i] = -1;
        }
        System.out.println(fibo(N));

    }
    public static int fibo(int num){
        if (D[num] != -1) return D[num];

        return D[num] = fibo(num-1)+fibo(num-2);
    }

}
