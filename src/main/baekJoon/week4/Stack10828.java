package baekJoon.week4;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Stack10828 {

    /*
        - 입력받은 명령어대로 실행되는 Stack 알고리즘을 구현하라.
        - N은 10,000보다 작거나 같고 X는 100,000보다 작거나 같은 양의 정수
        1) push X : X를 스택에 넣는다.
        2) pop : 스택의 가장 위에 있는 수를 빼고 출력한다. 없을 경우 -1을 출력
        3) size: 스택에 들어있는 정수의 개수를 출력한다.
        4) empty: 스택이 비어있으면 1, 아니면 0을 출력한다.
        5) top: 스택의 가장 위에 있는 정수를 출력한다. 없을 경우 -1을 출력
     */

    /*
        - 리스트에 넣어서 if문으로 작동시켜도 되나? 일단 아는대로 풀어봐야겠다.
        - 08/18/20 Stack 메서드로 다시 품

     */


    public static void main(String[] args) throws IOException {

        List<String> list = new ArrayList<>();
        list.add("1");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //반복횟수 입력 N <= 10000
        int n = Integer.parseInt(br.readLine());
        //Stack 객체 생성
        Stack s = new Stack();
        //조건에 따라 반복 실행
        for(int i = 0; i < n; i++) {
            String input = br.readLine();
            //push
            if(input.contains("push")) {
                //split
                String[] pushArr = input.split(" ");
                //{"push", "2(숫자)"}
                //push Stack 메서드
                s.push(Integer.parseInt(pushArr[1]));
                pushArr = null;
            } else if(input.equals("pop")) {
                if(s.empty()) {
                    System.out.println(-1);
                } else {
                    System.out.println(s.pop());
                }
            } else if(input.equals("size")) {
                System.out.println(s.size());
            } else if(input.equals("empty")) {
                if(s.empty()) {
                    System.out.println(1);
                } else {
                    System.out.println(0);
                }
            } else if(input.equals("top")) {
                if(s.empty()) {
                    System.out.println(-1);
                } else {
                    System.out.println(s.peek());
                }

            }

        }


    }
}


//다른코드
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//
//        Stack<Integer> stack = new Stack<Integer>();
//        int num = Integer.parseInt(br.readLine());
//
//        while(num-- > 0) {
//            String input = br.readLine();
//            if(input.startsWith("push ")) {
//                int val = Integer.parseInt(input.split(" ")[1]);
//                stack.push(val);
//            }
//
//            if(input.equals("pop")) {
//                if(stack.isEmpty()) {
//                    bw.write(String.valueOf(-1) + "\n");
//                } else {
//                    bw.write(stack.pop() + "\n");
//                }
//            } else if(input.equals("top")) {
//                if(stack.isEmpty()) {
//                    bw.write(String.valueOf(-1) + "\n");
//                } else {
//                    bw.write(stack.peek() + "\n");
//                }
//            } else if(input.equals("empty")) {
//                if(stack.isEmpty()) {
//                    bw.write(String.valueOf(1) + "\n");
//                } else {
//                    bw.write(String.valueOf(0) + "\n");
//                }
//            } else if(input.equals("size")) {
//                bw.write(stack.size() + "\n");
//            }
//        } //end while
//
//        bw.flush();
//        bw.close();
//        br.close();















