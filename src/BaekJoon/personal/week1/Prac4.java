package baekJoon.personal.week1;

import java.util.Scanner;

public class Prac4 {

    public static void main(String[] args) {

        //n까지 더하는 함수

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(fibo(num));

        }

        //재귀함수: 주어진 값과 수열이 함수값을 실행해 기저사례까지 돌아가는 함수
    public static int fibo(int num) {

        if(num <= 1) {
            return 1;
        } else {
            return num + fibo(num - 1);
        }
    }

}
