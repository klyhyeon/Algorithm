package baekJoon.week9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GoldBach_9020 {

    static boolean[] primes = new boolean[10001];
    static int[][] gb;
    static int temp;
    static int cnt;
    static int T;
    static int n;
    static int min;
    static int minIdx;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb2 = new StringBuilder();

        getPrime();

        T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            n = Integer.parseInt(br.readLine());
            sb2.append(findGb(n) + "\n");
        }
        System.out.println(sb2);
    }

    //골든바흐 반환하는 메서드
    public static StringBuilder findGb(int n) {
        StringBuilder sb = new StringBuilder();
        temp = cnt = 0;
        min = Integer.MAX_VALUE;
        gb = new int[10001][3];
        for (int j = 2; j <= (n / 2); j++) { //큰 수에서 작은 수로 작아지면서로 바꾼다면 center값에서 멀어질 수록 차이가 커지기 때문에 굳이 sort를 안해줘도 된다.
            if (primes[n - j] == false && primes[j] == false) {
                cnt++;
                gb[temp][0] = j;
                gb[temp][1] = n - j;
                gb[temp][2] = n - (2 * j);
                temp++;
            }
        }
        if (cnt > 1) {
            for (int i = 0; i < cnt; i++) {
                min = Math.min(min, gb[i][2]);
                if (gb[i][2] == min)
                    minIdx = i;
            }
            sb.append(gb[minIdx][0] + " " + gb[minIdx][1]);
        } else {
            sb.append(gb[0][0] + " " + gb[0][1]);
        }
        return sb;
    }

    //10000까지 소수 구하는 메서드
    public static void getPrime() {
        primes[0] = primes[1] = true;
        for (int i = 2; i <= Math.sqrt(primes.length); i++) {
            for (int j = i * i; j < primes.length; j += i) {
                primes[j] = true;
            }
        }
    }
}



