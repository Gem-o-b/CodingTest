package src.backjun.q1874;


import java.io.*;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int cnt = Integer.parseInt(br.readLine());
        int[] arr = new int[cnt];
        for (int i = 0; i < cnt; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        Stack<Integer> stack = new Stack<>();
        int num = 1;
        boolean result = true;
        for (int i = 0; i < cnt; i++) {
            if (arr[i] >= num) {
                while (arr[i] >= num) {
                    stack.push(num);
                    sb.append("+\n");
                    num++;
                }
                stack.pop();
                sb.append("-\n");
            }else{
                if (stack.pop() != arr[i]){
                    System.out.println("NO");
                    result = false;
                    break;

                }else{
                    sb.append("-\n");
                }
            }
        }
        if (result) {
            System.out.println(sb.toString());
        }
    }
}

