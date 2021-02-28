package baekJoon.week6;
/*
    정수 n개가 주어졌을 때,n개의 합을 구하는 함수를 작성하시오.
    - Java: long sum(int[] a); 클래스 이름: Test
    - a: 합을 구해야 하는 정수 n개가 저장되어 있는 배열(a는 0보다 크고 1,000,000보다 작거나 같고, n은 1보다 크고 3,000,000보다 작다.
    - 리턴값: a 에 포함되어 있는 정수 n 개의 합
 */

public class SumofInt_15596 {

    static int n;
    static int total = 0;
    static int[] a;
    public long sum(int[] a) {

        for (int num:
             a) {
            total += num;
        }

        return total;
    }
}
