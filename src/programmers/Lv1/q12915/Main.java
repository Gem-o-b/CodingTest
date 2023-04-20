package src.Lv1.q12915;

import java.util.*;


class Solution {
    public String[] solution(String[] strings, int n) {
//        String[] answer = new String [strings.length];
//        Map<String,Integer> map= new HashMap<>(); // 해쉬맵으로 idx번호와 value값을 넣어줌
//        for (int i = 0; i < strings.length; i++) {
//
//            map.put(strings[i].substring(n),i);
//        }
//        List<String> keySet = new ArrayList<>(map.keySet());
//        Collections.sort(keySet);
//        int cnt=0;
//        for(String key : keySet){
//
//            answer[cnt] = strings[map.get(key)];
//            cnt++;
//
//        }
//        return answer;

//        두번째 구현하다 실패
//        String[] answer = new String [strings.length];
//        Arrays.sort(strings);
//        for (int i = 0; i < strings.length; i++) {
//            for (int j = i+1; j < strings.length; j++) {
////                System.out.println(strings[i].charAt(n) +" " + strings[i+j].charAt(n));
//                System.out.println(i+" "+j);
//                if(strings[i].charAt(n) > strings[j].charAt(n)){
//
//                }
//
//            }
//
//        }
//
//        System.out.println(Arrays.toString(strings));

        String[] answer = new String [strings.length];
        List<String> list = new ArrayList<>();
        for (int i = 0; i < strings.length; i++) {
            list.add(String.valueOf(strings[i].charAt(n))+strings[i]);

        }
        Collections.sort(list);
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i).substring(1);
        }

        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        String[] strings = {"abce", "abcd", "cdx"};
        int n = 2;
        Solution solution = new Solution();
//        System.out.println(solution.solution(n));
        System.out.println(Arrays.toString(solution.solution(strings,2)));
    }

}
