package src.Lv1.q42862;

import java.util.Arrays;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int count = 0;
        Arrays.sort(lost); //정렬문은 lost나 reserve가 2,4 이런식이아닌 4,2이렇게 들어왔을때 문제생김
        Arrays.sort(reserve);

        //for문은 중복을 제거해주기 위함
        for (int i = 0; i < lost.length; i++) {
            for (int j = 0; j < reserve.length; j++) {
                if(lost[i] == reserve[j]){
                    lost[i] = -1;
                    reserve[j] = -1;
                    count++;
                    break;
                }
            }
        }
        int answer = n-lost.length+count;
        for (int i = 0; i < lost.length; i++) {
            if (lost[i] ==-1){
                continue;
            }
            for (int j = 0; j < reserve.length; j++) {
                if(lost[i] == reserve[j]-1||lost[i] == reserve[j]+1){
                    answer++;
                    reserve[j]=-1;
                    break;
                }

            }

        }

        return answer;
    }

}

public class Main {
    public static void main(String[] args) {
        int n = 7;
        int[] lost= {4,2};
        int[] reverse = {3,5};

        Solution solution = new Solution();
        System.out.println(solution.solution(n,lost,reverse));
//        System.out.println(Arrays.toString(solution.solution(n)));
    }

}
