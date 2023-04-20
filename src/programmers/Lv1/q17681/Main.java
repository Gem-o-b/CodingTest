package src.Lv1.q17681;

import java.util.Arrays;

class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        String[] arr1to2 = new String[n];
        String[] arr2to2 = new String[n];

        for (int i = 0; i < n; i++) {
            answer[i] ="";
            arr1to2[i] = "0".repeat(n-Integer.toString(arr1[i],2).length())+Integer.toString(arr1[i],2);
            arr2to2[i] = "0".repeat(n-Integer.toString(arr2[i],2).length())+Integer.toString(arr2[i],2);
            for (int j = 0; j < arr1to2[i].length(); j++) {

                if(arr1to2[i].charAt(j)=='1'||arr2to2[i].charAt(j)=='1'){
                    answer[i] +="#";
                }else{
                    answer[i] +=" ";
                }
            }

        }


        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        int n = 5;
        int[] arr1 = {9, 20, 28, 18, 11};
        int[] arr2 = {30, 1, 21, 17, 28};
        Solution solution = new Solution();
//        System.out.println(solution.solution(n));
        System.out.println(Arrays.toString(solution.solution(n,arr1,arr2)));
    }

}
