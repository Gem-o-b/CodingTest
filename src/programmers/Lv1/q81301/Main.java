package src.Lv1.q81301;

class Solution {
    public int solution(String s) {
        String[] arr = {"zero","one","two","three","four","five","six","seven","eight","nine"};
        String[] arr2 = {"0","1","2","3","4","5","6","7","8","9"};

        for (int i = 0; i < arr.length; i++) {
           s= s.replace(arr[i],arr2[i]);
        }


        return Integer.parseInt(s);
    }
}

public class Main {
    public static void main(String[] args) {
        String s = "one4seveneight";
        Solution solution = new Solution();
        System.out.println(solution.solution(s));
//        System.out.println(Arrays.toString(solution.solution(n)));
    }

}
