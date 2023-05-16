package src.backjun.q12891;


import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int cnt = Integer.parseInt(st.nextToken());
        int length = Integer.parseInt(st.nextToken());
        int count =0;
        String[] arr = new String[cnt];
        arr = br.readLine().split("");
        int[] acgt = new int[4];
        int[] acgtTmp = new int[4];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < acgt.length; i++) {
            acgt[i] = Integer.parseInt(st.nextToken());
        }
        for (int i = 0; i < length; i++) {
            if (arr[i].equals("A")){
                acgtTmp[0]++;
            }else if(arr[i].equals("C")){
                acgtTmp[1]++;
            }else if(arr[i].equals("G")){
                acgtTmp[2]++;
            }else if(arr[i].equals("T")){
                acgtTmp[3]++;
            }
        }
        if(check(acgt,acgtTmp)){
            count++;
        }
        int sIdx = 0;
        int eIdx = length;
        while(eIdx != cnt){
            if (arr[sIdx].equals("A")){
                acgtTmp[0]--;
            }else if (arr[sIdx].equals("C")){
                acgtTmp[1]--;
            }else if (arr[sIdx].equals("G")){
                acgtTmp[2]--;
            }else if (arr[sIdx].equals("T")){
                acgtTmp[3]--;
            }
            if (arr[eIdx].equals("A")){
                acgtTmp[0]++;
            }else if (arr[eIdx].equals("C")){
                acgtTmp[1]++;
            }else if (arr[eIdx].equals("G")){
                acgtTmp[2]++;
            }else if (arr[eIdx].equals("T")){
                acgtTmp[3]++;
            }
            if (check(acgt,acgtTmp)){
                count++;
            }
            sIdx++;
            eIdx++;

        }
        System.out.println(count);

    }
    private static boolean check(int[] acgt, int[] acgtTmp){
        for (int i = 0; i < acgt.length; i++) {
            if(acgtTmp[i] < acgt[i] ){
                return false;
            }
        }
        return true;
    }

}
