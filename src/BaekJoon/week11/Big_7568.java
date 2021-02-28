package baekJoon.week11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Big_7568 {
    static int[][] info;
    static int temp = 0;
    static int N;
    static int cnt = 1;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        N = Integer.parseInt(br.readLine());
        info = new int[N][2];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
                info[temp][0] = Integer.parseInt(st.nextToken()); //kg
                info[temp][1] = Integer.parseInt(st.nextToken()); //cm
                temp++;
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (info[i][0] < info[j][0]
                && info[i][1] < info[j][1])
                    cnt++;
            }
            sb.append(cnt + " ");
            cnt = 1;
        }

        System.out.println(sb);

    }
}
