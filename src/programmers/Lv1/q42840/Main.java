package src.Lv1.q42840;

import java.util.Arrays;

class Solution {
    public int[] solution(int[] answers) {
        int[][] man = {{1,2,3,4,5},{2, 1, 2, 3, 2, 4, 2, 5},{3, 3, 1, 1, 2, 2, 4, 4, 5, 5}};
        int[] manCnt ={0,0,0};

        for (int i = 0; i < man.length; i++) {
            int cnt = 0;
            for (int j = 0; j < answers.length ; j++) {
            if (cnt ==man[i].length) cnt =0;
            if (man[i][cnt]==answers[j]){

                manCnt[i] +=1;
            }
            cnt++;
            }
        }

        int max = Arrays.stream(manCnt).max().getAsInt();
        int maxCnt = (int)Arrays.stream(manCnt).filter(i->i==max).count();
        int[] answer = new int[maxCnt];
        int cnt=0;
        for (int i = 0; i < manCnt.length; i++) {
            if (manCnt[i] == max){
                answer[cnt] = i+1;
                cnt++;
            }

        }
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        int[] answers = {1,2,3,4,5};
        Solution solution = new Solution();
//        System.out.println(solution.solution(n));
        System.out.println(Arrays.toString(solution.solution(answers)));
    }

}
