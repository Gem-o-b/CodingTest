package src.exam.mega.num2;

import java.util.HashSet;

class Solution {
    public int solution(int[][] balloons) {
        int answer = 0;
        HashSet<Float>[] set = new HashSet[4];
        for (int i = 0; i < 4; i++) {
            set[i] = new HashSet<>();
        }
        for (int i = 0; i < balloons.length; i++) {
            float x = balloons[i][0];
            float y = balloons[i][1];

            if (x <0 && y >0 ){
                set[0].add(x / y);
            }else if (x >0 && y >0 ){
                set[1].add(x / y);
            }else if (x <0 && y <0 ){
                set[2].add(x / y);
            }else{
                set[3].add(x / y);
            }
        }
        for (int i = 0; i < 4; i++) {
            answer += set[i].size();
        }
        return answer;
    }

}


public class Main {
    public static void main(String[] args) {
        int[][] balloons = {{2,2},{4,4},{1,4},{-1,-4}};

        Solution solution = new Solution();
        System.out.println(solution.solution(balloons));
//        System.out.println(Arrays.toString(solution.solution(n)));
    }

}
