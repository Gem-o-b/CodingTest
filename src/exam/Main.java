package src.exam;

class Solution {

}

public class Main {
    public boolean numCheck(int num){ //에라스토스테네스의 체
        if(num <10) {
            if (num == 2 || num == 3 || num == 5 || num == 7) {
                return true;
            }else{
                return false;
            }
        }else {
            for (int i = 2; i * i < num; i++) {
                if (num % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public String solution(String s) {
        //3번. 소수의 개수와 덧셈 (상)
        //스트림을 쓸경우 더 간결하게 가능
//        int[] numTmp = Arrays.stream(s.split(" ")).mapToInt(Integer::parseInt).toArray();
        String[] numListTmp = s.split(" ");

        int max = -1; //초기값 설정
        int min = -1; //초기값 설정
        for (int i = 0; i < numListTmp.length; i++) {

            int numTmp = Integer.parseInt(numListTmp[i]);
            if (numCheck(numTmp) ==true){
                if(max < numTmp || max ==-1){
                    max = numTmp;
                }
            }else{
                if (min > numTmp || min ==-1){
                    min = numTmp;
                }
            }

        }

        return min+" "+max;
    }



    public static void main(String[] args) {
        Main method = new Main();

        String s = "97 75 88 99 95 92 73";
//        String s = "2 3 4 5";
//        String s = "15 3 10 9 7 8";
        System.out.println(method.solution(s));


    }

}
