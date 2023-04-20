package src.Lv1.q67256;

import java.util.Arrays;

class Solution {
    public String solution(int[] numbers, String hand) {
//        StringBuilder sb = new StringBuilder();
////        String[][] numberArr = {{"1", "4", "7", "*"},{"2","5","8","0"},{"3","6","9","#"}};
//        String[] NumberArr1 = {"1", "4", "7", "*"};
//        String[] NumberArr2 = {"2","5","8","0"};
//        String[] NumberArr3 = {"3","6","9","#"};
//        String centerHand = ""; //중앙의 손가락 구별
//        String leftHand = "*";
//        String rightHand ="#";
//        int leftCenterNum =0; // 거리를 구해서 절대값을 변환해주기 위한 값
//        int rightCenterNum =0;
//        for (int i = 0; i < numbers.length; i++) {
//            centerHand ="";
//            System.out.println(leftHand+", "+rightHand+", "+numbers[i]);
//            if (numbers[i]==1||numbers[i]==4||numbers[i]==7){
//                sb.append("L");
//                leftHand = String.valueOf(numbers[i]);
//            }else if (numbers[i]==3||numbers[i]==6||numbers[i]==9) {
//                rightHand = String.valueOf(numbers[i]);
//                sb.append("R");
//            }else{
//                int center = Arrays.asList(NumberArr2).indexOf(String.valueOf(numbers[i]));
//                int left = Arrays.asList(NumberArr1).indexOf(leftHand);
//                if(left == -1){
//                    left = Arrays.asList(NumberArr2).indexOf(leftHand)-1;
//                    if (left <0){
//                        left *=-1;
//                    }
//                    centerHand ="L";
//                }
//                if(left-center < 0){ // 거리를 구하지만 -가 나올경우에 절대값으로 변환
//                    leftCenterNum = (left-center)*-1;
//                }else{
//                    leftCenterNum = left-center;
//                }
//                int right = Arrays.asList(NumberArr3).indexOf(rightHand);
//                if(right == -1){
//                    right = Arrays.asList(NumberArr2).indexOf(rightHand)-1;
//                    if (right <0){
//                        right *=-1;
//                    }
//                    centerHand ="R";
//                }
//                if(right-center < 0){ // 거리를 구하지만 -가 나올경우에 절대값으로 변환
//
//                    rightCenterNum = (right-center)*-1;
//                }else{
//                    rightCenterNum = right-center;
//                }
//
//
////                System.out.println("a : "+left+", "+right+", "+center+", "+centerHand);
//                System.out.println("b : "+leftCenterNum +", "+ rightCenterNum);
//                if(rightCenterNum == leftCenterNum) {
//                    if (centerHand == "R"){
//                        rightHand = String.valueOf(numbers[i]);
//                        sb.append("R");
//                    }else if(centerHand == "L"){
//                        sb.append("L");
//                        leftHand = String.valueOf(numbers[i]);
//                    }else {
//                        if (hand =="right"){
//                            rightHand = String.valueOf(numbers[i]);
//                            sb.append("R");
//                        }else{
//
//                            sb.append("L");
//                            leftHand = String.valueOf(numbers[i]);
//                        }
//                    }
//
//
//                }else if(rightCenterNum < leftCenterNum){
//
//                    rightHand = String.valueOf(numbers[i]);
//                    sb.append("R");
//                }else{
//
//                    sb.append("L");
//                    leftHand = String.valueOf(numbers[i]);
//                }
//
//            }
//
//        }
//
//        return sb.toString();

        StringBuilder sb = new StringBuilder();
        int leftHand =10;
        int rightHand =12;
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i]==0) numbers[i] =11;
            if (numbers[i]==1||numbers[i]==4||numbers[i]==7) {
                sb.append("L");
                leftHand =numbers[i];

            }else if (numbers[i]==3||numbers[i]==6||numbers[i]==9) {

                sb.append("R");
                rightHand=numbers[i];
            }else{
                int left = numbers[i]>leftHand?numbers[i]-leftHand:leftHand-numbers[i];
                int right = numbers[i]>rightHand?numbers[i]-rightHand:rightHand-numbers[i];
                int leftDis = (left/3)+(left%3); //1
                int rightDis = (right/3)+(right%3);

                if(leftDis== rightDis){
                    if(hand.equals("left")){
                        sb.append("L");
                        leftHand =numbers[i];
                    }else{
                        sb.append("R");
                        rightHand=numbers[i];
                    }
                }else if(leftDis <  rightDis){
                    sb.append("L");
                    leftHand =numbers[i];
                }else{
                    sb.append("R");
                    rightHand=numbers[i];
                }

            }




        }


        return sb.toString();
    }
}

public class Main {
    public static void main(String[] args) {
//        int[] numbers = {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
//        String hand = "right";
        int[] numbers ={7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2};
        String hand = "left";
//        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
//        String hand = "right";
        Solution solution = new Solution();
        System.out.println(solution.solution(numbers,hand));
//        System.out.println(Arrays.toString(solution.solution(n)));
    }

}
