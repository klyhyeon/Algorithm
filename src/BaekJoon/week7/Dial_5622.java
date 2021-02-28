package baekJoon.week7;
/*
    옛날 전화기로 다이얼을 돌릴 때 1은 2초가 걸리며 하나 옆에 있는 수는 1초씩 더 걸린다. 할머니는 숫자를 문자로 외움. 다이얼마다 알파벳이 적혀있다.
    단어가 주어졌을 때, 이 전화를 거는데 필요한 시간을 구해라
    - 입력: 첫째 줄에 알파벳 대문자로 이루어진 단어가 주어진다. 단어는 2~15글자로 이루어져 있다.
    - 출력: 다이얼을 거는데 필요한 시간을 출력한다.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Dial_5622 {

    static String dialAlpha;
    static char[] dialsAlpha;
    static int dialTotal = 0;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        dialAlpha = br.readLine();

        dialsAlpha = dialAlpha.toCharArray();

        //조건: 아스키코드

        for (int i = 0; i < dialsAlpha.length; i++) {
            if ((int) dialsAlpha[i] >= 87) {

                dialTotal += 10;
            } else if ((int) dialsAlpha[i] >= 84) {

                dialTotal += 9;
            } else if ((int) dialsAlpha[i] >= 80) {

                dialTotal += 8;
            } else if ((int) dialsAlpha[i] >= 77) {

                dialTotal += 7;
            } else if ((int) dialsAlpha[i] >= 74) {

                dialTotal += 6;
            } else if ((int) dialsAlpha[i] >= 71) {

                dialTotal += 5;
            } else if ((int) dialsAlpha[i] >= 68) {

                dialTotal += 4;
            } else if ((int) dialsAlpha[i] >= 65) {

                dialTotal += 3;
            }
        }

        System.out.println(dialTotal);


    }
}
