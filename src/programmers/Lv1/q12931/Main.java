
package src.Lv1.q12931;

import java.util.Arrays;
import java.util.stream.Stream;

class Solution {
    public int solution(int n) {


        return Arrays.stream(String.valueOf(n).split("")).mapToInt(i->Integer.parseInt(i)).sum();
    }
}

public class Main {
    public static void main(String[] args) {
        int n =987;
        Solution solution = new Solution();
        System.out.println(solution.solution(n));
    }

}
