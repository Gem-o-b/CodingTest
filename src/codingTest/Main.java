package src.codingTest;

import java.util.*;


import java.util.Stack;

class Solution {
    public int solution(int n, int k, int[] h) {
        List<Integer> list = new ArrayList<>();
        List<Integer> dellist = new ArrayList<>();
        int count =0;

        for (int i = 0; i < h.length; i++) {
            list.add(h[i]);
        }
        System.out.println(list);
        while (list.size() > 0) {
            count++;
            int max = 0;
            int index = 0;
            for (int i = 0; i < list.size() - 1; i++) {
                if (max < list.get(i)) {
                    max = list.get(i);
                    index = i;
                }
            }
            System.out.println("Before : " + list);
            System.out.println("max : " + max + " index : " + index);
            dellist.clear();
            dellist.add(index);
            for (int i = 1; i <= k; i++) {
                int tmpmax = max;
                if (index + i < list.size()) {
                    if (list.get(index + i) < max) {
                        max = list.get(index + i);
                        dellist.add(index + i);
                    }
                }
                max = tmpmax;
                System.out.println("index - i : " +  (index-i));
                if (index - i >= 0) {
                    if (list.get(index - i) < max) {
                        max = list.get(index - i);
                        dellist.add(index - i);
                    }
                }
            }
            dellist.sort(Comparator.reverseOrder());
            for (int i = 0; i < dellist.size(); i++) {
                int indexNum = dellist.get(i);
                list.remove(indexNum);
            }
            System.out.println("dellist" + dellist);
            System.out.println("After : " + list);


        }
        return count;

    }
}



public class Main {
    public static void main(String[] args) {
        int n = 9;
        int k = 2;
        int[] h = {1, 3, 5, 4, 2, 6};
        Solution solution = new Solution();
        System.out.println(solution.solution(n,k,h));
//        System.out.println(Arrays.toString(solution.solution(n)));
    }

}
