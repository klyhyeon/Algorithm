package baekJoon.week11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DirectorShom_1436 {
    static int[] tripleSix;
    static int N;
    static int idx = 1;

    public static void main(String[] args) throws IOException {
        tripleSix = new int[10001];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());

        for (int i = 666; i < 100000000; i++) {
            if (tripleSix[N] != 0)
                break;
            if (String.valueOf(i).contains("666")) {
                tripleSix[idx] = i;
                idx++;
            }
        }

        System.out.println(tripleSix[N]);

    }
}
