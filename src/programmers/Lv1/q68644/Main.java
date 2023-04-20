package src.Lv1.q68644;

import java.util.Arrays;

class Solution {
    public int[] solution(int[] numbers) {
        int arrCnt = 0;
        for (int i = 0; i < numbers.length; i++) {
             arrCnt +=i;
        }

        int[] answer = new int[arrCnt];
        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i+1; j < numbers.length; j++) {
                answer[count] = numbers[i]+numbers[j];
                count++;
            }

        }

        return Arrays.stream(answer).distinct().sorted().toArray();
    }
}

public class Main {
    public static void main(String[] args) {
        int[] numbers = {2,1,3,4,1};
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.solution(numbers)));
    }

}
