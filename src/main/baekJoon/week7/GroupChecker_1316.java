package baekJoon.week7;
/*
    그룹단어란 한 문자가 연속해서 나타나는 경우만을 말한다. 각 문자는 붙어있어야 한다. 갯수는 상관없다.
    단어 N개를 입력 받아 그룹 단어의 개수를 출력하는 프로그램을 작성하시오.
    - 입력: 첫째 줄에 단어의 개수 N이 들어온다. 100보다 작거나 같은 자연수. 둘째 줄부터 N개의 단어가 들어온다. 소문자이고 중복되지 않으며
    길이는 최대 100이다.
    - 출력: 첫째 줄에 그룹 단어의 개수를 출력한다.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GroupChecker_1316 {

    static int N;
    static String val;
    static char[] valAlphas;
    static int k = 0;
    static int div;
    static int cnt = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {

            val = br.readLine();
            valAlphas = new char[val.length()];

            for (int j = 0; j < val.length() - 1; j++) {

                if (val.charAt(j) == val.charAt(j + 1)) {

                } else {

                    for (char alpha :
                            valAlphas) {

                        if (alpha == val.charAt(j + 1)) {

                            div++;
                        }
                    }

                    valAlphas[k] = val.charAt(j);
                    k++;
                }
            } //단어 글자 반복문 종료
            if (div < 1) cnt++;
            //초기화
            div = 0;
            k = 0;
        }

        System.out.println(cnt);


    }
}
