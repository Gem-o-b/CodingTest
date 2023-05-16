package src.backjun.q11724;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    static int N,M;
    static ArrayList<Integer>[] arrayLists;
    static boolean[] visited ;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(br.readLine());
        N = Integer.parseInt(stringTokenizer.nextToken());
        M = Integer.parseInt(stringTokenizer.nextToken());
        arrayLists = new ArrayList[N];
        visited = new boolean[N];
        for (int i = 0; i < N; i++) {
            arrayLists[i] = new ArrayList<>();
        }
        for (int i = 0; i < M; i++) {
            stringTokenizer = new StringTokenizer(br.readLine());
            int S = Integer.parseInt(stringTokenizer.nextToken());
            int E = Integer.parseInt(stringTokenizer.nextToken());
            arrayLists[S-1].add(E);
            arrayLists[E-1].add(S);
        }
        int count =0;
        for (int i = 0; i < N; i++) {
           if (!visited[i]){
               count++;
               DFS(i);
           }
        }
        System.out.println(count);
    }

    private static void DFS(int n) {
        if (visited[n]){
            return ;
        }
        visited[n] = true;
        for (int i : arrayLists[n]) {
            if(!visited[i-1]){
                DFS(i-1);
            }
        }
    }

}
