package src.backjun.q11657;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        Edge[] edges = new Edge[M+1];
        long[] A = new long[N+1];
        boolean check = false;
        for (int i = 1; i <= M; i++) {
            StringTokenizer stringTokenizer = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(stringTokenizer.nextToken());
            int end = Integer.parseInt(stringTokenizer.nextToken());
            int time = Integer.parseInt(stringTokenizer.nextToken());
            edges[i] = new Edge(start, end, time);
        }
        Arrays.fill(A,Integer.MAX_VALUE);
        A[1] = 0;
        for (int i = 1; i <= N-1; i++) {
            for (int j = 1; j <= M; j++) {
                Edge edge = edges[j];
                if (A[edge.start] != Integer.MAX_VALUE && A[edge.end] > edge.time+A[edge.start]  ){
                    A[edge.end] = edge.time+A[edge.start];
                }
            }
        }
        for (int j = 1; j <= M; j++) {
            Edge edge = edges[j];
            if (A[edge.start] != Integer.MAX_VALUE && A[edge.end] > edge.time+A[edge.start]  ){
                check = true;
                break;
            }
        }
        if (!check) {
            for (int i = 2; i <= N; i++) {
                if (A[i] == Integer.MAX_VALUE) {
                    System.out.println(-1);
                }else {
                    System.out.println(A[i]);
                }
            }
        }else{
            System.out.println(-1);
        }
    }



}
class Edge{
    int start, end, time;
    public Edge(int start, int end, int time){
        this.start = start;
        this.end = end;
        this.time = time;
    }

}