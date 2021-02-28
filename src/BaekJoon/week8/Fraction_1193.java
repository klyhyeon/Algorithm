package baekJoon.week8;
/*
    분수찾기 : 지그재그로 순번을 부여한다. 순번에 맞는 분수를 찾아서 갖고온나@!
 */

import java.util.Scanner;

public class Fraction_1193 {
    static String answer;
    static int cnt = 1;
    static int temp;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println(fraction(sc.nextInt()));

    }

    public static String fraction(int X) {

        temp = X;
        while (true) {

            if (X == 1) return "1/1";

            temp -= cnt;
            if (temp <= cnt + 1) {
                if ((cnt + 1) % 2 != 0) {
                    answer = ((cnt + 1) - (temp - 1)) + "/" + (1 + (temp - 1));
                } else {
                    answer = (1 + (temp - 1)) + "/" + ((cnt + 1) - (temp - 1));
                }
                break;
            } else {
                cnt++;
                continue;
            }
        }
        return answer;
    }
}
