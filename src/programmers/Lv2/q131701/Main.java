package src.programmers.Lv2.q131701;

import java.util.HashSet;
import java.util.Set;

class Solution {
    public int solution(int[] elements) {
        Set<Integer> sumSet = new HashSet<>();

        for (int i = 0; i < elements.length; i++) {
            int start = 0;
            int end = start + i;
            int sum = 0;
            for (int j = 0; j <= end; j++) {
                sum += elements[j];
            }
            sumSet.add(sum);
            while (start < elements.length-1) {
                start++;
                end++;
                if (end > elements.length-1)
                    end -= elements.length;
                sum = start==end ? elements[start] : sum - elements[start-1] + elements[end];
                sumSet.add(sum);
            }
        }
        return sumSet.size();
    }
}


public class Main {
    public static void main(String[] args) {
        int[] n = {7, 9, 1, 1, 4};
        Solution solution = new Solution();
        System.out.println(solution.solution(n));
//        System.out.println(Arrays.toString(solution.solution(n)));
    }

}
