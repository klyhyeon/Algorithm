package inflearn;

public class Maze {
    private static int N;
    private static int[][] maze = new int[N][N];
    private static int pathWayColor;
    private static int pathColor;
    private static int blockedColor;

    public static boolean findMazePath(int x, int y) {
        if (x<0 || y<0 || x>= N || y>=N)
            return false;
        else if (maze[x][y] != pathWayColor)
            return false;
        else if (x==N-1 && y==N-1) {
            maze[x][y] = pathColor;
            return true;
        }
        else {
            maze[x][y] = pathColor;
            if (findMazePath(x-1,y) || findMazePath(x,y+1)
            || findMazePath(x+1,y) || findMazePath(x,y-1)) {
                return true;
            }
            maze[x][y] = blockedColor; //dead end = 동서남북 모두 길없음
            return false;
        }
    }
}
