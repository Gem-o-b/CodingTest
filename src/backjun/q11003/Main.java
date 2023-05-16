package src.backjun.q11003;


import java.io.*;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer stringTokenizer = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(stringTokenizer.nextToken());
        int M = Integer.parseInt(stringTokenizer.nextToken());
        stringTokenizer = new StringTokenizer(br.readLine());
        Deque<int[]> deque = new LinkedList<>();
        for (int i = 0; i < N; i++) {
            int now = Integer.parseInt(stringTokenizer.nextToken());

            while (!deque.isEmpty() && deque.peekLast()[1] > now) {
                deque.removeLast();
            }

            deque.addLast(new int[]{i,now});
            if ( deque.peekFirst()[0] <= i - M ) {
                deque.removeFirst();
            }
            bw.append(deque.getFirst()[1]+" ");

        }
        bw.flush();
        bw.close();

    }

}
