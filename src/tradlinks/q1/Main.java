package src.tradlinks.q1;

import java.util.Arrays;

class Solution {
    public long[] solution(long n)
    {

        long[] num = new long[2];
        long tmp = n % 7;
        num[0] += (n /7)*2;
        num[1] += (n /7)*2;

        if (tmp == 6){
            num[0]++;
        }
        if(tmp > 1 ){
            num[1] +=2;
        }else if(tmp == 1){
            num[1]++;
        }
        return num;
    }
}


public class Main {
    public static void main(String[] args) {
        long n = 15;
        Solution solution = new Solution();
//        System.out.println(solution.solution(n));
        System.out.println(Arrays.toString(solution.solution(n)));
    }

}
