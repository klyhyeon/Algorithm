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

public class Dial_5622_ex {

    static String dialAlpha;
    static char[] dialsAlpha;
    static int dialTotal = 0;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        dialAlpha = br.readLine();

        //값 비교 시 char는 부등호 사용할 수 있음
        //ex. if(in.charAt(i)<'D')


    }
}

//interface Main {
//    static void main(String[] a) throws Exception {
//        int n, s = 0;
//        while ((n = System.in.read() - 59) > -1)
//            s += (n - n / 24 - n / 31) / 3 + 1;
//
//        System.out.print(s);
//    }
//}
