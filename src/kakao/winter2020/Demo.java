package kakao.winter2020;

import java.util.Arrays;

public class Demo {

    static int[][] v;
    static int[] answer;
    static int x;
    static int y;
    static int cntX;
    static int cntY;


    public static void main(String[] args) {

        v = new int[][]{{1, 4}, {3, 4}, {3, 10}};
        System.out.println(Arrays.toString(solution(v)));
    }

    public static int[] solution(int[][] v) {


        for (int i = 0; i < 3; i++) {

            cntX = 0;
            cntY = 0;

            for (int j = 0; j < 3; j++) {

                if(v[i][0] == v[j][0]) {
                    cntX++;
                }
                if(v[i][1] == v[j][1]) {
                    cntY++;
                }
            }
            
            if(cntX == 1) x = v[i][0];
            if(cntY == 1) y = v[i][1];

        }

        answer = new int[]{x, y};
        return answer;
    }
}


