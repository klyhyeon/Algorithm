package scofe;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PostTest3Brandy {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] nm = br.readLine().split(" ");
        int col = Integer.parseInt(nm[0]);
        int row = Integer.parseInt(nm[1]);
        int[][] map = new int[row][col];
        int i = 0;
        while (row-- > 0) {
            String[] tempRowInfo = br.readLine().split(" ");
            for (int x = 0; x < tempRowInfo.length; x++) {
                map[i][x] = Integer.parseInt(tempRowInfo[x]);
            }
            i++;
        }
        int answer = 0;
        answer = getMaxClothes(map, col, row);
    }

    public static int getMaxClothes(int[][] map, int col, int row) {
        /*  dp[0][1] = dp[0][1] + dp[0][0]
            dp[row][column] = map[row][column] + MAX(map[row-1][column],dp[row][column-1])
         */
        int[][] dp = new int[row][col];
        dp[row][col] = map[row][col] + Math.max(dp[row-1][col], dp[row][col-1]);
        return dp[row-1][col-1];
    }
}
