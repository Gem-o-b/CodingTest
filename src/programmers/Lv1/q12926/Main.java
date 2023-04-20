package src.Lv1.q12926;

class Solution {
    public String solution(String s, int n) {
        String answer = "";

        for (int i = 0; i < s.length(); i++) {
            int tmp=0;
            if (s.charAt(i)==' '){
               answer += ' ';
            }else if (Character.isUpperCase(s.charAt(i))){
               tmp = (int)s.charAt(i)+n;
               while (tmp > 90){
                   tmp -= 26;
               }
               answer += String.valueOf((char)tmp);
            }else{
                tmp = (int)s.charAt(i)+n;
                while (tmp > 122){
                    tmp -= 26;
                }
                answer += String.valueOf((char)tmp);
            }

        }



        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        String s="AB";
        int n = 1;
        Solution solution = new Solution();
        System.out.println(solution.solution(s,n));
//        System.out.println(Arrays.toString(solution.solution(n)));
    }

}
