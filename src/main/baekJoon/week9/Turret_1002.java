package baekJoon.week9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Turret_1002 {

    private static int T;
    private static int x1;
    private static int x2;
    private static int lengX;
    private static int lengY;
    private static int y1;
    private static int y2;
    private static int r1;
    private static int r2;
    private static int cnt = 0;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        st = new StringTokenizer(br.readLine());
        T = Integer.parseInt(st.nextToken());
        while (T-- > 0) {
            cnt = 0;

            st = new StringTokenizer(br.readLine());
            x1 = Integer.parseInt(st.nextToken());
            y1 = Integer.parseInt(st.nextToken());
            r1 = Integer.parseInt(st.nextToken());

            x2 = Integer.parseInt(st.nextToken());
            y2 = Integer.parseInt(st.nextToken());
            r2 = Integer.parseInt(st.nextToken());

            lengX = ((Math.max(Math.abs(x1), Math.abs(x2)) + Math.max(r1, r2)));
            lengY = ((Math.max(Math.abs(y1), Math.abs(y2)) + Math.max(r1, r2)));

            for (int i = -lengX + 1; i < lengX; i++) {
                for (int j = -lengY + 1; j < lengY; j++) {
                    if (((r1 * r1) == (((Math.abs(x1) - Math.abs(i)) * (Math.abs(x1) - Math.abs(i)))
                            + ((Math.abs(y1) - Math.abs(j)) * (Math.abs(y1) - Math.abs(j)))))
                            && ((r2 * r2) == (((Math.abs(x2) - Math.abs(i)) * (Math.abs(x2) - Math.abs(i)))
                            + ((Math.abs(y2) - Math.abs(j)) * (Math.abs(y2) - Math.abs(j)))))) {
                        cnt++;
                    }
                }
            } //개별 케이스 for문 종료
            sb.append(cnt + "\n");
        } //테스트 케이스 while문 종료
        System.out.println(sb);

    }

}
