package src.exam.mega.num1;

class Solution {
    static int[][] arr;
    public int solution(int h, int w, int n, String[] board) {
        int answer=0;
        boolean check;
        arr = new int[h][w];
        for (int i = 0; i < h ; i++) {
            for (int j = 0; j < w ; j++) {
                arr[i][j] = Integer.parseInt(board[i].substring(j, j+1));
            }
        }
        for (int i = 0; i < h ; i++) {
            for (int j = 0; j < w ; j++) {

                //가로
                check = false;
                if (arr[i][j] == 1){
                    if (j+n < w){
                        check=true;
                        for (int k = 1; k < n; k++) {
                            if (arr[i][j+k] == 0){
                                check=false;
                                break;
                            }
                        }
                        if (j-1 >= 0){
                            if (arr[i][j-1] == 1){
                                check= false;

                            }
                        }
                        if (j+1 < w){
                            if (arr[i][j+n] == 1){
                                check = false;

                            }
                        }
                    }
                }
                if (check) answer++;

                //세로
                check = false;
                if (arr[i][j] == 1){
                    if (i+n < h){
                        check=true;
                        for (int k = 1; k < n; k++) {
                            if (arr[i+k][j] == 0){
                                check=false;
                                break;
                            }
                        }
                        if (i-1 >= 0){
                            if (arr[i-1][j] == 1){
                                check= false;

                            }
                        }
                        if (i+1 < h){
                            if (arr[i+n][j] == 1){
                                check = false;

                            }
                        }
                    }
                }
                if (check) answer++;

                //오른아래
                check = false;
                if (arr[i][j] == 1){
                    if (i+n < h && j+n < w){
                        check=true;
                        for (int k = 1; k < n; k++) {
                            if (arr[i+k][j+k] == 0){
                                check=false;
                                break;
                            }
                        }
                        if (i-1 >= 0 && j-1 >= 0){
                            if (arr[i-1][j-1] == 1){
                                check= false;

                            }
                        }
                        if (i+1 < h && j+1 < w){
                            if (arr[i+n][j+n] == 1){
                                check = false;

                            }
                        }
                    }
                }

            }
        }
        return answer;
    }


}


public class Main {
    public static void main(String[] args) {
//        int h = 5;
//        int w = 5;
//        int n = 5;
//        String[] board = {"11111","11111","11111","11111","11111"};
        int h = 7;
        int w = 9;
        int n = 4;
        String[] board = {"111100000","000010011","111100011","111110011","111100011","111100010","111100000"};
        Solution solution = new Solution();
        System.out.println(solution.solution(h,w,n,board));
//        System.out.println(Arrays.toString(solution.solution(n)));
    }

}
