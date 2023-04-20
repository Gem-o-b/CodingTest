package src.Lv1.q68935;

class Solution {
    public int solution(int n) {
        return Integer.parseInt(new StringBuilder(String.valueOf(Integer.toString(n,3))).reverse().toString(),3);
    }

}

public class Main {
    public static void main(String[] args) {
        int n =125;
        Solution solution = new Solution();
        System.out.println(solution.solution(n));
    }

}
