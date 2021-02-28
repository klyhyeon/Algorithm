package baekJoon.week15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BalancedWorld_4949 {

    static char[] sentence;
    static String result;


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            Stack<Character> stack = new Stack();
            result = "yes";
            sentence = null;

            sentence = br.readLine().toCharArray();
            if (sentence[0] == '.')
                break;

            for (char ele :
                    sentence) {
                if (ele == '(' || ele == '[') {
                    stack.push(ele);
                } else if (ele == ')') {
                    if (stack.isEmpty() || stack.pop() != '(') {
                        result = "no";
                        break;
                    }
                } else if (ele == ']') {
                    if (stack.isEmpty() || stack.pop() != '[') {
                        result = "no";
                        break;
                    }
                }
            }
            if (!stack.isEmpty())
                result = "no";
            sb.append(result + "\n");
        }
        System.out.println(sb);
    }
}
