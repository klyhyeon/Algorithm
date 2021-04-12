package baekJoon.week4;
/*
    N+1 일째 되는 날 퇴사하기 위해 N일까지 최대한 많은 상담을 하려한다.
    상담을 완료하는데 걸리는 기간 Ti, 받을 수 있는 금액 Pi.
    걸리는 기간과 금액을 고려해 최대 수익을 구하는 프로그램을 작성하시오
        - 입력: N, 1<= N <= 15
            둘째줄부터 Ti와 Pi가 공백으로 구분되어서 주어짐 1일부터 N일까지 순서대로
            1<= Ti <= 5, 1<= Pi <= 1000
        - 출력: 최대 이익
 */
/*
    서로 겹치지 않게 경우의 수를 돌려보면서 최대 수익을 찾는다.
    고려할 요소:
        1. 기간이 겹치지 않도록 하는 조건?
        2. 수익이 높도록 - Pi/Ti가 높은 것 우선순위
        3. 기간이 N일을 넘어설 수 없음 - Ti 값들을 더했을 때 N보다 작아야함


 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Quit_14501 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //n받음
        int date = Integer.parseInt(br.readLine());
        //dp배열 선언
        int[] dp = new int[date+15];
        int[] time = new int[date+15];
        int[] profit = new int[date+15];
        //time, profit 입력
        for(int i = 1; i <= date; i++) {
            String[] val = br.readLine().split(" ");
            time[i] = Integer.parseInt(val[0]);
            profit[i] = Integer.parseInt(val[1]);
            val = null;
        }
        //dp 구문
        for(int j = date; j > 0; j--) {
            int days = time[j] + j;
            if(days > date+1) {
                //상담기간이 퇴사일을 넘기면 다음날 스케쥴로 진행
                dp[j] = dp[j+1];
            } else {
                //max(스케쥴을 진행하지 않았을 때 최대값, 진행했을 때 최대값(수익+진행했을 때 다음 스케쥴의 최대값)
                dp[j] = Math.max(dp[j+1], dp[days]+profit[j]);
            }
        }
        //정답 출력: dp[0]: 1(0)일부터 퇴사일까지 상담했을 시 최대값
        System.out.println(dp[1]);

    }
}
