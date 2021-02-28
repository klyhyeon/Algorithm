package baekJoon.week1;

import java.util.Scanner;

//스터디에서 배운 재귀함수를 활용하여 재풀이
//이전 2개의 수의 합이 현재 숫자
public class Fibonacci10870_review {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        System.out.println(fibo(num));

    }

    //재귀함수 메서드 생성
    //return을 먼저 잡는다. 조건을 잡고, return을 절대값으로 둔다.

    public static int fibo(int num) {

//        dp[0] = 0;
//        dp[1] = 1;

        if(num == 0) {
            return 0;
        } else if(num == 1) {
            return 1;
        } else {
        return fibo(num-1) + fibo(num-2);
        }


    }
}
