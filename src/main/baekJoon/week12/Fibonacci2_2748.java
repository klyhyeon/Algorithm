package baekJoon.week12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Fibonacci2_2748 {

    static long[] dp = new long[91];
    static int n;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        System.out.println(fibo(n));
    }

    public static long fibo(int n) {
        if (n == 0) {
            dp[n] = 0;
        } else if (n == 1) {
            dp[n] = 1;
        } else if (dp[n] != 0) {
            return dp[n];
        } else {
            dp[n] = fibo(n - 1) + fibo(n - 2);
        }
        return dp[n];
    }
}
