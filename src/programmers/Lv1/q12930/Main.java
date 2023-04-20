package src.Lv1.q12930;

class Solution {

        public String solution(String s) {

//            String answer = "";
//
//            String[] arr = s.split(" ");
//            for (int i = 0; i < arr.length; i++) {
//                String tmp = "";
//                for (int j = 0; j < arr[i].length(); j++) {
//
//
//                    tmp += j%2==0?String.valueOf(arr[i].charAt(j)).toUpperCase():String.valueOf(arr[i].charAt(j)).toLowerCase();
//
//                }
//                answer+= i == arr.length-1?tmp+"1":tmp+" ";
//
//            }
//
//            return answer;
//            정확성 68.8로 실패

            String answer = "";
            int num =0;
            for (int i = 0; i < s.length(); i++) {
                char tmp = s.charAt(i);
                if (tmp ==' ' ){
                    num =0;
                    answer += " ";
                    continue;
                }else if (num%2==0){
                    answer += String.valueOf(tmp).toUpperCase();

                }else{
                    answer += String.valueOf(tmp).toLowerCase();
                }
                num++;

            }

            return answer;
        }

}

public class Main {
    public static void main(String[] args) {
        String n ="try hello world thank you very much";
        Solution solution = new Solution();
        System.out.println(solution.solution(n));
    }

}
