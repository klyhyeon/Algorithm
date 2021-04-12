package baekJoon.week6;
/*
    어떤 자연수 X의 각 자리가 등차수열을 이루면 그 수를 한 수라고 한다. N이 주어졌을 때, 1보다 크거나 같고 N보다 작거나 같은 한수의 개수를
    출력하는 프로그램 만들어라 ** 등차수열은 각 자리 수의 차이가 일정한 수열을 말한다. (123, 135)
    - 입력: 첫째 줄에 1000보다 작거나 같은 자연수 N이 주어진다.
    - 출력: 첫째 줄에 1보다 작거나 같은 한수의 개수를 출력한다.
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HanSu_1065_ex {

    static int N;
    static List<Integer> intList;
    static int minus;
    static int minusEx = Integer.MIN_VALUE;
    static int cnt = 0;
    static int tempNum;
    static boolean flag = false;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();

        System.out.println(han(N));


    }

    public static int han(int n) {


        for (int i = n; i > 0; i--) {
            intList = new ArrayList<>();

            if (i >= 100) {

                tempNum = i;

                while (tempNum > 0) {

                    intList.add(tempNum % 10);
                    tempNum /= 10;
                }

                for (int k = 0; k < intList.size() - 1; k++) {

                    minus = intList.get(k) - intList.get(k + 1);

                    if (minus == minusEx) {

                        flag = true;
                    } else {
                        flag = false;
                    }

                    minusEx = minus;
                }

                if (flag == true) {

                    cnt++;
                }

                flag = false;
                minusEx = Integer.MIN_VALUE;
                minus = 0;
            } else if (i < 100) {

                cnt++;
            }
        }

        return cnt;
    }


}

