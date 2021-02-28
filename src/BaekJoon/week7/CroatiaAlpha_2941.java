package baekJoon.week7;
/*
    크로아티아 알파벳을 변경해서 입력했다. 표에 있는 문자는 한 단어다. 변경된 알파벳이 주어지면 크로아티아 알파벳으로 몇 글자인지 출력하라
    - 입력: 첫째 줄에 최대 100글자의 단어가 주어진다. 알파벳 소문자와 '-', '=' 로만 이루어져 있다.
    - 출력: 몇개의 크로아티아 알파벳으로 이루어져 있는지 출력하라.
 */
//입력된 알파벳 글자 수 - (크로아티아 알파벳 글자 수 총합) = 크로아티아 아닌 글자 수
// + 크로아티아 알파벳 수 = 총 크로아티아 알파벳 수
//**중복이 있을 때 count 못함
//GG.
//다른 사람 블로그 보니까 String Startwith 메서드를 활용하면 된다고 한다.
//https://javachoi.tistory.com/265?category=1079371

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CroatiaAlpha_2941 {

    static String code;
    static char[] codeAlphas;
    static String[] croAlphas;
    static int croCnt = 0;
    static int croLength = 0;
    static int croTotal = 0;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        code = br.readLine();
        codeAlphas = code.toCharArray();

        croAlphas = new String[]{"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};

//        for (String alpha :
//                croAlphas) {
//
//            if (code.contains(alpha)) {
//
//                croCnt++;
//                croLength += alpha.length();
//            }
//        }

        for (int i = 0; i < code.length() - 1; i++) {

            for (int j = 0; j < croAlphas.length; j++) {


                if (i < code.length() - 2) {

                    if (code.substring(i, i + 3).equals("dz=")) {

                        croCnt++;
                        croLength += 3;
                    } else if (code.substring(i, i + 2).equals(croAlphas[j])) {

                        croCnt++;
                        croLength += croAlphas[j].length();
                    }
                } else if (code.substring(i, i + 2).equals(croAlphas[j])) {

                    croCnt++;
                    croLength += croAlphas[j].length();
                }

            }
        }

        croTotal = (code.length() - croLength) + croCnt;

        System.out.println(croTotal);

    }
}
