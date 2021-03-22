package scofe;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Test4Watcha_extend {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String inputScores = br.readLine();
        StringTokenizer st = new StringTokenizer(inputScores);
        String A = "";
        String B = "";
        String C = "";
        String D = "";
        String E = "";
        while (st.hasMoreTokens()) {
            A = st.nextToken();
            B = st.nextToken();
            C = st.nextToken();
            D = st.nextToken();
            E = st.nextToken();
        }
        st = new StringTokenizer(br.readLine());
        int y = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());
        int length = x*y;
        String[][] movieInfo = new String[2][length];
        String genreInfoLines = "";
        for (int i = 0; i < y; i++) {
            genreInfoLines += br.readLine();
        }

        String[] genreScoreInfo = new String[length];
        for (int i = 0; i < length; i++) {
            switch (Character.toString(genreInfoLines.charAt(i))) {
                case "A":
                    genreScoreInfo[i] = A;
                    break;
                case "B":
                    genreScoreInfo[i] = B;
                    break;
                case "C":
                    genreScoreInfo[i] = C;
                    break;
                case "D":
                    genreScoreInfo[i] = D;
                    break;
                case "E":
                    genreScoreInfo[i] = E;
                    break;
            }

        }

        String watchInfoLines = "";
        for (int i = 0; i < y; i++) {
            watchInfoLines += br.readLine();
        }

        for (int i = 0; i < length; i++) {
            movieInfo[0][i] = genreScoreInfo[i];
            movieInfo[1][i] = Character.toString(genreInfoLines.charAt(i));
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            if (movieInfo[1][i].equals("Y")) {

            }
        }


    }
}

