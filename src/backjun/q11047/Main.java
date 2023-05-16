package src.backjun.q11047;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(stringTokenizer.nextToken());
        int money = Integer.parseInt(stringTokenizer.nextToken());
        int[] arr = new int[N];
        int count = 0;
        for (int i = 0; i < N; i++) {
            stringTokenizer = new StringTokenizer(br.readLine());
            arr[i]  = Integer.parseInt(stringTokenizer.nextToken());
        }
        for (int i = N-1; i >= 0; i--) {
            if(arr[i] <= money){
               count += money/arr[i];
               money = money%arr[i];
            }
        }
        System.out.println(count);
    }

}
