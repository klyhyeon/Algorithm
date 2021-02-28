package baekJoon.week15;

import java.util.Scanner;
import java.util.Stack;
/*while문을 쓰는 게 핵심
  같은 수열이 나올때까지 push, 같으면 pop을 반복. 조건이 들어가기 때문에 while문을 써야함
 */

public class StackArray_1874 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int testcaseNum;
        int[] inputElements;
        int k = 0;
        Stack<Integer> stack = new Stack<>();

        testcaseNum = sc.nextInt();
        inputElements = new int[testcaseNum];

        for (int i = 0; i < testcaseNum; i++) {
            inputElements[i] = sc.nextInt();
        }

        for (int i = 1; i <= testcaseNum; i++) {
            stack.push(i);
            sb.append("+" + "\n");
            while (!stack.isEmpty() && stack.peek() == inputElements[k]) {
                stack.pop();
                sb.append("-" + "\n");
                k++;
            }
        }
        if (!stack.isEmpty()) {
            System.out.println("NO");
        } else {
            System.out.println(sb);
        }
    }
}
