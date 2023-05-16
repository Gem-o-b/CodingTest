package src.backjun.q1991;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int[][] arr = new int [26][2];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            StringTokenizer stringTokenizer = new StringTokenizer(br.readLine());
            int P = stringTokenizer.nextToken().charAt(0)-'A';
            char L = stringTokenizer.nextToken().charAt(0);
            char R = stringTokenizer.nextToken().charAt(0);
            if (L == '.') arr[P][0] = -1;
            else arr[P][0] = L-'A';
            if (R == '.') arr[P][1] = -1;
            else arr[P][1] = R-'A';
        }
        preOrder(0);
        System.out.println();
        inOrder(0);
        System.out.println();
        postOrder(0);
        System.out.println();
        StringBuilder sb = new StringBuilder();
    }


    public static void preOrder(int num) {
        if (num ==0){
            System.out.print('A');
        }
        if (arr[num][0] != -1) {
            System.out.print((char)(arr[num][0]+'A'));
            preOrder(arr[num][0]);
        }
        if (arr[num][1] != -1) {
            System.out.print((char)(arr[num][1]+'A'));
            preOrder(arr[num][1]);
        }
    }
    public static void inOrder(int num){

        if (num == -1){
            return;
        }
        inOrder(arr[num][0]);
        System.out.print((char)(num+'A'));
        inOrder(arr[num][1]);
    }

    public static void postOrder(int num){
        if (num == -1){
            return;
        }
        postOrder(arr[num][0]);
        postOrder(arr[num][1]);
        System.out.print((char)(num+'A'));
    }
}
