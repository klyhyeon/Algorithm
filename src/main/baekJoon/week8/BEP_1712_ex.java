package baekJoon.week8;
/*
    월드전자. 고정 비용 A만원. 한 대당 B만원의 가변 비용
    가격은 C만원으로 책정. 생산 대수를 늘려 가다 보면 수입이 비용보다 많아지게 됨
    이익이 발생하는 지점을 손익분기점(BEP)라고 한다.
    A,B,C가 주어졌을 때 손익분기점을 구하는 프로그램을 작성해라.
    - 입력 : A, B, C가 빈 칸을 두고 순서대로 주어진다. 21억 이하의 자연수이다.
    - 출력 : 첫 번째 줄에 손익분기점이 발생하는 판매량을 출력한다. 존재하지 않으면 1을 출력한다.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BEP_1712_ex {

    static long a;
    static long b;
    static long c;
    static long profit;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());

        a = Long.parseLong(st.nextToken());
        b = Long.parseLong(st.nextToken());
        c = Long.parseLong(st.nextToken());

        //손익분기점이란 수입 - 가변 비용의 차이가 몇 번 곱해지면 고정 비용을 넘어서느냐에 달렸음
        profit = c - b;
        if (profit <= 0) {
            System.out.println("-1");
            return;
        }
        //몫은 커지기 직전까지 나눌 수 있기 때문에 +1을해줘야 손익분기점을 넘어서는 지점이 된다.
        System.out.println(a / profit + 1);


    }

}
