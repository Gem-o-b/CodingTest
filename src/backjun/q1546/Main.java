package src.backjun.q1546;


import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long cnt = Long.parseLong(br.readLine());
        int[] arr = Arrays.stream(br.readLine().split( " ")).mapToInt(Integer::parseInt).toArray();
        int max = 0;
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) max = arr[i];
            total += arr[i];
        }
        System.out.println((double)total* 100L/ max /cnt);
    }
}
