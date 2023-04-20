package src.lv0.q120906;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

class Solution {
    public int solution(int n) {


        return Arrays.stream(Stream.of(String.valueOf(n).split("")).mapToInt(Integer::parseInt).toArray()).sum();
    }//           배열  스트림
    //String.ValueOf = 스트링으로 변환
    //mapToInt = map이지만 반환형이 IntStream
}

public class Main {
    public static void main(String[] args) {
        int i =1234;
        Solution solution = new Solution();
        System.out.println(solution.solution(i));
    }

}
