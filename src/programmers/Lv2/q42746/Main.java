package src.programmers.Lv2.q42746;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public String solution(int[] numbers) {
        String answer = "";
        List<Integer> list = new ArrayList<>();
        for (int number : numbers)
            list.add(number);

        while (list.size() > 0) {
            int max = list.get(0);
            String str = "";
            String maxStr = "";
            int remove = 0;

            for (int i = 1; i < list.size(); i++) {
                int num = list.get(i);
                str = Integer.toString(num);
                maxStr = Integer.toString(max);
                if (str.length() > maxStr.length()) {
                    while (str.length() > maxStr.length()) {
                        maxStr = maxStr + "0";
                    }
                } else if (str.length() < maxStr.length()) {
                    while (str.length() < maxStr.length()) {
                        str = str + "0";
                    }
                }
                if (Integer.parseInt(maxStr) < Integer.parseInt(str)) {
                    max = num;
                    remove = i;
                }
            }
            list.remove(remove);
            answer += max;
        }


        return answer;
    }

    public String roop(List<Integer> list, String answer) {
        if (list.size() == 1) {
            return answer+list.get(0);
        }
        int max = list.get(0);
        String str = "";
        String maxStr = "";
        Integer remove = 0;

        for (int i = 1; i < list.size(); i++) {
            int num = list.get(i);
            str = Integer.toString(num);
            maxStr = Integer.toString(max);
            if (str.length() > maxStr.length()) {
                while (str.length() > maxStr.length()) {
                    maxStr = maxStr + "0";
                }
            } else if (str.length() < maxStr.length()) {
                while (str.length() < maxStr.length()) {
                    str = str + "0";
                }
            }
            if (Integer.parseInt(maxStr) < Integer.parseInt(str)) {
                max = num;
                remove = i;
            }
        }
        list.remove(remove);
        return roop(list, answer += max);
    }
}


public class Main {
    public static void main(String[] args) {
        int[] n = {3, 30, 34, 5, 9};
//        int[] n = {6, 10, 2};
        Solution solution = new Solution();
        System.out.println(solution.solution(n));
//        System.out.println(Arrays.toString(solution.solution(n)));
    }

}
