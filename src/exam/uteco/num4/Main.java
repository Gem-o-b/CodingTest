package src.exam.uteco.num4;

import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    static ArrayList<Integer>[] A;
    static boolean[] visited;

    public int solution(int n, int[][] network, int[][] repair) {
        int count =0;
        int cost = 0;
        Arrays.sort(repair,(o1,o2)->{
            return o1[2]-o2[2];
        });
        A = new ArrayList[n+1];
        visited = new boolean[n+1];

        for (int i = 0; i < repair.length; i++) {
            count = 0;
            for (int j = 1; j <= n; j++) {
                A[j] = new ArrayList<>();
                visited[j] = false;
            }
            for (int j = 0; j < network.length; j++) {
                int S = network[j][0];
                int E = network[j][1];
                A[S].add(E);
                A[E].add(S);
            }
            A[repair[i][0]].add(repair[i][1]);
            A[repair[i][1]].add(repair[i][0]);
            for (int j = 1; j <= n; j++) {
                if (!visited[j]){
                    count++;
                    DFS(j);
                }
            }
            if (count == 1){
                cost = repair[i][2];
                break;
            }
        }
        if (cost ==0){
            cost = -1;
        }
        return cost;
    }

    private void DFS(int i) {
        if (visited[i]) return;
        visited[i] = true;
        for (int z : A[i]) {
            DFS(z);
        }
    }
}


public class Main {
    public static void main(String[] args) {
//        int n = 6;
//        int[][] network = {{1,2},{3,5},{4,2},{5,6}};
//        int[][] repair = {{3,2,10},{5,4,15}};
        int n = 4;
        int[][] network = {{1,2}};
        int[][] repair = {{2,3,10},{3,1,12}};
        Solution solution = new Solution();
        System.out.println(solution.solution(n, network, repair));
//        System.out.println(Arrays.toString(solution.solution(n)));
    }

}
