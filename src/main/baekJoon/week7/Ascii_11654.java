package baekJoon.week7;
/*
    알파벳 소문자, 대문자, 숫자0-9 중 하나가 주어졌을 때, 주어진 글자의 아스키 코드값을 출력하라
    - 입력: 알파벳 소문자, 대문자, 숫자 0-9 중 하나가 첫째 줄에 주어진다.
    - 출력: 글자의 아스키 코드 값을 출력한다.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ascii_11654 {

    static String input;
    static char[] chr;
    static char arg;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        input = br.readLine();

        chr = input.toCharArray();
        arg = chr[0];
        if(Character.isDigit(arg)) {

            System.out.println(arg+0);
        } else {

            System.out.println(arg+0);
        }
    }
}
