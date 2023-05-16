package src.backjun.q1253;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;


public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(stringTokenizer.nextToken());
        long[] arr = new long[N];
        int count =0;
        stringTokenizer = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Long.parseLong(stringTokenizer.nextToken());
        }
        Arrays.sort(arr);

        for (int i = 0; i < N; i++) {
            long target = arr[i];
            int S = 0;
            int E = N-1;
            while( S < E){
                if (S == i ){
                    S++;
                    continue;
                }else if ( E == i){
                    E--;
                    continue;
                }

                if (arr[S]+arr[E] == target){
                    count++;
                    break;
                }else if (arr[S]+arr[E] < target){
                    S++;
                }else{
                    E--;
                }

            }

        }
        System.out.println(count);

    }

}
