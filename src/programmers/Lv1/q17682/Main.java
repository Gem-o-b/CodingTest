package src.Lv1.q17682;

import java.util.Arrays;

class Solution {
    public int solution(String dartResult) {



        int answer = 0;
        int score[] = new int[3];
        int cur = 0;
        int idx = 0;
        String num = "";

        for(int i=0; i<dartResult.length(); i++){
            char ch = dartResult.charAt(i);

            if(ch >= '0' && ch <= '9'){
                num += String.valueOf(ch);
            }else if (ch == 'S' || ch == 'D' || ch == 'T') {
                cur = Integer.parseInt(num);
                if (ch == 'S') {
                    cur = (int) Math.pow(cur, 1);
                } else if (ch == 'D') {
                    cur = (int) Math.pow(cur, 2);
                } else {
                    cur = (int) Math.pow(cur, 3);
                }
                score[idx++] = cur;
                num = "";
            } else {
                if (ch == '#') {
                    score[idx - 1] *= -1;
                } else {
                    score[idx - 1] *= 2;
                    if (idx - 2 >= 0) {
                        score[idx - 2] *= 2;
                    }
                }
            }
        }

        for (int i = 0; i < score.length; i++) {
            answer += score[i];
        }

        return answer;






//
//
//        int beforeSocre=0;
//        int totalScore=0;
//        int nowScore=0;
//        int splitCount=-1;
//        String numTmp="";
//        String[] tmp ={"ab","cd","ef"};
//        String[] stringTmp = {"","",""};
//        for (int i = 0; i < dartResult.length(); i++) { //세번의 다트 점수를 분리
//            numTmp = String.valueOf(dartResult.charAt(i));
//            if(Character.isDigit(dartResult.charAt(i))){
//                if(dartResult.charAt(i)=='1'&&dartResult.charAt(i+1)=='0'){
//                    continue;
//                }
//                if(dartResult.charAt(i)==0){
//                   numTmp = "10";
//                }
//                splitCount++;
//
//                stringTmp[splitCount] += numTmp;
//            }else {
//                stringTmp[splitCount] += numTmp;
//            }
//        }
//        for (int i = 0; i < 3; i++) {
//            String s = String.valueOf(stringTmp[i].charAt(1));
//            if (Character.getNumericValue(stringTmp[i].charAt(0))==1&&Character.getNumericValue(stringTmp[i].charAt(1))==0){
//
//            }
//            int t =Character.getNumericValue(stringTmp[i].charAt(0));
//            if(s.equals("S")){
//                nowScore = t;
//
//            }else if(s.equals("D")){
//                nowScore = (int)Math.pow(t,2);
//            }else{
//                nowScore = (int)Math.pow(t,3);
//
//            }
//
//            if(stringTmp[i].length()==3){
//                if(String.valueOf(stringTmp[i].charAt(2)).equals("*")){
//
//                    totalScore += (nowScore*2)+beforeSocre;
//                    System.out.println("ok : " +beforeSocre);
//                }else{
//                    totalScore -= nowScore;
//                }
//            }else{
//                totalScore += nowScore;
//            }
//            beforeSocre = nowScore;
//            System.out.println(totalScore);
//        }
//
//
//        return totalScore;
    }
}

public class Main {
    public static void main(String[] args) {
//        String dartResult = "1S*2T*3S";
        String dartResult = "1D2S#10S";
//        String dartResult ="1S2D*3T";
        Solution solution = new Solution();
        System.out.println(solution.solution(dartResult));
//        System.out.println(Arrays.toString(solution.solution(n)));
    }

}
