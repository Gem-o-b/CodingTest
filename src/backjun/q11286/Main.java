package src.backjun.q11286;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>((o1, o2) -> {
            int fAbs = Math.abs(o1);
            int sAbs = Math.abs(o2);
            if (fAbs == sAbs){
                return o1 > o2 ? 1 : -1;
            }
            return fAbs-sAbs;
        });
        for (int i = 0; i < N; i++) {
            int tmp = Integer.parseInt(br.readLine());
            if( tmp != 0){
                priorityQueue.add(tmp);
            }else{
                if(priorityQueue.size()==0){
                    System.out.println("0");
                }else {
                    System.out.println(priorityQueue.poll());
                }
            }
        }
    }

}
