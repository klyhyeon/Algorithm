package baekJoon.week8;
/*
    육각형으로 이루어진 벌집은 이웃하는 방에 돌아가면서 1씩 증가하는 번호를
    주소로 매길 수 있다. N이 주어졌을 때, 중앙 1에서 N번 방까지 최소 개수 방을 지나서 갈 때
    최소 개수 방의 수는?
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BeeHive_2292_ex {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        System.out.print(solution(n));
    }

    private static int solution(int n) {
        // 1: 1 (1)
        // 2 ~ 7 : 2 (6개)
        // 8 ~ 19 : 3 (12개)
        // 20 ~ 37 : 4 (18개)
        // 38 ~ 61 : 5 (24개)
        // ...생략..
        // a(n) = a(n-1) + 6(n-1) | a(n): 첫 항
        if(n == 1) return 1;
        int i=2;
        int k=1;

        while(i<=n) {
            i += 6*k++;
        }

        return k;
    }

}
