package src.Lv1.q12940;

import java.util.Arrays;



class Solution {
    public int[] solution(int n, int m) {

        if (n > m ){
            int tmp =0;
            tmp = n;
            n = m;
            m= tmp;
        }
        int[] answer = {min(n,m),max(n,m)};
        return answer;
    }

    public int min(int n , int m ){
        int tmp =0;
        while(n !=0){
                tmp = m%n;
                m = n;
                n = tmp;
        }
        return m;
    }
    public int max(int n, int m ){
        return n*m/min(n,m);
    }


}

public class Main {
    public static void main(String[] args) {
        int n = 3;
        int m = 12;
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.solution(n,m)));
//        System.out.println(Arrays.toString(solution.solution(n)));
    }

}
