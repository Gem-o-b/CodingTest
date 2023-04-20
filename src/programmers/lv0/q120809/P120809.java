package src.lv0.q120809;

import java.util.Arrays;

class Solution {
    public int[] solution(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] *=2;
        }
        return numbers;
    }
}
public class P120809 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] numbers = {1, 2, 3, 4, 5};

        System.out.println(Arrays.toString(solution.solution(numbers)));

    }

}
