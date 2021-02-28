package baekJoon.week16;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Card2_2164 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testNum = sc.nextInt();
        Deque<Integer> deque = new LinkedList<>();

        for (int i = 1; i <= testNum; i++) {
            deque.add(i);
        }

        while (deque.size() != 1) {
            deque.remove();
            deque.add(deque.poll());
        }

        System.out.println(deque.getFirst());

    }
}
