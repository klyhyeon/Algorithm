package baekJoon.week12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BagPacking_12865 {

    static int[] v;
    static int[] w;
    static int[][] dp; //[i번째 아이템][무게]
    static int n;
    static int k;
    static int temp = 1;
    static int temp1;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        temp1 = n;
        k = Integer.parseInt(st.nextToken());

        v = new int[n + 1];
        w = new int[n + 1];
        dp = new int[n + 1][k + 1];

        while (temp1-- > 0) {
            st = new StringTokenizer(br.readLine());
            w[temp] = Integer.parseInt(st.nextToken()); //W
            v[temp] = Integer.parseInt(st.nextToken()); //V
            temp++;
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= k; j++) {
                dp[i][j] = dp[i - 1][j]; //i번째 물건을 선택하지 않았을 때
                if (j - w[i] >= 0)
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - w[i]] + v[i]); //선택했을 때 최대 가치와 하지 않았을 때 최대가치를 비교
            }
        }

        System.out.println(dp[n][k]);

    }

}
