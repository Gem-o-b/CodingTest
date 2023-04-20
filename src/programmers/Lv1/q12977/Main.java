package src.Lv1.q12977;

import java.util.*;

class Solution {
    public int solution(int[] nums) {

        //중복제거하면 안된다고 해서 실패
//        int answer = -1;
//        Set<Integer> set = new HashSet<>();
//
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = i+1; j < nums.length; j++) {
//                for (int k = j+1; k < nums.length; k++) {
//                    set.add(nums[i]+nums[j]+nums[k]);
//                }
//            }
//        }
//
//        ArrayList<Integer> list = new ArrayList<>(set);
//        System.out.println(list);
//        for (int i = 0; i < list.size() ; i++) {
//            int a = list.get(i);
//            if(a==2||a==3||a==5||a==7){
//                continue;
//            }
//            if(a%2==0||a%3==0||a%5==0||a%7==0){
//                list.remove(i);
//                i = i-1;
//            }
//        }
//
//
//        return list.size();
//        int answer = -1;
//        int count=0;
//        ArrayList<Integer> list = new ArrayList<>();
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = i+1; j < nums.length; j++) {
//                for (int k = j+1; k < nums.length; k++) {
//                    list.add(nums[i]+nums[j]+nums[k]);
//                    count++;
//                }
//            }
//        }
//
//        System.out.println(count);
//        System.out.println(list);
//        for (int i = 0; i < list.size() ; i++) {
//            int a = list.get(i);
//            if(a==2||a==3||a==5||a==7){
//                continue;
//            }
//            if(a%2==0||a%3==0||a%5==0||a%7==0){
//                list.remove(i);
//                i = i-1;
//            }
//        }
//
//        return list.size();


        int answer = 0;


        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                for (int k = j+1; k < nums.length; k++) {
                    int sw=0;

                    for (int l = 1; l <= nums[i]+nums[j]+nums[k]; l++) {
                        int a =nums[i]+nums[j]+nums[k];
                        System.out.println(a+" "+l);
                        if(a%l==0 ){

                            sw++;
                        }
                    }
                    if(sw==2){
                        answer++;
                    }
                }
            }
        }


        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        int[] nums = {1,2,7,6,4};
//        int[] nums = {1,2,3,4};
        Solution solution = new Solution();
        System.out.println(solution.solution(nums));
//        System.out.println(Arrays.toString(solution.solution(n)));
    }

}
