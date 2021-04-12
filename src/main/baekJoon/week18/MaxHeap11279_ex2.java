package baekJoon.week18;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class MaxHeap11279_ex2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Queue<Integer> pq = new PriorityQueue<>();
        StringBuilder sb = new StringBuilder();

        int reps = sc.nextInt();
        while (reps-- > 0) {
            int number = sc.nextInt();
            if (number == 0) {
                if(pq.isEmpty()) {
                    sb.append(0 + "\n");
                } else {
                    sb.append(pq.poll() * -1 + "\n");
                }
            } else {
                pq.add(number * -1);
            }
        }
        System.out.println(sb.toString());
    }

}
