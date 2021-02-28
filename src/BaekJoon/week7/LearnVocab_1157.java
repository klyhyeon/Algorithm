package baekJoon.week7;
/*
    알파벳 대소문자로 된 단어가 주어지면, 이 단어에서 가장 많이 사용된 알파벳이 뭔지 알아내는 프로그램을 작성하시오.
    단, 대소문자를 구분하지 않는다.
    - 입력: 첫째 줄에 알파벳 대소문자로 이루어진 단어가 주어진다. 주어지는 단어의 길이는 1,000,000을 넘지 않는다.
    - 출력: 첫째 줄에 이 단어에서 가장 많이 사용된 알파벳을 대문자로 출력한다. 단, 가장 많이 사용된 알파벳이 여러 개 존재하는 경우엔
    ?를 출력한다.
 */

import java.io.*;
import java.util.Arrays;

public class LearnVocab_1157 {

    static String vocab;
    static int max = 0;
    static char maxAlpha;
    static char[] vocabs;
    static int[] cnt;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        vocab = br.readLine();

        bw.write(maxVocab(vocab));
        bw.flush();

        bw.close();
        br.close();
    }

    public static char maxVocab(String str) {

        vocabs = str.toCharArray();
        cnt = new int[123];

        for (int i = 0; i < vocab.length(); i++) {

            vocabs[i] = Character.toLowerCase(vocabs[i]);
        }

        Arrays.sort(vocabs);

        if (vocabs.length == 1) {

            return Character.toUpperCase(vocabs[0]);
        } else {

            for (int i = 1; i < vocabs.length; i++) {

                if (vocabs[i - 1] == vocabs[i]) {

                    cnt[(int) vocabs[i]]++;
                }
            }

            for (int i = 97; i < cnt.length; i++) {

                if (cnt[i] > max) {

                    max = cnt[i];
                    maxAlpha = (char) i;
                } else if (cnt[i] == max) {

                    maxAlpha = '?';
                }
            }

            return Character.toUpperCase(maxAlpha);
        }
    }
}
