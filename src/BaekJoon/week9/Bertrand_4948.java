package baekJoon.week9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bertrand_4948 {

    //제한 숫자를 초과하는 범위라 배열을 사용못하는 듯하다.
    //소수 구하는 방법 - 에라토스테네스의 체
    private static int cnt;
    private static boolean[] primes = new boolean[246913];
    private static int n;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        getPrime();

        while (true) {
            n = Integer.parseInt(br.readLine());

            if (n == 0)
                break;

            for (int i = n + 1; i <= (n * 2); i++) {
                if (!primes[i])
                    cnt++;
            }
            sb.append(cnt + "\n");
            cnt = 0;
        }
        System.out.println(sb);
    }



    public static void getPrime() {
        primes[0] = primes[1] = true;
        for (int i = 2; i < Math.sqrt(primes.length); i++) {
            for (int j = (i * i); j < primes.length; j += i) {
                primes[j] = true;
            }
        }
    }

}
