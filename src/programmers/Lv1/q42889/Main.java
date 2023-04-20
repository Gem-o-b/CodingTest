package src.Lv1.q42889;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        double[] failPer = new double[N];
//        double[][] failPer = new double[N][2];
//        Map<Double,Integer> map = new HashMap<>();
        List<Double> list = new ArrayList<>();
        for (int i = 1; i <= N; i++) {
            int tmp = i;
            double totCnt = Arrays.stream(stages).filter(q-> q >= tmp ).count();
            double clearCnt = Arrays.stream(stages).filter(q-> q == tmp ).count();
//            failPer[i-1] = clearCnt / totCnt;
            if(clearCnt==0){
                list.add(0.0);
            }else {
                list.add(clearCnt / totCnt);
            }
        }
        System.out.println(list);
        for (int i = 0; i < N; i++) {
            double max = Collections.max(list);
            for (int j = 0; j <N ; j++) {
                if(list.get(j)==max){
                    answer[i] = j+1;
                    list.set(j,-1.0);
                    break;
                }
            }
//            System.out.println(list);
//            System.out.println(max);

        }



//        System.out.println(Arrays.toString(failPer));
//        System.out.println(Arrays.deepToString(failPer));
//        List<Double> list = new ArrayList<>(map.keySet());
//        Collections.sort(list);
//        for (Double lists:list)
//            System.out.println(lists);
//            System.out.println(map.get(lists));
//        }

        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        int n = 5;
        int[] stages = {2, 1, 2, 6, 2, 4, 3, 3};
//        int[] stages = {4,4,4,4,4};
        Solution solution = new Solution();

        System.out.println(Arrays.toString(solution.solution(n,stages)));
    }

}