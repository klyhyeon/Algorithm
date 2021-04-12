package baekJoon.week9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Turret_1002_ex {

    private static int T;
    private static int x1;
    private static int x2;
    private static int y1;
    private static int y2;
    private static int r1;
    private static int r2;
    private static int distancePow;
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

            distancePow = (int) (Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));


            //좁은 범위의 조건문을 맨 위에 써줘야함
            if (r1 == r2 && x1 == x2 && y1 == y2) {
                cnt = -1;
            }

            else if (Math.pow(r1 + r2, 2) < distancePow ||
                    (Math.pow(r1 - r2, 2) > distancePow)) {
                cnt = 0;
            }

            //찾는 좌표가 하나일 때(1) - 외접, 내접
            else if ((Math.pow(r1 + r2, 2) == distancePow ||
                    (Math.pow(r1 - r2, 2) == distancePow))) {
                cnt = 1;
            }

            else {
                cnt = 2;
            }
            //3. 찾는 좌표가 둘일 때(2) - 접점이 두 개
//            else if ((Math.pow((r1 + r2), 2) > distancePow &&
//                    Math.pow(Math.max(r1, r2), 2) < distancePow)) {
//                cnt = 2;
//            }
            sb.append(cnt + "\n");
        } //테스트 케이스 while문 종료
        System.out.println(sb);
    }

}
