package src.lv0.q120835;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

class Solution {
    public int[] solution(int[] emergency) {

//        int[] tmp = new int [emergency.length];
//        for (int i = 0; i < emergency.length; i++) {
//            int count=1;
//            for (int j = 0; j < emergency.length; j++) {
//                if (emergency[i] < emergency[j]){
//                    count++;
//                }
//            }
//            tmp[i] = count;
//        }
//
//        return tmp;
        
        return Arrays.stream(emergency).map(i -> Arrays.stream(emergency).boxed().sorted(Comparator.reverseOrder()).collect(Collectors.toList()).indexOf(i) + 1).toArray();
        //stream을 이중으로 돌림
        //boxed는 int배열을 integer로 변환함
        // Arrays.stream(emergency).boxed().sorted(Comparator.reverseOrder()).collect(Collectors.toList()).indexOf(i) + 1 이건 reverse로 배열값을 역순으로 정렬 후 indexof(i) = i의 값이 몇번쨰인지 값을 반환 후 제일 밖에서 도는 stream에 index값을 반환
    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
//        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int[] arr = {30, 10, 23, 6, 100};
        System.out.println(Arrays.toString(solution.solution(arr)));
    }

}
