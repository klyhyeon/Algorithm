package baekJoon.personal.week6;
/*
    주어진 수 N개 중 소수가 몇 개인지 찾아서 출력하는 프로그램을 작성하시오.
    - 입력: 첫 줄에 수의 개수 N이 주어진다. 다음으로 N개의 수가 주어지는데 수는 1,000 이하의 자연수이다.
    - 출력: 소수의 개수를 출력한다.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class FindPrimitive_1978 {

    static int N;
    static int val;
    static int cnt;
    static int total;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        N = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {


            val = Integer.parseInt(st.nextToken());

            for (int j = 1; j < val; j++) {
                if (val % j == 0) {

                    cnt++;
                }
            } //2차 반복문

            if (cnt == 1) {

                total++;
            }

            cnt = 0;

        } //1차 반복문

        System.out.println(total);

    }
}
