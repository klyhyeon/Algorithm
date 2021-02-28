package baekJoon.week9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PrimeNum_2581 {

    private static int M;
    private static int N;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        M = Integer.parseInt(br.readLine());
        N = Integer.parseInt(br.readLine());
        returnPrime(M, N);
    }

    private static int cnt = 0;
    private static List<Integer> primes = new ArrayList<>();
    private static int min;
    private static int sum;

    public static void returnPrime(int M, int N) {

        for (int i = M; i <= N; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    cnt = 1;
                    break;
                }
            }
            if (cnt != 1 && i != 1) {
                primes.add(i);
            }
            cnt = 0;
        }

        if (!primes.isEmpty()) {
            Collections.sort(primes);
            min = primes.get(0);
            for (int p : primes) {
                sum += p;
            }
            System.out.printf("%d\n%d", sum, min);
        } else
            System.out.println("-1");

    }
}
