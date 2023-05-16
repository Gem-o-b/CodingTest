package src.backjun.q2042;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static long[] tree;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(stringTokenizer.nextToken());
        int M = Integer.parseInt(stringTokenizer.nextToken());
        int K = Integer.parseInt(stringTokenizer.nextToken());
        int length = N;
        int height = 0;
        while ( length != 0){
            length /= 2;
            height++;
        }
        int treeSize = (int)Math.pow(2,height+1);
        int startIdx = treeSize/2-1;


        tree = new long[treeSize+1];
        for (int i = startIdx+1; i <= startIdx+N; i++) {
            tree[i] = Long.parseLong(br.readLine());
        }
        setTree(treeSize-1);
        for (int i = 0; i < M+K; i++) {
            stringTokenizer = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(stringTokenizer.nextToken());
            int b = Integer.parseInt(stringTokenizer.nextToken());
            long c = Long.parseLong(stringTokenizer.nextToken());
            if (a == 1){
                changeNum(b+startIdx, c);
            }else if (a==2){
                sumNum(b+startIdx, (int)c+startIdx);
            }else{
                return;
            }
        }
    }

    private static void sumNum(int start, int end) {

        int sum = 0;
        while ( start <= end) {
            if (start % 2 == 1) {
                sum += tree[start];
                start++;
            }
            if (end %2 == 0){
                sum+= tree[end];
                end--;
            }
            start /= 2;
            end /= 2;
        }
        System.out.println(sum);

    }

    private static void changeNum(int b, long c) {
        long tmp = c-tree[b];
        while(b > 0){
            tree[b] += tmp;
            b /= 2;
        }
    }

    public static void setTree(int i){
        while( i != 1){
            tree[i/2] += tree[i];
            i--;
        }
    }

}
