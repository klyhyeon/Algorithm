package baekJoon.week16;

/*
push X: 정수 X를 큐에 넣는 연산이다.
pop: 큐에서 가장 앞에 있는 정수를 빼고, 그 수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
size: 큐에 들어있는 정수의 개수를 출력한다.
empty: 큐가 비어있으면 1, 아니면 0을 출력한다.
front: 큐의 가장 앞에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
back: 큐의 가장 뒤에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;

public class Queue2_18258 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int testNum = Integer.parseInt(br.readLine());
        Deque<Integer> queue = new LinkedList<Integer>();

        while (testNum-- > 0) {
            String compute = br.readLine();

            if (compute.contains("push")) {
                queue.add(Integer.parseInt(compute.split(" ")[1]));
            } else if (compute.equals("pop")) {
                if (queue.isEmpty()) {
                    sb.append(-1 + "\n");
                } else {
                    sb.append(queue.poll() + "\n");
                }
            } else if (compute.equals("size")) {
                sb.append(queue.size() + "\n");
            } else if (compute.equals("empty")) {
                if (queue.isEmpty()) {
                    sb.append(1 + "\n");
                } else {
                    sb.append(0 + "\n");
                }
            } else if (compute.equals("front")) {
                if (queue.isEmpty()) {
                    sb.append(-1 + "\n");
                } else {
                    sb.append(queue.peek() + "\n");
                }
            } else if (compute.equals("back")) {
                if (queue.isEmpty()) {
                    sb.append(-1 + "\n");
                } else {
                    sb.append(queue.getLast() + "\n");
                }
            }
        }
        System.out.println(sb);
    }
}
