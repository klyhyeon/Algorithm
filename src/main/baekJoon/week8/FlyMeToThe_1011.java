package baekJoon.week8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class FlyMeToThe_1011 {
    static int T;
    static int max;
    static int cnt;
    static int distance;
    static int x;
    static int y;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            st = new StringTokenizer(br.readLine());
            x = Integer.parseInt(st.nextToken());
            y = Integer.parseInt(st.nextToken());
            distance = y - x;
            max = (int) Math.sqrt(distance);
            cnt = (max * 2) - 1;

            if (distance == 3)
                cnt = 3;
            else if (distance > (int) Math.pow(max, 2) + max) {
                cnt += 2;
            } else if (distance > (int) Math.pow(max, 2)) {
                cnt += 1;
            }

            System.out.println(cnt);
        }
    }
}
