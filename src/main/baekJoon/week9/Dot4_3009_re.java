package baekJoon.week9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Dot4_3009_re {

    static int T;
    static int x;
    static int y;
    static int[] group = new int[6];
    static int k;

    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        k = 0;
        for (int i = 0; i < 3; i++) {
            st = new StringTokenizer(br.readLine());
            x = Integer.parseInt(st.nextToken());
            y = Integer.parseInt(st.nextToken());
            group[k] = x;
            group[++k] = y;
            k++;
        }

        //x구하기
        if (group[0] == group[2])
            x = group[4];
        else if (group[0] == group[4])
            x = group[2];
        else x = group[0];

        //y구하기
        if (group[1] == group[3])
            y = group[5];
        else if (group[1] == group[5])
            y = group[3];
        else y = group[1];

        System.out.printf("%d %d", x, y);
    }

}
