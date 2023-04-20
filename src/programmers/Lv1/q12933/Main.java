package src.Lv1.q12933;

import java.util.Arrays;

import java.util.Comparator;


class Solution {
    public long solution(long n) {
        long answer=0;

//        while(n>0){
//            answer *= 10;
//            answer += n%10;
//            n /=10;
//
//        }

//        answer = Arrays.stream(String.valueOf(n).split("")).mapToLong(i->Long.parseLong(i)).sorted();
//        String[] a = Arrays.stream(String.valueOf(n).split("")).mapToLong(i->Long.parseLong(i)).sorted();
//        Arrays.stream(String.valueOf(n).split("")).sorted(Comparator.reverseOrder()).mapToLong(i->Long.parseLong(i));
//        System.out.println(Arrays.toString(a));
        long[] arr = Arrays.stream(String.valueOf(n).split("")).sorted(Comparator.reverseOrder()).mapToLong(i->Long.parseLong(i)).toArray();
        for (int i = 0; i < arr.length; i++) {
            answer *= 10;
            answer += arr[i];
        }
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        long n =118372;
        Solution solution = new Solution();
        System.out.println(solution.solution(n));
    }

}
