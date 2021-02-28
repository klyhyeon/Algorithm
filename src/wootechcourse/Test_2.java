package wootechcourse;

import java.util.Arrays;

public class Test_2 {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(solution("987987", "-")));
    }

    public static long[] solution(String s, String op) {
        int length = s.length();
        long[] answer = new long[length - 1];
        int leftSide = 0;
        int rightSide = 0;
        int result = 0;
        int k = 0;

        for (int i = 1; i < length; i++) {
            leftSide = Integer.parseInt(s.substring(0, i));
            rightSide = Integer.parseInt(s.substring(i));

            if (op.equals("+")) {
                result = leftSide + rightSide;
            } else if (op.equals("-")) {
                result = leftSide - rightSide;
            } else if (op.equals("*")) {
                result = leftSide * rightSide;
            }

            answer[k] = result;
            k++;
        }
        return answer;
    }

}
