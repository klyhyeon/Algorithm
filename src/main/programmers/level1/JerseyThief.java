package programmers.level1;
/*
    체육복 도난 당함. 여벌 있는 친구가 빌려준대. 체격 순으로 매겨져 있음.
    바로 앞번호의 학생이나 바로 뒷번호 의 학생에게만 체육복 빌려줄 수 있음.
    ex. 4번은 3, 5번 학생만 빌려줄 수 있음
    - 전체 학생의 수 : n
    - 체육복 도난 당한 애들 번호 : lost
    - 여별 체육복 있는 애들 번호 : reserve
    - 체육수업 들을 수 있는 학생의 최댓값을 return 하라.
 */
/*
    제한사항 : 전체 학생의 수는 2명 이상 30명 이하
    중복 번호 없음. 여벌 체육복 있는 애도 도난 당했을 수 있음. 대신 빌려주지 못하지.
 */

public class JerseyThief {
    static int[] stus;
    static int answer = 0;
    static int n;
    static int[] lost;
    static int[] reserve;

    public static void main(String[] args) {

        n = 5;
        lost = new int[]{2, 4};
        reserve = new int[]{1, 3, 5};
        System.out.println(solution(n, lost, reserve));
    }

    public static int solution(int n, int[] lost, int[] reserve) {

        stus = new int[n];
        for (int i = 0; i < lost.length; i++) {

            stus[lost[i] - 1] -= 1;
        }
        for (int i = 0; i < reserve.length; i++) {

            stus[reserve[i] - 1] += 1;
        }

        for (int i = 0; i < n - 1; i++) {

            if (i == 0) {

                if (stus[0] == -1 && stus[1] == 1) {

                    stus[0] += 1;
                    stus[1] -= 1;
                }
            } else if (i == n-1) {

                if (stus[n-1] == -1 && stus[n-2] == 1) {

                    stus[n-1] += 1;
                    stus[n-2] -= 1;
                }
            } else {
                if (stus[i] == -1 && stus[i - 1] == 1) {

                    stus[i] += 1;
                    stus[i - 1] -= 1;
                } else if (stus[i] == -1 && stus[i + 1] == 1) {

                    stus[i] += 1;
                    stus[i + 1] -= 1;
                }
            }
        }

        for (int cnt :
                stus) {
            if (cnt >= 0) answer++;
        }
        return answer;
    }
}
