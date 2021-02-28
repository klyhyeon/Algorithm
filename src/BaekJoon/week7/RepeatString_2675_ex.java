package baekJoon.week7;
/*
    문자열 S를 입력받은 후 각 문자를 R번 반복해 새 문자열 P를 만든 후 출력
    - 입력: 첫째 줄에 테스트 케이스 개수 T가 주어진다 (1~1000) 다음 줄부터 각 반복횟수와 문자열 S가 공백으로 구분돼 주어진다.
    S의 길이는 (1~20)임
    - 출력: 각 테스트 케이스에 대해 P를 출력한다.
 */

import java.io.*;
import java.util.StringTokenizer;

public class RepeatString_2675_ex {

    static int T;
    static int R;
    static String S;
    static char C;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {

            st = new StringTokenizer(br.readLine());
            R = Integer.parseInt(st.nextToken());
            S = st.nextToken();

            for (int j = 0; j < S.length(); j++) {

                C = S.charAt(j);

                for (int k = 0; k < R; k++) {

                    bw.write(C);
                }
            }

            bw.write("\n");
        }

        bw.flush();
    }
}
