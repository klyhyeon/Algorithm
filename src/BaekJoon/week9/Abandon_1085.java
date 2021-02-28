package baekJoon.week9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Abandon_1085 {

    private static int x;
    private static int y;
    private static int w;
    private static int h;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        x = Integer.parseInt(st.nextToken());
        y = Integer.parseInt(st.nextToken());
        w = Integer.parseInt(st.nextToken());
        h = Integer.parseInt(st.nextToken());

        System.out.println(distance(x, y, w, h));
    }

    private static int xDis1;
    private static int xDis2;
    private static int yDis1;
    private static int yDis2;
    private static int minX;
    private static int minY;
    public static int distance(int x, int y, int w, int h) {
        xDis1 = w - x;
        xDis2 = x; //0 왜 썼니ㅋㅋ
        minX = Math.min(xDis1,xDis2);
        yDis1 = h - y;
        yDis2 = y;
        minY = Math.min(yDis1,yDis2);

        return Math.min(minX, minY);
    }

}
