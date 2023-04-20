package src.lv0.q120862;

import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
        int[] minus = Arrays.stream(numbers).filter(i->i<0).sorted().toArray();
        int[] plus = Arrays.stream(numbers).filter(i->i>=0).sorted().toArray();
        int minusMul = 0;
        int plusMul = 0;
        if(minus.length>1){
            minusMul = minus[0]*minus[1];
        }
        if(plus.length>1){
            plusMul = plus[plus.length-1]*plus[plus.length-2];
        }
        if(minusMul==0&&plusMul==0){
            minusMul = minus[0]*plus[0];
            plusMul=minusMul;
        }


        return plusMul >= minusMul?plusMul:minusMul;
        //다른사람의 답
//        Arrays.sort(numbers);
//        return Math.max(numbers[0] * numbers[1], numbers[numbers.length - 2] * numbers[numbers - 1]);
    }
}

public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, -5,-3,-1,5,7};
        Solution solution = new Solution();
        System.out.println(solution.solution(numbers));
    }

}
