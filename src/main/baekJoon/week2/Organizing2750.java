package baekJoon.week2;

import java.util.Arrays;
import java.util.Scanner;

public class Organizing2750 {

    public static void main(String[] args) {
        /*
        N개의 숫자가 주어졌을 때, 이를 오름차순으로 정렬하는 프로그램

            - 입력: 첫째 줄엔 수의 개수, 둘째 줄부턴 N개의 수 이는 절댓값이 1000보다 작거나 같은 정수, 양의 정수, 중복 없음
            - 출력: 윗 줄부터 순서대로 출력

         */

        //오름차순 기준을 1<2<3... 가 아닌 8<2<4... 로 변경했을 땐 어떻게 접근해야할까?


        Scanner sc = new Scanner(System.in);
        int round = sc.nextInt();
        int[] arr = new int[1000];


        for(int i = 0; i < round; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);
        for(int j = 1000-round; j < 1000; j++) {
            System.out.println(arr[j]);
        }

    }

}
