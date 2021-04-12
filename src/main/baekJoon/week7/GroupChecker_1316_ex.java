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

public class GroupChecker_1316_ex {

    static int N;
    static String val;
    static boolean[] ck;
    static boolean group;
    static char old;
    static char nw;
    static int cnt = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {

            val = br.readLine();
            //true가 이미 나온 알파벳
            ck = new boolean[26];
            //그룹인지 아닌지 지시어
            group = false;
            //바로 직전 값
            old = val.charAt(0);
            //이미 나온 알파벳을 true로 변환
            ck[old - 97] = true;
            //그룹이 아닌 조건 : ck[i] = true; 면서 old와 다른 친구

            for (int j = 1; j < val.length(); j++) {

                nw = val.charAt(j);
                //그룹일 때
                if (!ck[nw - 97] && nw != old) {

                    ck[nw - 97] = true;
                    old = nw;
                }
                //그룹이 아닐 때
                else if (ck[nw - 97] && nw != old) {

                    group = true;
                    break;
                }
            } //단어 글자 반복문 종료

            if(!group) cnt++;
        } // 전체 반복문 종료

        System.out.println(cnt);


    }
}
