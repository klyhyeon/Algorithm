package baekJoon.week9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class GetPrime_1929 {
    static int M;
    static int N;
    static boolean[] isPrime;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());

        isPrime = new boolean[N + 1];
        isPrime[0] = isPrime[1] = true;

        for (int i = 2; i <= Math.sqrt(N); i++) {
            if (!isPrime[i])
            for (int j = i * i; j < isPrime.length; j += i) {
                isPrime[j] = true;
            }
        }

        for (int i = M; i <= N; i++) {
            if (!isPrime[i])
                System.out.println(i);
        }

    }
}
