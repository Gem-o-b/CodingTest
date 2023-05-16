package src.backjun.q1920;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        Arrays.sort(arr);
        int M = Integer.parseInt(br.readLine());
        int[] findArr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        for (int i = 0; i < M; i++) {
            int sIdx = 0;
            int eIdx = N-1;
            int result = 0;
            while(sIdx <= eIdx){
                int tmpIdx = (eIdx+sIdx)/2;
                if (arr[tmpIdx] > findArr[i]){
                }else if (arr[tmpIdx] < findArr[i]){
                    sIdx = tmpIdx+1;
                }else{
                    result = 1;
                    break;
                }
            }
            System.out.println(result);
        }
    }
}
