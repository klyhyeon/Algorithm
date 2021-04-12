package baekJoon.week3;
/*
    준규는 숫자카드 N장 소유. 수는 절대값 2의 62승 보다 크거나 같음(음수 포함)
    N은 1보다 크고 100,000보다 작거나 같다
    준규가 가진 카드중 가장 많은 정수를 구하시오
    가장 많이 가진 정수가 여러개라면, 작은 것을 출력한다.
    - 입력: 받을 숫자 N과 해당되는 숫자들
    - 출력: 가장 많이 가지고 있는 정수를 구하시오.
 */
/*
    숫자가 2의 26승 이기 때문에 long을 써줘야한다.
     - 데이터 타입 단위: long(2^62) > int(2^32) > short(2^16) > byte(2^8)
     1. 배열에 받아야한다. '통계' 문제에서 썼던 배열 index 이용하는 최빈값 방법은 숫자가 너무 커서 안될듯
      > 배열을 2개 만든다. 중복 count를 위한 배열1, 숫자를 담는 배열2. 중복 count 배열을 sort한다. ..-너무 복잡-
     2. list를 이용해 배열 index 이용하면 될듯! -> index 초기화 할 수 없으니 그 방법은 못씀
     3. 2차원 배열? 2차원에는 count를 넣는다. long[n][2] 으로 선언. long[n][1] 은 숫자값, long[n][2]는 중복갯수
      > 시간초과..
      >> 2차원 배열 추가(n^2)와 2차원 배열 정렬에서 초과된듯(n-1)+(n-2)+...0)..
 */

import java.util.*;

public class Card_11652 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //준규가 소유한 카드 개수 설정
        int n = sc.nextInt();
        //카드 숫자 담을 Arr 선언
        long[] numArr = new long[n];
        //카드 받을 반복문 생성
        for(int i = 0; i < n; i++) {
            long num = sc.nextLong();
            numArr[i] = num;
        }
        //배열 오름차순 정렬
        Arrays.sort(numArr);
        //다음 숫자와 같을 때마다 count++ 해준다. count를 max에 넣어줌. 다르면 count를 0으로 만듦
        int count = 0;
        //가장 높은 count를 저장할 변수
        int max = 0;
        //최빈값 == 해
        long answer = 0;

        for(int j = 0; j < n-1; j++) {
            if(numArr[j] == numArr[j+1]) {
                count++;
            } else {
                count = 0;
            }
                if(count > max) {
                    max = count;
                    answer = numArr[j];
                }

        }
        if(max == 0) {
            System.out.println(numArr[0]);
        } else {
            System.out.println(answer);
        }






   }
}
