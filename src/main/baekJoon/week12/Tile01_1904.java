package baekJoon.week12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tile01_1904 {

    static int n;
    static long[] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        dp = new long[n + 2];
        dp[1] = 1;
        dp[2] = 2;

        if (n >= 3) {
            for (int i = 3; i <= n; i++) {
                dp[i] = (dp[i - 2] + dp[i - 1]) % 15746;
            }
        }

        System.out.println(dp[n]);
    }

}

