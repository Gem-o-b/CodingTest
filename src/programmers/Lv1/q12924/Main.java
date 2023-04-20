package src.Lv1.q12924;

class Solution {
    public int solution(int n) {
        int answer = 0;
        for (int i = 1; i <= n; i++) {
            int total = 0;
            for (int j = i; j <= n; j++) {
                total += j;
                if (total > n) {
                    break;
                }
                if (total == n) {
                    answer++;
                    break;
                }
            }
        }


        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        int n = 15;
        Solution solution = new Solution();
        System.out.println(solution.solution(n));
//        System.out.println(Arrays.toString(solution.solution(n)));
    }

}
