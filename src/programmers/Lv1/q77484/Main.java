package src.Lv1.q77484;

import java.util.*;

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int ok =7;
        int no =1;
        boolean okCheck=false;
        for (int i = 0; i < 6; i++) {
            okCheck=false;
            if (lottos[i]==0){
                ok--;
                no++;
                okCheck=true;
                continue;
            }
            for (int j = 0; j < 6; j++) {
                if (lottos[i]==win_nums[j]){
                    System.out.println(lottos[i]);
                    ok--;
                    okCheck=true;
                    break;
                }
            }
            if (!okCheck){
                no++;
            }

        }
        if(ok ==7){
            ok=6;
        }
        if (no == 7) {
            no=6;
        }

        int[] answer = {ok,no};
        return answer;
    }
    public int[] solution2(int[] lottos, int[] win_nums) {
        int[] answer ={};
        int max = 0;
        int min = 0 ;

        List<Integer> lottoList = new ArrayList<>();
        for(int num : lottos){
            lottoList.add(num);
        }
        Set<Integer> set = new HashSet<>(lottoList);
        if(set.size() != lottoList.size()){
            max += lottoList.size() - set.size() +1 ; // 1 2 3 4 0 0
        }
        for (Integer i:set){
            if(i!=0){
                for(int j=0; j<win_nums.length;j++){
                    if(win_nums[j] ==i){
                        min +=1;
                    }
                }
            }
            if(i==0&&set.size() ==6){
                max+=1;
            }
        }
        max += min;
        answer = new int [2];
        answer[0] = rank(max);
        answer[1] = rank(min);
        return answer;
    }
    public int rank(int count){
        switch (count){
            case 6:
                return 1;
            case 5:
                return 2;
            case 4:
                return 3;
            case 3:
                return 4;
            case 2 :
                return 5;


        }
        long start = System.currentTimeMillis();
        long end = System.currentTimeMillis();
        System.out.println("시간복잡도는"+(end-start)/1000.0);
        return 0;

    }
}

public class Main {
    public static void main(String[] args) {
        int[] lottos ={44, 1, 0, 0, 31, 25};
        int[] win_nums = {31, 10, 45, 1, 6, 19};
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.solution(lottos,win_nums)));
    }

}
