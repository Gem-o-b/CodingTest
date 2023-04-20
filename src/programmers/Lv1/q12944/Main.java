package src.Lv1.q12944;

import java.util.Arrays;
import java.util.stream.IntStream;

class Solution {
    public double solution(int[] arr) {

//        return  (double)Arrays.stream(arr).sum()/arr.length;
        return Arrays.stream(arr).average().getAsDouble();
    }
}

public class Main {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        Solution solution = new Solution();
        System.out.println(solution.solution(arr));
    }

}
