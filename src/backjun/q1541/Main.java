package src.backjun.q1541;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split("-");
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            int num = mySum(arr[i]);
            if (i == 0) {
                total += num;
            } else {
                total -= num;
            }
        }
        System.out.println(total);
    }
    private static int mySum(String s) {
        int[] arr = Arrays.stream(s.split("\\+")).mapToInt(Integer::parseInt).toArray();
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            total += arr[i];
        }
        return total;
    }
}
