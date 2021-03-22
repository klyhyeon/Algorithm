package scofe;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Test4Watcha {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String inputScores = br.readLine();
        StringTokenizer st = new StringTokenizer(inputScores);
        ArrayList<Double> scoreList = new ArrayList<>();
        while (st.hasMoreTokens()) {
            scoreList.add(Double.parseDouble(st.nextToken()));
        }
        st = new StringTokenizer(br.readLine());
        int y = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());
        char[][] watchInfo = new char[x][y];
        for (int i = 0; i < y; i++) {
            String watchInfoLine = br.readLine();
            for (int j = 0; j < x; j++) {
                watchInfo[i][j] = watchInfoLine.charAt(j);
            }
        }
        char[][] genreInfo = new char[x][y];
        for (int i = 0; i < y; i++) {
            String genreInfoLine = br.readLine();
            for (int j = 0; j < x; j++) {
                genreInfo[i][j] = genreInfoLine.charAt(j);
            }
        }
        for (int i = 0; i < y; i++) {
            for (int j = 0; j < x; j++) {
                if (watchInfo[i][j] == 'Y') {

                }
            }
        }

    }
}

