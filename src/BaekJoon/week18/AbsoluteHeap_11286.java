package baekJoon.week18;

import java.util.*;

public class AbsoluteHeap_11286 {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();
        Scanner sc = new Scanner(System.in);
        int reps = sc.nextInt();
        //정렬조건 절대값으로 설정
        PriorityQueue pq = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (Math.abs(o1) > Math.abs(o2) ||
                        (Math.abs(o1) == Math.abs(o2) && o1 > o2)) {
                    return 1;
                } else {
                    return -1;
                }
            }
        });
        while (reps-- > 0) {
            int number = sc.nextInt();
            if(number == 0) {
                if (pq.isEmpty()) {
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
