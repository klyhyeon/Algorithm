package programmers.level1;

import java.util.Arrays;

//모의고사
//https://programmers.co.kr/learn/courses/30/lessons/42840
/*
    수포자가 찍는 방식이 다 다름
    1번 수포자가 찍는 방식: [1, 2, 3, 4, 5], 1, 2, 3, 4, 5, ...
    2번 수포자가 찍는 방식: [2, 1, 2, 3, 2, 4, 2, 5], 2, 1, 2, 3, 2, 4, 2, 5, ...
    3번 수포자가 찍는 방식: [3, 3, 1, 1, 2, 2, 4, 4, 5, 5], 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, ...
    - answers가 주어졌을 때 가장 많은 문제를 맞힌 사람 배열로 return
    - 여럿일 경우 return 값을 오름차순 정렬
    - 시험은 최대 10,000문제
 */
public class PracTest {

    static int[] fail1 = {1, 2, 3, 4, 5};
    static int[] fail2 = {2, 1, 2, 3, 2, 4, 2, 5};
    static int[] fail3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
    static int k = 0;
    static int l1 = 0;
    static int l2 = 0;
    static int l3 = 0;
    static int cnt1 = 0;
    static int cnt2 = 0;
    static int cnt3 = 0;
    static int[] answer;
    static int[] count;
    static int max = Integer.MIN_VALUE;
    static int idx = 0;
    static int a = 0;

    public static void main(String[] args) {

        int[] answers = {1, 2, 3, 5, 3, 5, 2, 1, 5, 3, 1, 3, 5, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 3, 1, 2, 4, 5, 5, 4, 4, 2, 2, 1, 1, 3, 4, 1, 4, 2};
        System.out.println(Arrays.toString(solution(answers)));

    }


    public static int[] solution(int[] answers) {

        while (k < answers.length) {

            if (answers[k] == fail1[l1]) {
                cnt1++;
            }

            if (answers[k] == fail2[l2]) {
                cnt2++;
            }

            if (answers[k] == fail3[l3]) {
                cnt3++;
            }

            k++;
            l1++;
            l2++;
            l3++;

            if (l1 == 5) l1 = 0;
            if (l2 == 8) l2 = 0;
            if (l3 == 10) l3 = 0;
        } //맞힌 개수

        count = new int[3];
        count[0] = cnt1;
        count[1] = cnt2;
        count[2] = cnt3;

        //1개만 있을 때, 2개가 같을 때, 3개가 같을 때
        for (int i = 0; i < 3; i++) {
            if (count[i] > max) {
                max = count[i];
            }
        }


        for (int i = 0; i < 3; i++) {
            if (count[i] == max) {
                idx++;
            }
        }

        answer = new int[idx];

        for (int i = 0; i < 3; i++) {
            if (count[i] == max) {
                answer[a] = i + 1;
                a++;
            }
        }

        Arrays.sort(answer);

        return answer;
    }


}



