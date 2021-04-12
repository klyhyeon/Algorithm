package baekJoon.week6;
/*
    세준이는 시험점수를 조작하기 위해 자기 점수 중 최댓값을 골랐다. M이라고 한다.
    그리고 모든 점수를 점수 / M*100 으로 고쳤다. 새로운 평균을 구하여라
    - 입력: 첫째 줄엔 과목의 개수 N이 주어짐. 1000보다 작거나 같음. 둘째 줄에 공백을 두고 세준이의 현재 성적이 주어짐(100보다 작거나 같은 자연수)
    - 출력: 첫째 줄엔 새로운 평균을 출력. 실제 정답과 출력값의 오차가 10^-2 이하이면 정답(0.01)
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Average_1546 {

    static int N;
    static double M;
    static double[] score;
    static double total;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());

        score = new double[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            score[i] = Integer.parseInt(st.nextToken());
        }
        //sort 메서드 대신 int max 선언하여 score[i] > max (if문) , max = score[i]로 쓸 수 있음
        Arrays.sort(score);

        int length = score.length;
        M = score[length - 1];

        for (int i = 0; i < length; i++) {
            score[i] = score[i] / M * 100;
        }

        for (double n :
                score) {
            total += n;
        }

        System.out.println(total / length);

    }
}
