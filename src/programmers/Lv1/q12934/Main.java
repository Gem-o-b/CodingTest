package src.Lv1.q12934;

class Solution {
    public long solution(long n) {
        long answer = -1;
        long i =0;
        while(i<=n){
            if (i*i ==n){
                answer = (i+1)*(i+1);
                break;
            }
            i ++;
        }
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        long n =196;
        Solution solution = new Solution();
        System.out.println(solution.solution(n));
    }

}
