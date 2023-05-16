package src.backjun.q11720;


import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt( br.readLine());
        long sum = 0L;
        String sNum = br.readLine();
        char[] tmp = sNum.toCharArray();
        for (int i = 0; i < cnt; i++) {
           sum += tmp[i]-48;
        }
        System.out.println(sum);
    }

}
