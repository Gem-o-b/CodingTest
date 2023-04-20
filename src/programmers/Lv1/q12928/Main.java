package src.Lv1.q12928;


import java.util.stream.IntStream;

class Solution {
    public int solution(int n) {


        return IntStream.rangeClosed(1,n).filter(i->n%i==0).sum();
    }
}

public class Main {
    public static void main(String[] args) {
        int n =12;
        Solution solution = new Solution();
        System.out.println(solution.solution(n));
    }

}
