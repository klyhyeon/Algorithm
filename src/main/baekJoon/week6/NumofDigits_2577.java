package baekJoon.week6;
/*
    세 개 숫자의 곱이 0~9까지 숫자가 각 몇 번 들어가 있는지 구하라
    - 입력: 각 줄에 세 개 숫자를 입력함
    - 출력: 1~10줄까지 0~9까지 각각 몇번 들어가있는지를 출력함
 */

import java.util.Scanner;

public class NumofDigits_2577 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int multiply = A*B*C;

        //1.곱셈 String 배열화
        String multiplyStr = Integer.toString(multiply);

        String[] multiplySpt = multiplyStr.split("");

        //2.비교 문자 배열 생성
        String[] example1 = new String[10];

        //3.개수 저장할 배열 입력
        int[] example2 = new int[10];


        for(int i = 0; i < 10; i++) {

            example1[i] = Integer.toString(i);
        }

        //1,2 배열 비교
        for(int i = 0; i < multiplySpt.length; i++) {
            for(int j = 0; j < 10; j++) {
                if(multiplySpt[i].equals(example1[j])) {
                    example2[j]++;
                }
            }
        }

        //3 배열 출력
        for (int n:
             example2) {
            System.out.println(n);
        }



    }
}
