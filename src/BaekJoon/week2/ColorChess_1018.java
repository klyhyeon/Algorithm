package baekJoon.week2;
/*
    - 체스판은 BWBW 검정 하얀색이 교대로 칠해져야 한다.
    - 주어진 체스판은 BWBWBW 형태로 생겼다.
    - 8*8 체스판을 만들어야 하는데 색을 다시 칠해야하는 최소 칸의 개수를 출력.
        - 입력: (8 <= N,M <= 50), 1~N행에는 M개의 칸 색이 입력된다.
        - 출력: 색칠 해야하는 최소 칸의 개수
 */
/*
    - 2차원 배열? index 1에 1행, 2에 2행 내용물....
    - 8*8은 아무렇게나 잘라도 된다?
    - 그럼 1행 1번부터 시작해도되나 무조건? 색은 어떻게 결정해야되지.
    - 모르겠다,.
 */
/*
    - 5일간 끙끙 앓다가 알아냄
    참고사이트: https://blog.naver.com/jbj616/221444413560
 */


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ColorChess_1018 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //N, M 초기화 선언
        String[] arr = br.readLine().split(" ");
        int n = Integer.parseInt(arr[0]);
        int m = Integer.parseInt(arr[1]);


        //브루트포스로 비교할 기준 색깔판
        String bf = "BWBWBWBW";
        String wf = "WBWBWBWB";
        //검은색이 먼저인 판, 흰색이 먼저인 판
        char[][] bPan = new char[8][8];
        char[][] wPan = new char[8][8];
        
        for(int i = 0; i < 8; i++) {
            for(int j = 0; j < 7; j++) {
                if(i % 2 == 0) {
                    bPan[i] = bf.toCharArray();
                    wPan[i] = wf.toCharArray();
                } else {
                    bPan[i] = wf.toCharArray();
                    wPan[i] = bf.toCharArray();
                }
            }
        }

        //사용자가 입력할 색깔판
        char[][] color = new char[n][m];
        for(int i = 0; i < n; i++) {
            color[i] = br.readLine().toCharArray();
        }

        //bPan과 비교
        //wPan과 비교
        //M*N 배열에서 만들 수 있는 모든 체스판과 비교해야한다 x, i = 행 변경. y, j = 열 변경
        int bCount = 0;
        int wCount = 0;
        int min = Integer.MAX_VALUE;
                for(int x = 0; x < n - 7; x++) {
                    for(int y = 0; y < m - 7; y++) {

                        for(int i = 0; i < 8; i++) {
                            for(int j = 0; j < 8; j++) {
                                //시작점 0,0가 검정색일 때 기준으로 체스판에 행렬(x,y)로 표시하면, 더해서 짝수면 검정, 홀수면 흰색이다.
                                //이 점을 이용해서 if문 조건을 변형해줄 수 있다.
                                if((i + j)%2 == 0) {
                                    if(color[x+i][y+j] != 'B') {
                                        bCount++;
                                    }
                                } else {
                                    if(color[x+i][y+j] != 'W') {
                                        bCount++;
                                    }
                                }

//                                if(bPan[i][j] != color[i+x][j+y]) {
//
//                                    bCount ++;
//
//                                }

                    }
                }
                                //시작 색깔이 반대일 때 64를 빼준다.
                                min = Math.min(Math.min(64-bCount, bCount),min);
                                bCount = 0;

            }
    }
        System.out.println(min);

        }

}
