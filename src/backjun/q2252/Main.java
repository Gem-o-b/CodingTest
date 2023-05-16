package src.backjun.q2252;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static ArrayList<Integer>[] A;
    static int[] arr ;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(stringTokenizer.nextToken());
        int M = Integer.parseInt(stringTokenizer.nextToken());
        arr = new int[N+1];
        A = new ArrayList[N+1];
        for (int i = 1; i <= N; i++) {
            A[i] = new ArrayList<>();
        }
        for (int i = 1; i <= M; i++) {
            stringTokenizer = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(stringTokenizer.nextToken());
            int e = Integer.parseInt(stringTokenizer.nextToken());
            A[s].add(e);
            arr[e]++;
        }
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= N ; i++) {
            if (arr[i] == 0) {
                queue.add(i);
            }
        }
        while(!queue.isEmpty()){
            int num = queue.poll();
            System.out.print(num+" ");
            for(int i : A[num]){
                arr[i]--;
                if (arr[i]==0){
                    queue.add(i);
                }
            }
        }

    }

}
