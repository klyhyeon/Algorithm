package baekJoon.week2;

import java.util.Scanner;
/*
    - 별 찍기 #17
    - 입력: N <= 100 N개의 행
    - 출력: 마지막 행은 별을 빼곡히 찍되, 그 전까진 양쪽 하나씩만 찍음
               *
              * *
             *   *
            *******
 */
/*
    - 마지막 행은 (N*2)-1만큼 별을 print해주면 된다.
    - 첫번째 행은 1개(N번째 자리), 두번째 ~ N-1번째 행은 늘어나면서 (N-i), (N+i).... i++
    - 마지막 행 기준으로 N-1

 */

public class Star17_10992 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int n = sc.nextInt();

        for(int i = 0; i < n; i++) {
            for(int j = 1; j < n*2; j++) {
                if (j > n+i) {
                    break;
                }
                if(i == n-1) {
                    sb.append("*");
                } else {
                    if(j == n-i || j == n+i) {
                        sb.append("*");
                    } else {
                        sb.append(" ");
                    }
                }
            }
            sb.append("\n");
        }

        System.out.println(sb);


    }
}
