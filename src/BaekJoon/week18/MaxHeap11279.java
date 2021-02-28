package baekJoon.week18;

import java.util.LinkedList;
import java.util.Scanner;

public class MaxHeap11279 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> numbers = new LinkedList<>();

        int reps = sc.nextInt();
        while(reps-- > 0) {
            int number = sc.nextInt();
            if (number == 0) {
                System.out.println(maxNum(numbers));
            } else {
                numbers.add(number);
            }
        }
    }

    public static int maxNum(LinkedList<Integer> list) {
        int max = 0;
        if (list.isEmpty()) {
            return 0;
        }

        for (int ele : list) {
            if (ele >= max)
                max = ele;
        }
        list.remove(list.indexOf(max));
        return max;
    }
}
