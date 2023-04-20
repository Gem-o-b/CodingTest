package src.Lv1.q12906;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int[] solution(int []arr) {
        int[] answer = {};
        List<Integer> list = new ArrayList<>();
        list.add(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            if(list.get(list.size()-1)==arr[i]){
                continue;
            }else{
                list.add(arr[i]);
            }
        }

        return list.stream().mapToInt(i->i).toArray();
    }
}

public class Main {
    public static void main(String[] args) {
        int[] arr = {1,1,3,3,0,1,1};
        Solution solution = new Solution();
//        System.out.println(solution.solution(n));
        System.out.println(Arrays.toString(solution.solution(arr)));
    }

}
