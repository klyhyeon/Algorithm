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
        int reps = row;
        int[][] map = new int[row][col];
        int[][] dp = new int[row][col];
        int i = 0;
        while (reps-- > 0) {
            String[] tempRowInfo = br.readLine().split(" ");
            for (int x = 0; x < tempRowInfo.length; x++) {
                map[i][x] = Integer.parseInt(tempRowInfo[x]);
            }
            i++;
        }
        int answer = getMaxClothes(map, dp, col-1, row-1);
        System.out.println(answer);
    }

    public static int getMaxClothes(int[][] map, int[][] dp, int col, int row) {
        if (col == 0 && row == 0) {
            return map[row][col];
        } else if (col == 0 && row == 1) {
            dp[row][col] = map[row][col] + map[row-1][col];
            return dp[row][col];
        } else if (row <= 0 && col == 1) {
            dp[row][col] = map[row][col] + map[row][col-1];
            return dp[row][col];
        }
        dp[row][col] = map[row][col] + Math.max(getMaxClothes(map, dp, row-1, col), getMaxClothes(map, dp, row, col-1));
        return dp[row][col];
    }
}