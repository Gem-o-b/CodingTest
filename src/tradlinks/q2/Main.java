package src.tradlinks.q2;

import java.util.ArrayList;

class Solution {
    static boolean[] visited;
    static int answer =0;
    static int[] wordLength;
    static ArrayList<Integer>[] A;
    public int solution(int n,int[][] relation, String[] dirname) {
        A = new ArrayList[n+1];
        wordLength = new int[n+1];
        visited = new boolean[n+1];
        for (int i = 1; i <= n; i++) {
            A[i] = new ArrayList<>();
        }
        for (int i = 0; i < n; i++) {
            wordLength[i+1] = dirname[i].length();
        }
        for (int i = 0; i < relation.length; i++) {
            int S = relation[i][0];
            int E = relation[i][1];
            A[S].add(E);
        }
        DFS(1,0);

        return answer;
    }
    public static int DFS(int n,int tmp){
        if(visited[n]) return tmp-1;
        visited[n] = true;
        tmp += wordLength[n];
        for (int i : A[n]) {
            if (!visited[i]){

                int tmp2 = DFS(i,tmp+1);
                if (tmp2 > answer){
                    answer = tmp2;
                }
            }
        }
        return tmp;
    }
}


public class Main {
    public static void main(String[] args) {
        int n = 7;
        int[][] relation = {{1,2},{2,5},{2,6},{1,3},{1,4},{3,7}};
        String[] dirname = {"root","abcd","cs","hello","etc","hello","solution"};
        Solution solution = new Solution();
        System.out.println(solution.solution(n,relation,dirname));
//        System.out.println(Arrays.toString(solution.solution(n)));
    }

}
