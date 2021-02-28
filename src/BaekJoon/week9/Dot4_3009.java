package baekJoon.week9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Dot4_3009 {

    private static int[][] dots = new int[3][2];
    private static int[] x = new int[1001];
    private static int[] y = new int[1001];
    private static int answerX;
    private static int answerY;
    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        for (int i = 0; i < 3; i++) {
            st = new StringTokenizer(br.readLine());
            dots[i][0] = Integer.parseInt(st.nextToken());
            dots[i][1] = Integer.parseInt(st.nextToken());
        } //점 3개 담기 완료

        for (int i = 0; i < 3; i++) {
            x[dots[i][0]]++;
            y[dots[i][1]]++;
        }

        for (int i = 0; i < 1000; i++) {
            if (x[i] == 1)
                answerX = i;
            if (y[i] == 1)
                answerY = i;
        }

        System.out.printf("%d %d",answerX, answerY);

    }
}
