package src.lv0.q120849;

class Solution {
    public String solution(String my_string) {

        my_string = my_string.replace("a","");
        my_string = my_string.replace("e","");
        my_string = my_string.replace("i","");
        my_string = my_string.replace("o","");
        my_string = my_string.replace("u","");



        return my_string;
        // answer = my_string.replaceAll("[aeiou]", ""); 다른사람의 답
    }
}

public class Main {
    public static void main(String[] args) {
        String my_string ="nice to meet you";
        Solution solution = new Solution();
        System.out.println(solution.solution(my_string));
    }

}
