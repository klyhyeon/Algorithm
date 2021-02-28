package baekJoon.week6;
/*
    어떤 자연수 X의 각 자리가 등차수열을 이루면 그 수를 한 수라고 한다. N이 주어졌을 때, 1보다 크거나 같고 N보다 작거나 같은 한수의 개수를
    출력하는 프로그램 만들어라 ** 등차수열은 각 자리 수의 차이가 일정한 수열을 말한다. (123, 135)
    - 입력: 첫째 줄에 1000보다 작거나 같은 자연수 N이 주어진다.
    - 출력: 첫째 줄에 1보다 작거나 같은 한수의 개수를 출력한다.
 */

import java.util.Scanner;

public class HanSu_1065 {

    static int N;
    static String str;
    static String[] strArr;
    static int[] intArr;
    static int minus;
    static int minusEx = Integer.MIN_VALUE;
    static int cnt = 0;
    static boolean flag = false;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();

        System.out.println(han(N));


    }

    public static int han(int n) {

        for (int i = n; i > 0; i--) {

            if (i >= 100) {

                str = Integer.toString(i);
                strArr = str.split("");
                intArr = new int[strArr.length];
                for (int j = 0; j < strArr.length; j++) {

                    intArr[j] = Integer.parseInt(strArr[j]);
                }

                for (int k = intArr.length - 1; k > 0; k--) {

                    minus = intArr[k] - intArr[k - 1];

                    if(minus == minusEx) {

                        flag = true;
                    } else {
                        flag = false;
                    }

                    minusEx = minus;
                }

                if(flag == true) {

                    cnt++;
                }

                flag = false;
                minusEx = Integer.MIN_VALUE;
                minus = 0;
                strArr = null;
                intArr = null;
            } else if(i < 100) {

                cnt++;
            }
        }

        return cnt;
    }


}

