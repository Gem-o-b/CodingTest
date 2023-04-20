package src.Lv1.q42576;

import java.util.Arrays;

class Solution {
    public String solution(String[] participant, String[] completion) {
//        Arrays.stream(participant).filter(s->Arrays.stream(completion).noneMatch(Predicate.isEqual(s))).forEach(System.out::println);
//        동명이인의 값때문에 적용할 수 없음

//        효율성 테스트 탈락
//        String answer = "";
//        boolean noData ;
//        for(String name:participant){
//            noData = true;
//            for (int i = 0; i < completion.length; i++) {
//                if (name.equals(completion[i])){
//                    noData = false;
//                    completion[i] ="";
//                    break;
//                }
//            }
//            if(noData == true){
//                answer = name;
//                break;
//            }
//        }
//
//
//        return answer;

//        실제값은 잘나오는데 왜인지 모르지만 제출 후 실패
//        String answer = "";
//        Arrays.sort(participant);
//        Arrays.sort(completion);
//        for (int i = 0; i < completion.length; i++) {
//            answer = participant[completion.length];
//            if (!participant[i].equals(completion[i])){
//                answer = participant[i];
//            }
//        }
//
//        return answer;

        String answer = "";
        Arrays.sort(participant);
        Arrays.sort(completion);
        answer = participant[completion.length];
        for (int i = 0; i < completion.length; i++) {
            if(!participant[i].equals(completion[i])){
                answer = participant[i];
                break;//이거 있고 없고 차이큼
            }
        }

        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        String[] participant = {"leo", "kiki", "eden"};
        String[] completion = {"eden", "kiki"};
//        String[] participant = {"marina", "josipa", "nikola", "vinko", "filipa"};
//        String[] completion = {"josipa", "filipa", "marina", "nikola"};
//        String[] participant = {"mislav", "stanko", "mislav", "ana"};
//        String[] completion = {"stanko", "ana", "mislav"};
        Solution solution = new Solution();
        System.out.println(solution.solution(participant,completion));
    }

}
