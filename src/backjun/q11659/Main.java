package src.backjun.q11659;


import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] a = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] b = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        long[] plusArr = new long[a[0]];
        for (int i = 0; i <b.length ; i++) {
            if (i != 0) {
                plusArr[i] = plusArr[i - 1] + b[i];
            }else{
                plusArr[i] = b[i];
;           }
        }
        for (int i = 0; i < a[1]; i++) {
            int[] temp = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            if (temp[0] != 1) {
                System.out.println(plusArr[temp[1] - 1] - plusArr[temp[0] - 2]);
            }else{
                System.out.println(plusArr[temp[1]-1]);
            }

        }
    }
}
