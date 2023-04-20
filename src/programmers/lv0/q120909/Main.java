package src.lv0.q120909;

class Solution {
    public int solution(int n) {
//        int answer = 2;
//        int i =0;
//        while (i*i <= n){
//            if (i*i ==n){
//                answer=1;
//            }
//            i++;
//        }

        return Math.sqrt(n)%1==0?1:2;

    }
}

public class Main {
    public static void main(String[] args) {
        int i =144;
        Solution solution = new Solution();
        System.out.println(solution.solution(i));
    }

}
