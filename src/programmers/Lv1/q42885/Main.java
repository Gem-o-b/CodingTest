package src.programmers.Lv1.q42885;

import java.util.Arrays;

class Solution {
    public int solution(int[] people, int limit) {
        Arrays.sort(people);
        int a = 0;
        int b = people.length-1;
        int solo = 0;
        int two = 0;
        while (a <= b){
            if (people[a]+people[b] > limit){
                solo++;
                b--;
            }else{
                two++;
                a++;
                b--;
            }
        }
        return two+solo;
    }
}


public class Main {
    public static void main(String[] args) {
        int[] people = {70,50,80,50};
        int limit = 100;
        Solution solution = new Solution();
        System.out.println(solution.solution(people,limit));
//        System.out.println(Arrays.toString(solution.solution(n)));
    }

}
