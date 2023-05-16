package src.hyundai.q582;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;


public class Main {
    static ArrayList<int[]>[] arrayList;
    static boolean[] visited;
    static int[] distance;
    static int[] beforeNode;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(stringTokenizer.nextToken());
        int M = Integer.parseInt(stringTokenizer.nextToken());
        visited = new boolean [N+1];
        arrayList = new ArrayList[N+1];
        distance = new int[N+1];
        beforeNode = new int[N+1];
        int rslt =0;

        for (int i = 1; i <= N; i++) {
            if (i!=1) distance[i] = 999999;
            arrayList[i] = new ArrayList<>();
        }
        for (int i = 0; i < M; i++) {
            stringTokenizer = new StringTokenizer(br.readLine());
            int S = Integer.parseInt(stringTokenizer.nextToken());
            int E = Integer.parseInt(stringTokenizer.nextToken());
            int L = Integer.parseInt(stringTokenizer.nextToken());
            arrayList[S].add(new int[] {E,L});
            arrayList[E].add(new int[] {S,L});
        }

        for (int i = 1; i <= N; i++) {
            if (visited[i]) continue;
            visited[i] = true;
            for(int[] z : arrayList[i]){
                int node = z[0];
                int D = z[1];
                if (distance[i] + D < distance[node]) {
                    distance[node] = distance[i] + D;
                    beforeNode[node] = i;

                }

            }

        }

        int scan = N;
        while(scan != 1 ){

            for(int[] i : arrayList[beforeNode[scan]]){
                if (i[0]==scan){
                    scan = beforeNode[scan];
                    if (rslt < i[1]) rslt = i[1];
                    break;
                }
            }


        }
        System.out.println(rslt+1);
    }

}
