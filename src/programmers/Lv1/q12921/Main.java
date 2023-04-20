package src.Lv1.q12921;

import java.util.stream.IntStream;

class Solution {
    public int solution(int n) {
        //효율성 실패 테스트도 한개빼고 다 실패
//        int answer = 0;
//        for (int i = 2; i <=n ; i++) {
//
//            if (i==2||i==3||i==5||i==7){
//                answer++;
//
//            }else if (i%2!=0 && i%3!=0 && i%5!=0 && i%7!=0){
//                answer++;
//            }
//
//        }
//        return answer;
//        int answer = 0;
//
        //문제는 맞았으나 시간초과
//        for (int i = 2; i <=n ; i++) {
//            boolean check = true;
//            if (i==2||i==3||i==5||i==7){
//                answer++;
//                continue;
//            }
//            int tmp =0;
//            if(i>10){
//                tmp = i/2;
//            }else{
//                tmp = i;
//            }
//            for (int j = 2; j <tmp; j++) {
//                if(i%j==0){
//                    check = false;
//                    break;
//                }
//
//            }
//            if(check==true){
//                answer++;
//            }
//        }
//        return answer;
        int answer =0;

        for (int i = 2; i <=n ; i++) {
            if (i==2||i==3||i==5||i==7){
                answer++;
                continue;
            }
            if(check(i)){
                answer++;
            }
        }
        return answer;
    }
    public boolean check(int num){
        for (int i = 2; i*i <=num ; i++) {
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
}

public class Main {
    public static void main(String[] args) {
        int n = 5;
        Solution solution = new Solution();
        System.out.println(solution.solution(n));
//        System.out.println(Arrays.toString(solution.solution(n)));
    }

}
