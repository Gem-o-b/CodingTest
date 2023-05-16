package src.exam.uteco.num1;

import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public long solution(int[] boxes, int m, int k) {
        for (int i = 0; i < k; i++) {
            Arrays.sort(boxes);
            int pay = 0;
            for (int j = boxes.length-1 ; j >= 0 ; j--) {
                pay = boxes[j] * (m  / 10000);
                if (pay <= 100000){
                    m += pay;
                    break;
                }
            }
        }
        return m;
    }
}

public class Main {
    public static void main(String[] args) {
        int[] boxes = {1000,800,900};
        int m = 1000000;
        int k = 3;
//        int[] boxes = {9000,10000,8520,9500};
//        int m = 110000;
//        int k = 4;
        Solution solution = new Solution();
        System.out.println(solution.solution(boxes,m,k));
//        System.out.println(Arrays.toString(solution.solution(n)));
    }

}
