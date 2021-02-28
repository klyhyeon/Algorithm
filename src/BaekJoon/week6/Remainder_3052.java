package baekJoon.week6;
/*
    숫자를 10개 입력받고, 이를 42로 나눈 나머지를 구한다. 그 다름 서로 다른 값이 몇 개 있는지 출력하는 프로그램을 작성하라
    - 입력: 1~10번째 줄 끼지 숫자가 하나씩 주어짐. 1,000보다 작거나 같은 자연수
    - 출력: 첫재 줄에, 42로 나누었을 때 서로 다른 나머지가 몇 개 있는지 출력한다.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Remainder_3052 {
    //나머지 결과값을 Boolean 배열 Index에 직접 저장하는 방법도 있음
    //false인 Index만 Cnt해주고 true로 변환

    static int[] remainder;
    static int cnt;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        remainder = new int[10];

        for(int i = 0; i < 10; i++) {
            st = new StringTokenizer(br.readLine());
            int num = Integer.parseInt(st.nextToken());
            remainder[i] = num % 42;
        }

        Arrays.sort(remainder);

        for (int i = 0; i < remainder.length-1; i++) {
            if(remainder[i] != remainder[i+1]) {
                cnt++;
            }
        }

        System.out.println(cnt+1);


    }
}
