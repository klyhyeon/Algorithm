package baekJoon.personal.week5;
/*
    - 스터디에서 같이 풀었던 문제 복습
    N킬로그램 설탕 배달, 봉지는 3킬로그램과 5킬로그램 있음.
    최대한 적은 봉지로 정확히 N킬로그램을 배달할 수 있는 봉지의 수를 구하라
    - 입력: N킬로(3<=N<=5000)
    - 출력: 봉지의 최소 개수, 정확하게 N킬로그램을 만들 수 없다면 -1을 출력한다
 */

import java.util.Scanner;

public class Sugar_2839 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //n킬로그램
        int n = sc.nextInt();
        //최소 봉지 개수
        int bag = 0;
        while(n > 0) {
            if(n % 5 == 0) {
                bag += n / 5;
                n = 0;
            } else if(n < 3) {
                break;
            } else {
                n = n - 3;
                bag++;
            }
        }

        if(n == 2 || n == 1) {
            System.out.println(-1);
        } else {
            System.out.println(bag);
        }
        sc.close();
    }
}
