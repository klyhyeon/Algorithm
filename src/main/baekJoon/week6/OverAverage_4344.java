package baekJoon.week6;
/*
    평균이 넘지 않는다는 슬픈 진실.
    - 입력: 첫째 줄엔 테스트 케이스 개수 C, 둘째 줄부터 각 테스트 케이스 마다 학생의 수(1보다 크고 1000보다 작음) 첫수가 주어짐
    이어서 N명의 점수가 주어짐. 점수는 0보다 크고 100보다 작거나 같음
    - 출력: 각 케이스마다 한 줄 씩 평균을 넘는 학생들의 비율을 반올림 하여 소수점 셋째 자리까지 출력한다.
 */
//반복문이 길어지면 sum, cnt 같은 변수 0으로 초기화 해줬는지 check 필수!

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class OverAverage_4344 {

    static int C;
    static List<Integer> score;
    static double avg;
    static int sum;
    static int cnt = 0;
    static double ratio;
    static int stu;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());

        C = Integer.parseInt(st.nextToken());

        for (int i = 0; i < C; i++) {


            st = new StringTokenizer(br.readLine());

            stu = Integer.parseInt(st.nextToken());

            score = new ArrayList<>();
            for (int j = 0; j < stu; j++) {

                score.add(Integer.parseInt(st.nextToken()));
                sum += score.get(j);
            }

            avg = sum / stu;


            for (int scores :
                    score) {
                if (scores > avg) {
                    cnt++;
                }
            }
            ratio = ((cnt / (double) stu)) * 100;

            System.out.printf("%.3f%s \n",ratio, "%");

            score = null;
            sum = 0;
            cnt = 0;
        }

    }
}
