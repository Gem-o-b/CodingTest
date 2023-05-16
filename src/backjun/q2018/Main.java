package src.backjun.q2018;


import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int count = 1;
        int sum = 1;
        int sIdx = 1;
        int eIdx = 1;
        while (eIdx != N){
            if( sum == N ){
                count++;
                eIdx++;
                sum += eIdx;
            }else if ( sum < N ){
                eIdx++;
                sum += eIdx;
            }else{
                sum -= sIdx;
                sIdx++;
            }

        }
        System.out.println(count);
    }
}
