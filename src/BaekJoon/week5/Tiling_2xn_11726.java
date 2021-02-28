package baekJoon.week5;
/*
    2xn 크기의 직사각형을 1x2, 2x1 타일로 채우는 방법의 수
    - 입력: n(1<=n<=1000)
    - 출력: 2xn 크기의 직사각형을 채우는 방법의 수를 10007로 나눈 나머지
 */
/*
    - DP(동적 프로그래밍)
    값을 배열에 저장하기 때문에 필요할 경우 중복 연산없이 빼서 쓸 수 있음.
    - 타일 유형이 2개임. dp[n-1] 에서 2x1 타일 하나씩 추가할 경우 경우의 수가 생기고, dp[n-2] 에서 1x2 타일 하나씩 추가할 경우 경우의 수가 또 생김.
    - 점화식 -> 이해안돼서 유튜브 참고(https://www.youtube.com/watch?v=HTgcW34AnVQ), 중등 올림피아드 점화식 이해(https://www.youtube.com/watch?v=Qvg-5abaOZQ)
        dp[n] = dp[n-1] + dp[n-2]
        * DFS(깊이 우선 탐색) -> 경우의 수가 많을 경우 시간복잡도 터짐 -> dp 사용해야함

    ================================================================
    - 왜 시간초과가 뜨지???
    - 메서드 안만들고 main에서 반복문으로 실행하니까 맞았습니다 뜬다.

 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tiling_2xn_11726 {

        static int[] dp = new int[1001];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());

        dp[1] = 1;
        dp[2] = 2;



    //dp 알고리즘
        for(int i = 3; i <= num; i++) {
                    if(dp[i] != 0) {
//                        dp[i] = dp[i];
                    } else {
                        //dp[num] = dp(n-1)함수로 설정해줘야만 재귀함수가 실행된다. 배열로 잡아주면 메서드가 실행되지 않기 때문에 제자리 값 0만 출력한다.
                        dp[i] = (dp[i - 1] + dp[i - 2]) % 10007;
            }
        }


                //출력
                System.out.println(dp[num]);
    }

    public static int dp1(int num) {
        if(dp[num] != 0) {
            return dp[num];
        } else {
            //dp[num] = dp(n-1)함수로 설정해줘야만 재귀함수가 실행된다. 배열로 잡아주면 메서드가 실행되지 않기 때문에 제자리 값 0만 출력한다.
            dp[num] = (dp1(num - 1) + dp1(num - 2)) % 10007;
            return dp[num];
        }
    }

}
