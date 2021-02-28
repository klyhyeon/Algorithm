package baekJoon.week7;
/*
    세 자리 수 두 개가 주어진다. 그런데 수를 거꾸로 읽는다. 높은 값을 출력하라
    - 입력: 두 수가 주어진다. 세 자리 수고, 0이 포함되어 있지 않다. 같지 않은 수다.
    - 출력: 첫째 줄에 상수의 대답을 출력한다.
 */

/*
    다른 방법:
    1) st.nextToken().reverse().toString(); 함수 사용하여 String -> reverse String -> int로 계산해줌
    2) 내가 만든 노가다 공식을 while문으로 함수식 만들 수 있음.
    3) reverse String으로 거꾸로 만든 다음
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Constant_2908 {

    static int A;
    static int B;
    static int revA;
    static int revB;
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());

        A = Integer.parseInt(st.nextToken());
        B = Integer.parseInt(st.nextToken());


            revA += ((A % 10) * 100);
            A /= 10;
            revA += ((A % 10) * 10);
            A /= 10;
            revA += ((A % 10));

            revB += ((B % 10) * 100);
            B /= 10;
            revB += ((B % 10) * 10);
            B /= 10;
            revB += ((B % 10));

        System.out.println(Math.max(revA,revB));
    }
}
