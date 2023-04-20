package src.Lv1.q64061;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < moves.length ; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.println("moves : " +moves[i]+" i : "+i+" j : "+j +" br : "+board[j][moves[i]-1]);
                if(board[j][moves[i]-1]!=0){
                    if(list.size()>0){
                        System.out.println(board[j][moves[i]-1]+" ,"+list.get(list.size()-1));
                        if(board[j][moves[i]-1] == list.get(list.size()-1)){

                            list.remove(list.size()-1);
                            board[j][moves[i]-1]=0;
                            answer+=2;
                            break;
                        }else{

                            list.add(board[j][moves[i]-1] );
                            System.out.println("del : "+board[j][moves[i]-1]);
                            board[j][moves[i]-1]=0;

                            break;
                        }
                    }else{

                        list.add(board[j][moves[i]-1] );
                        board[j][moves[i]-1]=0;
                        break;
                    }

                }
                System.out.println(Arrays.deepToString(board));
            }
            System.out.println(list+" cnt : "+answer);
        }



        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
//        int[][] board = {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
//        int[][] board = {{0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}};
        int[][] board = {{0, 0, 0, 0, 0}, {0, 0, 1, 0, 3}, {0, 2, 5, 0, 1}, {4, 2, 4, 4, 2}, {3, 5, 1, 3, 1}};
//        int[] moves={1,5,3,5,1,2,1,4};
//        int[] moves= {1, 2,2, 3, 4,5,2};
        int[] moves= {1,5,3,5,1,2,5,1,4,3};
        Solution solution = new Solution();
        System.out.println(solution.solution(board,moves));
//        System.out.println(Arrays.toString(solution.solution(n)));
    }

}
