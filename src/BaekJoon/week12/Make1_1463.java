package baekJoon.week12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Make1_1463 {
    static int[] dp;
    static int x;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        x = Integer.parseInt(br.readLine());
        dp = new int[x + 1];

        //Bottom-up
        for (int i = 2; i <= x; i++) {
            dp[i] = dp[i - 1] + 1;
            if (i % 2 == 0)
                dp[i] = Math.min(dp[i], dp[i / 2] + 1);
            if (i % 3 == 0)
                dp[i] = Math.min(dp[i], dp[i / 3] + 1);
        }
        System.out.println(dp(x));
        br.close();
    }

    //Top-Down 너무 느려
    public static int dp(int n) {
        if (n == 1)
            return 0;
        if (dp[n] > 0)
            return dp[n];
        dp[n] = dp(n - 1) + 1;
        if (n % 3 == 0)
            dp[n] = Math.min(dp[n], dp[n / 3] + 1);
        if (n % 2 == 0)
            dp[n] = Math.min(dp[n], dp[n / 2] + 1);

        return dp[n];
    }
}
