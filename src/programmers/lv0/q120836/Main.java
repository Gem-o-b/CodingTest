package src.lv0.q120836;

import java.util.stream.IntStream;

class Solution {
    public int solution(int n) {

        return (int) IntStream.rangeClosed(1,n).filter(i->n%i==0).count();

    }
}

public class Main {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int n = 100;
        System.out.println(solution.solution(n));
    }

}
