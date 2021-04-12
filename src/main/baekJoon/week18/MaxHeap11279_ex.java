package baekJoon.week18;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MaxHeap11279_ex {

    static List<Integer> heap = new ArrayList<>();

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //heap 편의상 0번째 index는 null로 설정한다.(0은 곱셈, 나눗셈을 못씀)
        heap.add(0, null);
        int reps = sc.nextInt();
        while (reps-- > 0) {
            int number = sc.nextInt();

            if (number == 0) {
                System.out.println(delete());
            } else {
                insert(number);
            }
        }
    }

    public static void insert(int number) {
        heap.add(number);
        int childNum = heap.size() - 1;
        int parentNum = childNum / 2;
        //자식노드가 더 크면 swap
        while (childNum > 1 && heap.get(parentNum) < heap.get(childNum)) {
            int temp = heap.get(parentNum);
            heap.set(parentNum, heap.get(childNum));
            heap.set(childNum, temp);

            childNum /= 2;
        }
    }

    public static int delete() {
        //heap이 비었을 때
        if (heap.size() - 1 < 1)
            return 0;

        //가장 큰 값 == 제거할 값
        int deleteNum = heap.get(1);

        //마지막 노드를 첫 노드로 교체해줌
        heap.set(1, heap.get(heap.size()-1));
        //마지막 노드를 삭제함
        heap.remove(heap.size()-1);

        int pos = 1;
        //첫 노드의 자식들이 heap 사이즈보다 크면 break
        while((pos * 2) < heap.size()) {

            int max = heap.get(pos * 2);
            int maxPos = pos * 2;

            //자식 둘 간의 대소비교. 값이 더 큰 노드가 max, maxPos를 차지
            if (((pos * 2 + 1) < heap.size()) && max < heap.get(pos * 2 + 1)) {
                max = heap.get(pos * 2 + 1);
                maxPos = pos * 2 + 1;
            }

            //첫 노드가 제일 크면 탈출
            if (heap.get(pos) > max) {
                break;
            }

            //자식 노드가 더 크면 첫 노드와 순서를 바꿔줌
            int temp = heap.get(pos);
            heap.set(pos, heap.get(maxPos));
            heap.set(maxPos, temp);
            pos = maxPos;
        }
        return deleteNum;
    }

}
