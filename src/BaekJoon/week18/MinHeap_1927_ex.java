package baekJoon.week18;

import java.util.*;

public class MinHeap_1927_ex {

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
                    sb.append(pq.poll() + "\n");
                }
            } else {
                pq.add(number);
            }
        }
        System.out.println(sb.toString());
    }
}
