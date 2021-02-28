package wootechcourse;

public class Test_7 {

    static int n;
    static int answer[][];
    static int cursorCnt = 1;

    public int[][] solution(int n, boolean horizontal) {

        return answer;
    }

    public static boolean findWay(int x, int y) {
        boolean flag = true;

        if (x == n - 1 && y == n - 1) {
            answer[x][y] = cursorCnt++;
        } else if (y == 0) {
            findWay(x, y + 1);
        } else if (x == 0) {
            findWay(x, y + 1);
        } else if (flag) {
            findWay(x - 1, y + 1);
        } else if (!flag) {
            findWay(x + 1, y - 1);
        }
        return true;
    }


}
