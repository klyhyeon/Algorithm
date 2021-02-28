package baekJoon.week18;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class MinHeap_1927 {

    static List<Integer> heap = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        heap.add(0, null);

        int reps = Integer.parseInt(br.readLine());
        while (reps-- > 0) {
            int number = Integer.parseInt(br.readLine());
            if (number == 0) {
                sb.append(delete() + "\n");
            } else {
                insert(number);
            }
        }
        System.out.println(sb.toString());
    }

    public static void insert(int number) {

        heap.add(number);


            for (int i = heap.size() - 1; i > 0; i /= 2) {
                if (heap.get(i) < heap.get(i / 2)) {
                    int temp = heap.get(i);
                    heap.set(i, heap.get(i / 2));
                    heap.set(i / 2, temp);
                } else {
                    break;
                }
            }
    }

    public static int delete() {
        if (heap.size() == 1) {
            return 0;
        }

        int deleteNum = heap.get(1);
        heap.set(1, heap.get(heap.size() - 1));
        heap.remove(heap.size() - 1);

        int pos = 1;
        for (int i = pos; i * 2 < heap.size(); ) {
            int currentNum = heap.get(i);
            int child1 = heap.get(i * 2);

            int minChild = i * 2;
            if (heap.size() > i * 2 + 1) {
                int child2 = heap.get(i * 2 + 1);
                if (child1 > child2) {
                    minChild = i * 2 + 1;
                    int temp2 = child1;
                    child1 = child2;
                    child2 = temp2;
                }
            }

            if (currentNum < heap.get(minChild)) {
                break;
            } else {
                int temp3 = currentNum;
                heap.set(i, heap.get(minChild));
                heap.set(minChild, currentNum);
            }
        }
        return deleteNum;
    }
}
