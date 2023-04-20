package src.lv0.q120890;

import java.util.Arrays;

class Solution {
    public int solution(int[] array, int n) {
        Arrays.sort(array);
        int tmp =0;
        for (int i = 0; i < array.length; i++) {

            if(Math.abs(array[i]-n) < Math.abs(array[tmp]-n)){
                tmp =i;
            }
        }
        return array[tmp];
    }
}

public class Main {
    public static void main(String[] args) {
        int[] arr = { 3,10,28};
        int n =20;
        Solution solution = new Solution();
        System.out.println(solution.solution(arr,n));
    }

}
