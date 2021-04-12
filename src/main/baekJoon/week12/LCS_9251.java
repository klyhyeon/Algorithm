package baekJoon.week12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LCS_9251 {

    static String a;
    static String b;
    static int aLeng;
    static int bLeng;
    static char[] aChar = new char[1001];
    static char[] bChar = new char[1001];
    static int[][] LCS = new int[1001][1001];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        a = br.readLine();
        b = br.readLine();
        aLeng = a.length();
        bLeng = b.length();

        aChar = a.toCharArray();
        bChar = b.toCharArray();

        for (int i = 1; i <= a.length(); i++) {
            for (int j = 1; j <= b.length(); j++) {
                if (aChar[i - 1] == bChar[j - 1]) {
                    LCS[i][j] = LCS[i - 1][j - 1] + 1;
                } else {
                    LCS[i][j] = Math.max(LCS[i - 1][j], LCS[i][j - 1]);
                }
            }
        }

        System.out.println(LCS[aLeng][bLeng]);
        br.close();


    }


}
