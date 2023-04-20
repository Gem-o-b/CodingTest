package src.Lv1.q12917;

import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public String solution(String s) {
        char[] c = s.toCharArray();
        Arrays.sort(c);
        StringBuilder br = new StringBuilder();
        for(char str:c){
            br.append(str);
        }
        return br.reverse().toString();
    }
}

public class Main {
    public static void main(String[] args) {
        String s = "Zbcdefg";
        Solution solution = new Solution();
        System.out.println(solution.solution(s));
//        System.out.println(Arrays.toString(solution.solution(n)));
    }

}
