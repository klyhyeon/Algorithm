package baekJoon.week6;
/*
    양의 정수 n이 있으면 n과 각 자리 숫자를 더하는 함수
    생성해주는 메서드 필요.
    n을 d(n)의 생성자라고 함. 각 자리수를 더해서 만들 수 없는 수, 생성자가 없는 숫자 = 셀프넘버를 출력하는 프로그램을 만들어
    - 입력: 없음
    - 출력: 10,000보다 작거나 같은 셀프 넘버를 한 줄에 하나씩 증가하는 순서로 출력한다.
 */

public class SelfNum_4673_ex {

    static int s = 0;
    static int sum;
    static boolean[] flag;
    static int max;
    public static int self(int n) {

        sum = n;

        while(n > 0) {

            sum += (n % 10);
            n /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {


        //출력: 10000으로 설정
        max = 10000;
        flag = new boolean[15000];

        System.out.println(self(2));

        for(int i = 1; i < max + 1; i++) {

            flag[self(i)] = true;
        }

        for(int i = 1; i < max + 1; i++) {

            if(!flag[i]) {

                System.out.println(i);
            }
        }

    }
}