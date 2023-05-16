package src.backjun.q1197;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;


public class Main {
    static int[] parent ;
    static int cnt = 0;
    static PriorityQueue<Edge> queue;
    static int result;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(stringTokenizer.nextToken());
        int M = Integer.parseInt(stringTokenizer.nextToken());

        Edge[] edges = new Edge[M+1];
        queue = new PriorityQueue<>();
        parent = new int[N+1];
        for (int i = 1; i <= N; i++) {
            parent[i] = i;
        }

        for (int i = 1; i <= M; i++) {
            stringTokenizer = new StringTokenizer(br.readLine());
            int S = Integer.parseInt(stringTokenizer.nextToken());
            int E = Integer.parseInt(stringTokenizer.nextToken());
            int D = Integer.parseInt(stringTokenizer.nextToken());
            queue.add(new Edge(S,E,D));
        }

        while (cnt != N-1){
            Edge edge = queue.poll();
            if (union(edge.start, edge.end)){
                result += edge.distance;
            }
        }
        System.out.println(result);

    }

    static boolean union (int S, int E){
        int first = find(S);
        int second = find(E);
        if (first == second) return false;
        if (first < second) parent[second] = first;
        else parent[first] = second;
        cnt++;
        return true;

    }

    static int find (int S){
        if (S == parent[S]) return S;
        parent[S] = find(parent[S]);
        return parent[S];
    }


}

class Edge implements Comparable<Edge>{
    int start, end, distance;
    public Edge(int start, int end, int distance){
        this.start = start;
        this.end = end;
        this.distance = distance;
    }

    @Override
    public int compareTo(Edge o) {
        return this.distance -o.distance;
    }

}