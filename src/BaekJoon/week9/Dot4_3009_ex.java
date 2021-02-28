package baekJoon.week9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Dot4_3009_ex {

    private static int[] dots = new int[6];
    private static int k;
    private static int x;
    private static int y;
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        for (int i = 0; i < 3; i++) {
            st = new StringTokenizer(br.readLine());
            dots[k] = Integer.parseInt(st.nextToken());
            dots[++k] = Integer.parseInt(st.nextToken());
            k++;
        }

        for (int i = 2; i < 5; i+=2) {
            if (dots[0] == dots[i]) {
                if (i == 2) {
                    x = dots[4];
                } else {
                    x = dots[2];
                }
            } else {
                x = dots[0];
            }
        } //x 구하기

        for (int i = 3; i < 6; i+=2) {
            if (dots[1] == dots[i]) {
                if (i == 3) {
                    x = dots[5];
                } else {
                    x = dots[3];
                }
            } else {
                x = dots[1];
            }
        } //y 구하기

        System.out.printf("%d %d",x,y);

    }
}
