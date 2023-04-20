package src.Lv1.q12943;

class Solution {
    public long solution(long num) {
        int answer = 0;
        while (true){
            if(num ==1){
                break;
            }
            num = num%2==0?num/2:(num*3)+1;
            answer++;
            if (answer == 500){
                answer = -1;
                break;
            }

        }
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        int n =6;
        Solution solution = new Solution();
        System.out.println(solution.solution(n));
    }

}
