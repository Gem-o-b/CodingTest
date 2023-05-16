package src.backjun.q1940;


import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());
        int sIdx = 0;
        int eIdx = cnt-1;
        int count = 0;
        int arr[] = new int[cnt];
        StringTokenizer stringTokenizer = new StringTokenizer(br.readLine());
        for (int i = 0; i < cnt; i++) {
            arr[i] = Integer.parseInt(stringTokenizer.nextToken());
        }
        Arrays.sort(arr);
        while(sIdx < eIdx){
            int tmp = arr[sIdx] + arr[eIdx];
            if (tmp == N){
                count++;
                sIdx++;
                eIdx--;
            }else if (tmp < N){
                sIdx++;
            }else{
                eIdx--;
            }
        }
        System.out.println(count);
    }

}
