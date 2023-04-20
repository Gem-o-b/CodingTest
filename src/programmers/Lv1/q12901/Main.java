package src.Lv1.q12901;


import java.time.LocalDate;

class Solution {
    public String solution(int a, int b) {
        LocalDate ld = LocalDate.of(2016,a,b);
        int date = ld.getDayOfWeek().getValue();
        switch (date){
            case 1:
                return "MON";
            case 2:
                return "TUE";
            case 3:
                return "WED";
            case 4:
                return "THU";
            case 5:
                return "FRI";
            case 6:
                return "SAT";
            case 7:
                return "SUN";
        }
        return "ERR";

//        return LocalDate.of(2016, a, b).getDayOfWeek().toString().substring(0,3);
    }

    public String solution2(int a, int b) {
        String answer = "";
        int[] month ={31,29,31,30,31,30,31,31,30,31,30,31};
        String[] date = {"FRI","SAT","SUN","MON","TUE","WED","THU"};
        int total = 0; //총날짜
        for (int i = 0; i < a-1; i++) {
            total=total+month[i];
        }
        total=total+b-1; //모든일자 더하기
        answer = date[total%7]; //7로나눈 배열의 번지수
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        int n =5;
        int z = 24;
        Solution solution = new Solution();
        System.out.println(solution.solution2(n,z));
    }

}
