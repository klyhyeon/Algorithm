package baekJoon.week7;
/*
    영어 대소문자와 띄어쓰기만으로 이루어진 문자열이 주어진다. 이 문자열에는 몇 개의 단어가 있을까?
    이를 구하라. 단 한 단어가 여러 번 등장하면 등장한 횟수만큼 모두 세어야 한다.
    - 입력: 첫 줄에 문자열이 주어진다. 이 문자열의 길이는 1,000,000을 넘지 않는다. 단어는 띄어쓰기로 구분된다.
    공백이 나오는 경우는 없다. 또한 문자열의 앞과 뒤에는 공백이 있을 수도 있다.
    - 출력: 첫째 줄에 단어의 개수를 출력한다.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class NumVocab_1152 {

    static int cnt;
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());

        while(st.hasMoreTokens()) {

            st.nextToken();
            cnt++;
        }

        System.out.println(cnt);
    }
}
