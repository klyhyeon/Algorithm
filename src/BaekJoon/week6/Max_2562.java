package baekJoon.week6;
/*
    9개의 서로 다른 자연수가 주어질 때, 이들 중 최댓값을 찾고 몇 번째 수인지를 찾는 프로그램을 작성하라
    - 입력: 1~9번째 줄까지 하나의 자연수가 주어짐. 자연수는 100보다 작음
    - 출력: 첫째 줄에 최댓값을 출력하고, 둘째 줄에 몇 번째 수인지를 출력
 */

import java.util.Scanner;

public class Max_2562 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int maxIdx = 0;
        int maxNum = 0;
        for(int i = 0; i < 9; i++) {

            int tempNum = sc.nextInt();
            maxNum = Math.max(maxNum, tempNum);

            if(maxNum == tempNum) {
                maxIdx = i+1;
            }
        }
        System.out.println(maxNum);
        System.out.print(maxIdx);
    }
}
