package src.Lv1.q12910;

import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] tmp = {-1};
        int[] answer= Arrays.stream(arr).filter(i->i%divisor==0).sorted().toArray();

        return answer.length==0?tmp:answer;
    }
    public int[] solution2(int[] arr, int divisor) {
        int[] answer ={};
        ArrayList<Integer> a1 = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if(arr[1]%divisor ==0) {
                a1.add(arr[i]);
            }
        }
        if(a1.isEmpty()){
            a1.add(-1);
        }
        answer = new int[a1.size()];
        for (int i =0; i<a1.size();i++){
            answer[i] = a1.get(i);
        }
        Arrays.sort(answer);

        return answer;

    }
}

public class Main {
    public static void main(String[] args) {
//        int[] arr = {5,9,7,10};
//        int[] arr={3,2,6};
            int[] arr = {2, 36, 1, 3};
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.solution(arr,1)));
    }

}
