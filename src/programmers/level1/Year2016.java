package programmers.level1;
/*
    2016년 1월 1일은 금요일임. 2016년 a월 b일은 무슨 요일일까요?
    윤년입니다.4년마다 2월을 29일로 하는 연도
    - 입력: a, b
    - 출력: "SUN" 같은 것.
 */

public class Year2016 {

    static String answer;
    static String[] day = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
    static String[] calender = new String[367];
    static int[] month = new int[13];
    static int date;

    public static void main(String[] args) {

        System.out.println(solution(5, 24));
    }


    public static String solution(int a, int b) {

        //0일부터 시작
        for (int i = 0; i < 366; i++) {
            calender[i] = day[i % 7];
        }

        for (int i = 1; i < 13; i++) {
            if ((i < 8 && i % 2 == 1) || i >= 8 && i % 2 == 0) {
                month[i] = 31;
            } else if (i == 2) {
                month[i] = 29;
            } else if ((i < 8 && i % 2 == 0) || (i >= 8 && i % 2 == 1)) {
                month[i] = 30;
            }
        }


        for (int i = 1; i < a; i++) {
            date += month[i];
        }

        answer = calender[date + b - 1];

        return answer;
}


}
