package src.Lv1.q86491;

import java.util.Arrays;

class Solution {
    public int solution(int[][] sizes) {

        int max1 = 0;
        int max2 = 0;
        for (int i = 0; i < sizes.length; i++) {
            sizes[i] = Arrays.stream(sizes[i]).sorted().toArray();
            if (max1 < sizes[i][0]){
                max1 = sizes[i][0];
            }
            if (max2 < sizes[i][1]){
                max2 = sizes[i][1];
            }
        }



        return max1*max2;
    }
}

public class Main {
    public static void main(String[] args) {
        int[][] sizes = {{60, 50}, {30, 70}, {60, 30}, {80, 40}};
        Solution solution = new Solution();
        System.out.println(solution.solution(sizes));
    }

}
