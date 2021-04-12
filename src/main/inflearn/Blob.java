package inflearn;
/*
    현재 픽셀이 image color가 아니라면 0을 반환 = basecase
    현재 픽셀이 image color라면 현재 픽셀을 카운트 한다 (count=1)
    현재 픽셀이 중복 카운트되는 것을 방지하기 위해 다른 색으로 칠한다.
    인접한 8개의 픽셀 각각에 대해 그 픽셀이 포함된 blob의 크기를 count 한다.
 */
public class Blob {

    /*
    Algorithm for countCells(x, y)
    if the pixel(x,y) is outside the grid
        the result is 0;
    else if pixel (x,y) is not an image pixel or already counted
        the result is 0;
    else
        set the colour of the pixel(x,y) to a red colour;
        the result is 1 plus the number of cells in each piece of
        the blob that includes a nearest neighbour;
     */
    private static int backGroundColor = 0;
    private static int imageColor = 1;
    private static int alreadyCounted = 2;
    private static int N; //정사각형 크기
    private static int[][] grid = new int[N][N];
    public int countCells(int x, int y) {
        if (x<0 || x>=N || y<0 || y>=N)
            return 0;
        else if (grid[x][y] != imageColor)
            return 0;
        else {
            grid[x][y] = alreadyCounted;
            return 1 + countCells(x,y+1) + countCells(x+1,y+1) + countCells(x+1,y)
                    + countCells(x+1,y-1) + countCells(x,y-1) + countCells(x-1,y-1)
                    + countCells(x-1,y) + countCells(x-1,y+1);
        }

    }
}
