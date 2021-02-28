package baekJoon.week16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;

/*
push_front X: 정수 X를 덱의 앞에 넣는다.
push_back X: 정수 X를 덱의 뒤에 넣는다.
pop_front: 덱의 가장 앞에 있는 수를 빼고, 그 수를 출력한다. 만약, 덱에 들어있는 정수가 없는 경우에는 -1을 출력한다.
pop_back: 덱의 가장 뒤에 있는 수를 빼고, 그 수를 출력한다. 만약, 덱에 들어있는 정수가 없는 경우에는 -1을 출력한다.
size: 덱에 들어있는 정수의 개수를 출력한다.
empty: 덱이 비어있으면 1을, 아니면 0을 출력한다.
front: 덱의 가장 앞에 있는 정수를 출력한다. 만약 덱에 들어있는 정수가 없는 경우에는 -1을 출력한다.
back: 덱의 가장 뒤에 있는 정수를 출력한다. 만약 덱에 들어있는 정수가 없는 경우에는 -1을 출력한다.
 */
public class Deque_10866 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Deque<Integer> deque = new LinkedList<>();

        int testNum = Integer.parseInt(br.readLine());
        while (testNum-- > 0) {
            String compute = br.readLine();

            if (compute.split(" ")[0].equals("push_front")) {
                deque.addFirst(Integer.parseInt(compute.split(" ")[1]));
            } else if (compute.split(" ")[0].equals("push_back")) {
                deque.addLast(Integer.parseInt(compute.split(" ")[1]));
            } else if (compute.equals("pop_front")) {
                if (deque.isEmpty()) {
                    sb.append(-1 + "\n");
                } else {
                    sb.append(deque.pollFirst() + "\n");
                }
            } else if (compute.equals("pop_back")) {
                if (deque.isEmpty()) {
                    sb.append(-1 + "\n");
                } else {
                    sb.append(deque.pollLast() + "\n");
                }
            } else if (compute.equals("size")) {
                sb.append(deque.size() + "\n");
            } else if (compute.equals("empty")) {
                if (deque.isEmpty()) {
                    sb.append(1 + "\n");
                } else {
                    sb.append(0 + "\n");
                }
            } else if (compute.equals("front")) {
                if (deque.isEmpty()) {
                    sb.append(-1 + "\n");
                } else {
                    sb.append(deque.peekFirst() + "\n");
                }
            } else if (compute.equals("back")) {
                if (deque.isEmpty()) {
                    sb.append(-1 + "\n");
                } else {
                    sb.append(deque.peekLast() + "\n");
                }
            }
        }
        System.out.println(sb);
    }

}
