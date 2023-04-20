package src.Lv1.q1845;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int solution(int[] nums) {

        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(map.size() >= nums.length/2){
                break;
            }
            map.put(nums[i],i);
        }
        return map.size();
    }
}

public class Main {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6};
        Solution solution = new Solution();
        System.out.println(solution.solution(nums));
//        System.out.println(Arrays.toString(solution.solution(n)));
    }

}
