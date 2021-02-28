package baekJoon.week13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LostBracket_1541 {

    static String expression;
    static int answer;
    static int length;
    static String[] letters;
    static int num1;
    static int sum1;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        expression = br.readLine();

        sum1 = 0;
        num1 = 0;

        letters = expression.split("-");
        length = letters.length;

        for (int i = 0; i < length; i++) {
            if (letters[i].contains("+")) {
                for (int j = 0; j < letters[i].length(); j++) {
                    if (letters[i].charAt(j) == '+') {
                        sum1 += num1;
                        num1 = 0;
                    } else if (j == letters[i].length() - 1) {
                        if (num1 != 0) {
                            num1 = num1 * 10 + Integer.parseInt(String.valueOf(letters[i].charAt(j)));
                        } else {
                            num1 = Integer.parseInt(String.valueOf(letters[i].charAt(j)));
                        }
                        sum1 += num1;
                        num1 = 0;
                    } else {
                        if (num1 != 0) {
                            num1 = num1 * 10 + Integer.parseInt(String.valueOf(letters[i].charAt(j)));
                        } else {
                            num1 = Integer.parseInt(String.valueOf(letters[i].charAt(j)));
                        }
                    }
                } //"+"가 들어있을 때 2차 반복문
                if (i == 0) {
                    answer = sum1;
                } else {
                    answer -= sum1;
                }
                sum1 = 0;
            } else {
                if (i == 0) {
                    answer = Integer.parseInt(letters[i]);
                } else {
                    answer -= Integer.parseInt(letters[i]);
                }
            }
        } //1차 반복문

        System.out.println(answer);
    }


}
