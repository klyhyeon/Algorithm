package baekJoon.week11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ColorChess_1018 {

    static char[][] answerBlk;
    static char[][] answerWht;
    static int M;
    static int N;
    static char[][] testChess;
    static int min;
    static int cntBlk = 0;
    static int cntWht = 0;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        //기준 체스판 칠하기
        answerBlk = new char[8][8];
        answerWht = new char[8][8];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (j % 2 == 0 && i % 2 == 0) {
                    answerBlk[i][j] = 'B';
                    answerWht[i][j] = 'W';
                } else if (j % 2 == 0 && i % 2 != 0){
                    answerBlk[i][j] = 'W';
                    answerWht[i][j] = 'B';
                } else if (j % 2 != 0 && i % 2 == 0){
                    answerBlk[i][j] = 'W';
                    answerWht[i][j] = 'B';
                } else {
                    answerBlk[i][j] = 'B';
                    answerWht[i][j] = 'W';
                }
            }
        }
        //비교 체스판 받기
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        testChess = new char[N][M];
        for (int n = 0; n < N; n++) {
            String temp = br.readLine();
            for (int m = 0; m < M; m++) {
                testChess[n][m] = temp.charAt(m);
            }
        }

        //체스판 비교해서 최소값 반환
        for (int i = 0; i <= N - 8; i++) {
            for (int j = 0; j <= M - 8; j++) {
                for (int k = 0; k < 8; k++) {
                    for (int l = 0; l < 8; l++) {
                        if (testChess[i + k][j + l] != answerBlk[k][l]) {
                            cntBlk++;
                        }
                        if (testChess[i + k][j + l] != answerWht[k][l]) {
                            cntWht++;
                        }
                    }
                }
                min = Math.min(cntBlk, cntWht);
                cntBlk = 0;
                cntWht = 0;
            }
        }

        System.out.println(min);

    }
}
