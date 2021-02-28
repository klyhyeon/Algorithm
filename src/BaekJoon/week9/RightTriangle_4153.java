package baekJoon.week9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class RightTriangle_4153 {
    private static int x;
    private static int y;
    private static int z;
    private static int max;
    private static int min;

    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        while (true) {

            st = new StringTokenizer(br.readLine());
            x = Integer.parseInt(st.nextToken());
            y = Integer.parseInt(st.nextToken());
            z = Integer.parseInt(st.nextToken());

            if (x == 0)
                break;
            else {
                if (x > y) {
                    max = x;
                    min = y * y;
                } else {
                    max = y;
                    min = x * x;
                }
                if (max > z) {
                    min += z * z;
                } else {
                    min += max * max;
                    max = z;
                }
            }
            if (min == (max * max))
                sb.append("right" + "\n");
            else
                sb.append("wrong" +"\n");
        } //while 종료

        System.out.println(sb);

    }
}
