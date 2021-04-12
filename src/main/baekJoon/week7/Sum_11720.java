package baekJoon.week7;

import java.util.Scanner;

public class Sum_11720 {
    /*
        - N개의 숫자가 공백없이 쓰여있다. 숫자의 모든 합.
        - 입력: 첫 줄엔 N <= 100, 둘째 줄엔 N개 숫자가 공백없이 주어진다.
        - 출력: 숫자 N개의 합
     */

    /*
        - 숫자는 한 자리수만 주어지는 듯
        - split로 배열의 합 구함
     */


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String numbers = sc.next();
        String[] str = numbers.split("");

        int sum = 0;

        for(int i = 0; i < n; i++) {
            sum += Integer.parseInt(str[i]);
        }
        System.out.println(sum);
    }
}
