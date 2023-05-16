package src.exam.mega.num4;

class Solution {
    public int solution(String n_str) {

        return Integer.parseInt(n_str);
    }
}


public class Main {
    public static void main(String[] args) {
        String my_string = "12311";
        Solution solution = new Solution();
        System.out.println(solution.solution(my_string));
//        System.out.println(Arrays.toString(solution.solution(n)));
    }

}
