package src.backjun.q1717;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static int[] parents;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(stringTokenizer.nextToken());
        int M = Integer.parseInt(stringTokenizer.nextToken());
        parents = new int[N+1];

        for (int i = 1; i <= N; i++) {
            parents[i] = i;
        }
        for (int i = 0; i < M; i++) {
            int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            if (arr[0] == 0) {
                unionParents(arr[1], arr[2]);
            } else {
                checkSame(arr[1], arr[2]);
            }
        }

    }

    private static void checkSame(int i, int j) {
        if (findParents(i) == findParents( j)) System.out.println("YES");
        else System.out.println("NO");
    }

    private static int findParents(int i) {
        if (parents[i] == i) {
            return i;
        }
        parents[i] = findParents(parents[i]);
        return parents[i];
    }

    private static void unionParents(int i, int j) {
        int num1 = findParents(i);
        int num2 = findParents(j);
        if (num1 < num2 ) parents[num2] = num1;
        else parents[num1] = num2;
    }

}
