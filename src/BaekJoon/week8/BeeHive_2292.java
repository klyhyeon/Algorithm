package baekJoon.week8;
/*
    육각형으로 이루어진 벌집은 이웃하는 방에 돌아가면서 1씩 증가하는 번호를
    주소로 매길 수 있다. N이 주어졌을 때, 중앙 1에서 N번 방까지 최소 개수 방을 지나서 갈 때
    최소 개수 방의 수는?
 */

import java.util.Scanner;

public class BeeHive_2292 {
    static int n;
    static int nMinus;
    static int cnt = 1;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        nMinus = n - 1;

        //1이 주어지면 1을 그대로 반환
        if (n == 1) {
            System.out.println(1);
        }

        if (n != 1) {
            while (true) {
                //6의 배수로 맞추기 위해 시작점 1을 0으로 둠. 시작점을 count 하지 않기 때문에 출력 시 + 1을 해줘야됨.
                nMinus -= (6 * cnt);
                if (nMinus <= 0) break;
                cnt++;
            }
            System.out.println(cnt + 1);
        }
    }

}
