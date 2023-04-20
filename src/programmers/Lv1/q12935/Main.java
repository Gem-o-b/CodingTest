package src.Lv1.q12935;

import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr) {
//            if(arr.length==1){
//                int[] answer = {-1};
//                return  answer;
//            }
//        테스트는되는데 채점에서 모두 실패함 이유는 모름->문제에 속았음 정렬할필요가없음
//        int[] answer = Arrays.stream(arr).sorted().skip(1).toArray();
//        int[] err = {-1};
//
//
//        int[] tmp = new int[answer.length];
//
//        for (int i = 0; i < answer.length; i++) {
//
//            tmp[i] = answer[answer.length - i - 1];
//        }
//
//
//        return answer.length==0?err:tmp;

//
//        Integer[] tmp = Arrays.stream(arr).sorted().skip(1).boxed().sorted(Collections.reverseOrder()).toArray(Integer[]::new);
//        int[] answer = Arrays.stream(tmp).mapToInt(Integer::intValue).toArray();

        if(arr.length==1) {
            int[] answer = {-1};
            return answer;
        }
//        int[] answer = Arrays.stream(arr).filter(i->i!=Arrays.stream(arr).min().getAsInt()).toArray();
//        int a = Arrays.stream(arr).min().getAsInt();
//        System.out.println(a);
//        System.out.println(Arrays.toString(Arrays.stream(arr).filter(i->i!=Arrays.stream(arr).min().getAsInt()).toArray()));



        return Arrays.stream(arr).filter(i->i!=Arrays.stream(arr).min().getAsInt()).toArray();
    }

}

public class Main {
    public static void main(String[] args) {
        int[] n ={10,2,3,4};
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.solution(n)));
    }

}
