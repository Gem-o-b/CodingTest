package src.backjun.q5585;


import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int pay = 1000-Integer.parseInt(br.readLine());
        int count = 0;
        int tmp =0;
        int[] arr = {500,100,50,10,5,1};
        for (int i = 0; i < arr.length; i++) {
            if(pay >= arr[i]) {
                tmp = pay / arr[i];
                count += tmp;
                pay -= tmp*arr[i];
            }
        }
        tmp = pay;
        count += tmp;
        System.out.println(count);
    }

}
