package baekJoon.personal.week5;
/*
    - Week3 복습
    스타박스 손님들은 입장 시 알바생에게 팁을 줌
    입장 줄 대기순서에 따라 팁 - (대기순서 -1) 이 됨
    ex. 민호 - 3원/2등 일 때 팁 = 3 - (2 - 1) = 2원
    사람의 수 N과 각 사람의 팁 금액이 주어졌을 때, 손님의 순서를 적절히 바꿔 팁을 최대화 시키는 프로그램 작성
    - 입력: 사람의 수 N(1<=N<=100000), 둘째 줄부터 N+1번째 줄까지 각 사람의 팁이 주어짐
    - 출력: 받을 수 있는 팁의 최대값
 */
//정리
//왜 틀린 지를 모르겠쒀여.. -> total 데이터 타입을 long으로 변경 안해줘서
//틀린 문제는 블로그에 정리하기
//Array sort


import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Starbox_1758 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //사람 수
        int n = sc.nextInt();
        //최대 팁
        long total = 0;
        Integer[] tipArr = new Integer[n];

        for(int i = 0; i < n; i++) {
            tipArr[i] = sc.nextInt();
            }

        //Arrays sort 하는 법: 객체로 지정하면 됨 (Integer)
        Arrays.sort(tipArr, Comparator.reverseOrder());
//        for(int i = n; i > 1; i--) {
//            if(tipArr[i] > tipArr[i-1]) {
//                int temp = tipArr[i];
//                tipArr[i] = tipArr[i-1];
//                tipArr[i-1] = temp;
//            }
//        }

        for(int i = 0; i < n; i++) {
            if(tipArr[i] - i <= 0) {
                break;
            }
            total += tipArr[i] - i;
        }

        System.out.println(total);
        sc.close();


    }
}
