package Dev2021;
/*
제한사항
lottos는 길이 6인 정수 배열입니다.
lottos의 모든 원소는 0 이상 45 이하인 정수입니다.
0은 알아볼 수 없는 숫자를 의미합니다.
0을 제외한 다른 숫자들은 lottos에 2개 이상 담겨있지 않습니다.
lottos의 원소들은 정렬되어 있지 않을 수도 있습니다.
win_nums은 길이 6인 정수 배열입니다.
win_nums의 모든 원소는 1 이상 45 이하인 정수입니다.
win_nums에는 같은 숫자가 2개 이상 담겨있지 않습니다.
win_nums의 원소들은 정렬되어 있지 않을 수도 있습니다.
입출력 예
lottos	win_nums	result
[44, 1, 0, 0, 31, 25]	[31, 10, 45, 1, 6, 19]	[3, 5]
[0, 0, 0, 0, 0, 0]	[38, 19, 20, 40, 15, 25]	[1, 6]
[45, 4, 35, 20, 3, 9]	[20, 9, 3, 45, 4, 35]
 */
public class No1 {

    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int best;
        int worst;
        int matchCnt = 0;
        int zeroCnt = 0;
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (lottos[i] == win_nums[j]) {
                    matchCnt++;
                } else if (lottos[i] == 0) {
                    zeroCnt++;
                    break;
                }
            }
        }
        best = prize(matchCnt + zeroCnt);
        worst = prize(matchCnt);
        answer[0] = best;
        answer[1] = worst;
        return answer;
    }

    public int prize(int correctCnt) {
        int prize = 0;
        if (correctCnt <= 1) {
            prize = 6;
        } else if (correctCnt == 2) {
            prize = 5;
        } else if (correctCnt == 3) {
            prize = 4;
        } else if (correctCnt == 4) {
            prize = 3;
        } else if (correctCnt == 5) {
            prize = 2;
        } else if (correctCnt == 6) {
            prize = 1;
        }
        return prize;
    }
}
