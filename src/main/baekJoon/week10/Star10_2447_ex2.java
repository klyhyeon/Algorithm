package baekJoon.week10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Star10_2447_ex2 {

        static StringBuilder sb = new StringBuilder();

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    solve(i, j);
                }
                sb.append("\n");
            }
            System.out.println(sb.toString());
        }

        static void solve(int y, int x) {
            while (true) {
                if (y == 0)
                    break;
                if (y % 3 == 1 && x % 3 == 1) {
                    sb.append(" ");
                    return;
                }
                y /= 3;
                x /= 3;
            }
            sb.append("*");
    }
}
