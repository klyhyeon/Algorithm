package baekJoon.week1;

import java.util.Scanner;

public class Factorial10872 {

    /*
        - 0보다 크거나 같은 정수 N이 주어진다. 이때, N을 출력하는 프로그램 작성(N<=12)
        - 입력: N
        - 출력: N!
     */
    /*
        - 반복문 말고 메서드로 풀어보자.
        - 재귀함수?
     */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(fac(n));

    }

    public static int fac(int n) {
        if(n == 1 || n == 0) return 1;
        else {
            return n * fac(n - 1);
        }
    }
}
