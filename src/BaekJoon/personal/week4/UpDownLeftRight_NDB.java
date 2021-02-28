
package baekJoon.personal.week4;
/*
    - 여행가 A씨는 N x N 크기의 정사각형 위 1 x 1 크기의 정사각형으로 나누어져 있습니다.
    가장 왼쪽 위 좌표는 (1,1)이며, 가장 오른쪽 아래 좌표는 (N,N)에 해당됨
    여행가는 상, 하, 좌, 우 방향으로 이동할 수 있으며, 시작좌표는 항상 (1,1)임
    우리 앞에는 여행가 A가 이동할 계획이 적힌 계획서가 놓여 있습니다.

    계획서에는 하나의 줄게 띄어쓰기를 기준으로 하여 L, R, U, D 중 하나의 문자가 반복적으로 적혀 있습니다.
    각 문자의 의미는 다음과 같습니다.
        - L: 왼쪽으로 한 칸 이동
        - R: 오른쪽으로 한 칸 이동
        - U: 위로 한 칸 이동
        - D: 아래로 한 칸 이동

    이때 여행가가 정사각형 공간을 벗어나는 움직임은 무시됩니다. 예를 들어 (1,1)의 위치에서
    L 혹은 U를 만나면 무시됩니다.

        - 입력:
        첫째 줄에 공간의 크기를 나타내는 N이 주어짐( 1<= N <= 100)
        둘째 줄에 여행가 A가 이동할 계획서 내용이 주어집니다. (1<= 이동 횟수 <= 100)
        - 출력:
        여행가가 최종적으로 도착할 지점의 좌표(X,Y)를 공백을 기준으로 구분하여 출력
        5   R R R U D D -> 3 4
 */

import java.io.*;

public class UpDownLeftRight_NDB {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());

        char[] arg = br.readLine().toCharArray();
        int x = 1;
        int y = 1;

        for(char c :
            arg) {
            if (c == 'L') {
                if(y == 1) {

                } else {
                    y--;
                }
            } else if(c == 'R') {
                if(y == num) {

                } else {
                    y++;
                }
            } else if(c == 'U') {
                if(x == 1) {

                } else {
                    x--;
                }
            } else if(c == 'D') {
                if(x == num) {

                } else {
                    x++;
                }
            }
        } //end for

        bw.write(x + " " + y);
        bw.flush();
        bw.close();
        br.close();

        //다른코드 -> 자바는 더 복잡. 파이썬은 간결

//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//        //입력값
//
//        int num = Integer.parseInt(br.readLine());
//        String[] arg = br.readLine().split(" ");
//        //변수지정
//        int x = 1;
//        int y= 1;
//        int nx = 0;
//        int ny = 0;
//        //명령에 따른 이동방향
//        String[] moveType = {"L", "R", "U", "D"};
//        int[] dx = {0, 0, -1, 1};
//        int[] dy = {-1, 1, 0, 0};
//
//        for(String c : arg) {
//            for(int i = 0; i < moveType.length; i++) {
//                if(c.equals(moveType[i])) {
//                    nx = x + dx[i];
//                    ny = y + dy[i];
//                    //이동제한 경우의 수 : 4가지 제한
//                    if(nx == 0) {
//                        nx++;
//                    } else if(ny == 0) {
//                        ny++;
//                    } else if(nx > num) {
//                        nx--;
//                    } else if(ny > num) {
//                        ny--;
//                    }
//                    x = nx;
//                    y = ny;
//                }
//            }
//        }
//
//        System.out.println(nx + " " + ny);
    }
}