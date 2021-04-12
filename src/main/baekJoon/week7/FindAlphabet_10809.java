package baekJoon.week7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
    알파벳 소문자로만 이루어진 단어 S가 주어짐.
    - 입력: 단어 S가 주어짐 단어의 길이는 100을 넘지 않는다.
    - 출력: a가 처음 등장하는 위치, b가 처음 등장하는 위치... z가 처음 등장하는 위치를 공백으로 구분해서 출력한다. 0부터 시작한다. 등장
    하지 않으면 -1을 반환한다.
 */
public class FindAlphabet_10809 {

    static char[] input;
    static char[] alpha;
    static int[] val;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        input = br.readLine().toCharArray();

        alpha = new char[26];

        for (int i = 0; i < 26; i++) {

            alpha[i] = (char) (i + 97);
        }

        val = new int[26];
        for (int i = 0; i < 26; i++) {

            val[i] = -1;
        }

        for (int i = 0; i < input.length; i++) {

            for (int j = 0; j < alpha.length; j++) {

                if (input[i] == alpha[j]) {
                    if (val[j] == -1) {
                        val[j] = i;
                    } else {

                    }
                }
            }
        }

        for (int index :
                val) {

            System.out.print(index + " ");
        }


    }
}
