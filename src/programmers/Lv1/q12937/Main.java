package src.Lv1.q12937;

class Solution {
    public String solution(int num) {
        String answer = "Odd";
        if (num%2==0){
            answer = "Even";
        }
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        int num =3;
        Solution solution = new Solution();
        System.out.println(solution.solution(num));
    }

}
