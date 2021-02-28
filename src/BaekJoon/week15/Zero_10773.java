package baekJoon.week15;

import java.util.Scanner;
import java.util.Stack;

public class Zero_10773 {
    /*
    stack. 0이 나오면 last in 숫자를 지운다.
    push: 추가
    pop: 최근 데이터 삭제
     */

    public static void main(String[] args) {
        long num = 0;
        long inputNum = 0;
        long sum = 0;

        Stack stack = new Stack();
        Scanner sc = new Scanner(System.in);

        num = sc.nextInt();
        while(num-- > 0) {
            inputNum = sc.nextInt();
            if (inputNum == 0) {
                stack.pop();
            } else {
                stack.push(inputNum);
            }
        }

        int fixedSize = stack.size();
        for (int i = 0; i < fixedSize; i++) {
            sum += (long) stack.pop();
        }

        System.out.println(sum);
    }
}
