package src.backjun.q1707;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    static ArrayList<Integer>[] A;
    static boolean[] visited;
    static int[] check;
    static boolean isEven;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());
        for (int i = 0; i < cnt; i++) {
            isEven = true;
            String[] S = br.readLine().split(" ");
            int V = Integer.parseInt(S[0]);
            int E = Integer.parseInt(S[1]);
            A = new ArrayList[V+1];
            visited = new boolean[V+1];
            check = new int[V+1];
            for (int j = 1; j <= V; j++) {
                A[j] = new ArrayList<>();
            }

            for (int j = 0; j < E; j++) {
                S = br.readLine().split(" ");
                int start = Integer.parseInt(S[0]);
                int end = Integer.parseInt(S[1]);
                A[start].add(end);
                A[end].add(start);
            }

            for (int j = 1; j <= V; j++) {
                if (isEven){
                    dfs(j);
                }else{
                    break;
                }
            }
            if (isEven) System.out.println("YES");
            else System.out.println("NO");
        }
    }
    private static void dfs(int start) {
        visited[start] = true;
        for (int i : A[start]){
            if (!visited[i]){
                check[i] = (check[start]+1)%2;
                dfs(i);
            }else{
                if (check[i] == check[start]) isEven =false;
            }
        }

    }
}
