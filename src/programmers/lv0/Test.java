package src.lv0;

//120835 int arr를 높은순서대로 arr정렬하여 순서를 배열로 반환 *stream 중요중요*

import java.util.Arrays;
import java.util.stream.Collectors;

class Solution2 {
        public int[] solution(int num, int total) {
            int midNum = total/num;
            int insNum=0;

            int[] answer = new int[num];
            if (num%2 ==0){
                insNum=midNum-(num/2-1);
                
                for(int i=0;i < answer.length; i++){
                    answer[i] = insNum;
                    insNum++;
                }
            }else{
                insNum=midNum-(num/2);
                for(int i=0;i < answer.length; i++){
                    answer[i] = insNum;
                    insNum++;
                }
            }
            return answer;
        }
}
public class Test {
    public static void main(String[] args) {
        Solution2 solution = new Solution2();
       int num= 4;
       int total =14 ;

        int[] arr = {1,1,10,30,2};


        System.out.println(Arrays.stream(arr).boxed().sorted().collect(Collectors.toList()));
//        System.out.println(Arrays.toString(solution.solution(numer1,denom1,numer2,denom2)));

//        String my_string= "hello";
//        System.out.println(solution.solution(num,total));



//        System.out.println(Arrays.toString(solution.solution(num,total)));

    }

}

