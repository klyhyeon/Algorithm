package baekJoon.week11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Decomposition_2231 {
    static int y; //<= 1,000,000, >= 1

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        y = Integer.parseInt(br.readLine());

        System.out.println(setDecom(y));
    }

    public static long getDecom(int n) {
        long decom = n;
        int temp = n;
        while (temp > 0) {
            decom += temp % 10;
            temp /= 10;
        }
        return decom;
    }

    public static int setDecom(int n) {
        int decom = Integer.MAX_VALUE;
        for (int i = (n / 2); i < n; i++) { //i = n - (len * 9)로 범위 단축가능
            if (getDecom(i) != n) {
                continue;
            } else {
                    decom = i;
                    break;
            }
        }
        if (decom == Integer.MAX_VALUE) {
            return 0;
        } else {
            return decom;
        }
    }
}
