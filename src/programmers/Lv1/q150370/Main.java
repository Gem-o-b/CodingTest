package src.programmers.Lv1.q150370;

import java.util.*;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        int[] answer = {};
        Map<String, Integer> termMap = new HashMap<>();
        List<Integer> answerList = new ArrayList<>();
        for (String term : terms) {
            String[] split = term.split(" ");
            String type = split[0];
            int termMonth = Integer.parseInt(split[1]);
            termMap.put(type, termMonth);
        }

        for (int i = 0; i < privacies.length; i++) {
            String privacy = privacies[i];
            String[] split = privacy.split(" ");
            String date = split[0];
            String type = split[1];
            int dateY = Integer.parseInt(date.split("\\.")[0]);
            int dateM = Integer.parseInt(date.split("\\.")[1]);
            int dateD = Integer.parseInt(date.split("\\.")[2]);
            int termM = termMap.get(type);
            int addY = (dateM + termM) / 13;
            dateM = (dateM + termM) % 12 == 0 ? 12 : (dateM + termM) % 12;
            dateY = dateY + addY;

            String formatDate = String.format("%04d%02d%02d", dateY, dateM, dateD);
            if (Integer.parseInt(today.replace(".","")) >=  Integer.parseInt(formatDate))
                answerList.add(i+1);
        }

        answer = answerList.stream().mapToInt(i -> i).toArray();

        return answer;
    }

}


public class Main {
    public static void main(String[] args) {
//        String today = "2022.05.19";
//        String[] terms = {"A 6", "B 12", "C 3"};
//        String[] privacies = {"2021.05.02 A", "2021.07.01 B", "2022.02.19 C", "2022.02.20 C"};
        String today = "2020.01.01";
        String[] terms = {"Z 3", "D 5"};
        String[] privacies = {"2019.01.01 D", "2019.11.15 Z", "2019.08.02 D", "2019.07.01 D", "2018.12.28 Z"};

        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.solution(today, terms, privacies)));
//        System.out.println(Arrays.toString(solution.solution(n)));
    }

}
