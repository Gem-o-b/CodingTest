package src.Lv1.q12939;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        List<Integer> list = new ArrayList<>();
        String[] str = s.split(" ");

        for (int i = 0; i < str.length; i++) {
            list.add(Integer.parseInt(str[i]));
        }
        Collections.sort(list);


        sb.append(list.get(0)+" "+list.get(list.size()-1));

        return sb.toString();
    }
    public String solution2(String s) {
        StringBuilder sb = new StringBuilder();
        sb.append(Arrays.stream(s.split(" ")).mapToInt(Integer::parseInt).min().getAsInt()+" "+Arrays.stream(s.split(" ")).mapToInt(Integer::parseInt).max().getAsInt());
        return sb.toString();
    }
}

public class Main {
    public static void main(String[] args) {
        String s = "1 2 3 4";
        Solution solution = new Solution();
        System.out.println(solution.solution2(s));
//        System.out.println(Arrays.toString(solution.solution(s)));
    }

}
