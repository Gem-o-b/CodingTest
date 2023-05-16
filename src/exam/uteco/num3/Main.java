package src.exam.uteco.num3;

import java.util.ArrayList;
import java.util.Arrays;


class Solution {
    static ArrayList<Integer>[] A;
    static int[][] boardArr ;
    static boolean[][] visited;
    static int[] dy = {-1, -1, 0, 1, 1, 1, 0, -1}; // 좌상부터 시계방향
    static int[] dx = {0, -1, -1, -1, 0, 1, 1, 1};
    public String[] solution(String[] board,int y, int x) {
        if (board[y].substring(x,x+1).equals("M")){
           board[y] = board[y].substring(0,x)+"X"+board[y].substring(x+1);
        }
        int xsize = board[0].length();
        int ysize = board.length;
        boardArr = new int[ysize][xsize];
        visited = new boolean[ysize][xsize];
        for (int i = 0; i < ysize; i++) {
            for (int j = 0; j < xsize; j++) {
                if (board[i].substring(j,j+1).equals("M")){
                    boardArr[i][j] = -1;
                    for (int k = 0; k < 8; k++) {
                        if (i+dy[k] < 0 || i+dy[k] >= ysize || j+dx[k] <0 || j+dx[k] >= xsize) continue;
                        boardArr[i+dy[k]][j+dx[k]] += 1;
                    }
                }
            }
        }
        DFS(y,x);
        return board;
    }

    private void DFS(int y, int x) {
        if (visited[y][x]) return;
        visited[y][x] = true;
        for (int i = 0; i < i; i++) {

        }
    }
}


public class Main {
    public static void main(String[] args) {
        String[] board = {"EEEEE","EEMEE","EEEEE","EEEEE"};
        int y = 1;
        int x = 2;
        Solution solution = new Solution();
//        System.out.println(solution.solution(board,y,x));
        System.out.println(Arrays.toString(solution.solution(board,y,x)));
    }

}
