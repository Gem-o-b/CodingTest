package src.programmers.Lv1.q250121;

import java.util.ArrayList;
import java.util.Arrays;

import static java.util.Arrays.deepToString;

class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        int[][] answer = {};

        int sortNum = switch (sort_by) {
            case "code" -> 0;
            case "date" -> 1;
            case "maximum" -> 2;
            case "remain" -> 3;
            default -> 0;
        };

        answer = valExtCheck(data, val_ext, ext);

        Arrays.sort(answer, (o1, o2) -> {
            return o1[sortNum] - o2[sortNum];
        });

        return answer;
    }

    public int[][] valExtCheck(int[][] answer, int val_ext, String ext) {

        ArrayList<int[]> list = new ArrayList<>();

        int extNum = switch (ext) {
            case "code" -> 0;
            case "date" -> 1;
            case "maximum" -> 2;
            case "remain" -> 3;
            default -> 0;
        };

        for (int i = 0; i < answer.length; i++) {
            if (answer[i][extNum] < val_ext) {
                list.add(answer[i]);
            }
        }

        answer = list.toArray(new int[list.size()][]);

        return answer;
    }

}


public class Main {
    public static void main(String[] args) {
        int[][] data = {{1, 20300104, 100, 80}, {2, 20300804, 847, 37}, {3, 20300401, 10, 8}};
        String ext = "date";
        int val_ext = 20300501;
        String sort_by = "remain";

        Solution solution = new Solution();
        System.out.println(deepToString(solution.solution(data, ext, val_ext, sort_by)));
//        System.out.println(Arrays.toString(solution.solution(n)));
    }

}
