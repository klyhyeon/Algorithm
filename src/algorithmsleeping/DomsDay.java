package algorithmsleeping;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class DomsDay {

    /*
        Goal: '2020-02-01' 포맷으로 사용자가 날짜를 입력하면 요일을 반환하는 알고리즘(2000~2100)
        적용방식: 둠스데이 알고리즘(2월 마지막 날 요일이 규칙적으로 반복되는 것을 이용한 날짜 알고리즘)
        구현:
            입력값 처리: BufferedReader, StringTokenizer
            입력값 분석: 년/월/일 변수할당
            기준값 생성: 각 연도별 둠스데이 요일 할당 - 배열 인덱스가 연도고 값이 요일임,
            각 월별 일수 할당 - 배열 인덱스가 월이고 값이 일수임
            * 요일은 숫자로 표기함(1: Sun, 2: Mon,...)
            * 예외값 처리: 윤년은 둠스데이가 하나 뒤 요일임
            로직: 입력날짜 분류 > 해당연도 둠스데이 요일 반환 >  date까지 일수차이 leftDate 반환 > 7로 나눈 나머지에 따라 요일 반환
            * date까지 일수차이 leftDate 반환:
                ** DomsDay 이후: 해당 일 + 3월~전월까지 일수
                ** DomsDay 이전:
                    *** 1월일 때:
                        ****윤년일 때: 29 + (31 - 해당 일)
                        ****윤년이 아닐 때: 28 + (31 - 해당 일)
                    *** 2월일 때:
                        ****윤년일 때: 29 - 해당 일
                        ****윤년이 아닐 때: 28 - 해당 일

            2000~2100 둠스데이 패턴
            00-3 - 04-8 - 08-13 - 12-18 - 16-23...
            인덱스 4의 배수(0부터 시작)는 3부터 5씩 등차증가한다.
            나머지 수는 이전 인덱스보다 ++1
            * 입력 연도가 4의 배수일 때: {(4로 나눈 몫  * 5) + 3} / 7
            * 입력 연도가 4의 배수가 아닐 때: [{(4로 나눈 몫 * 5) + 3} + (4로 나눈 나머지)] / 7
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        String date = br.readLine();
        st = new StringTokenizer(date, "-");
        int temp = 0;
        int yy = 0;
        int mm = 0;
        int dd = 0;
        while (st.hasMoreTokens()) {
            int input = Integer.parseInt(st.nextToken());
            if (temp == 0) {
                yy = input - 2000;
            } else if (temp == 1) {
                mm = input;
            } else {
                dd = input;
            }
            temp++;
        }//입력값 처리,분석완료

        int domsDay = 0;
        if (yy == 2100) {
            domsDay = (((yy / 4) * 5 + 3) % 7) - 1;
        } else if (yy % 4 != 0) {
            domsDay = (((yy / 4) * 5 + 3) + (yy % 4)) % 7;
        } else if (yy % 4 == 0) {
            domsDay = ((yy / 4) * 5 + 3) % 7;
        }//domsDay 반환완료

        int leftDate = 0;
        int[] monthDays = new int[13];
        for (int i = 1; i < 13; i++) {
            if (i <= 7) {
                if (i % 2 == 1) {
                    monthDays[i] = 31;
                } else {
                    monthDays[i] = 30;
                }
            } else {
                if (i == 8) {
                    monthDays[i] = 31;
                } else if (i % 2 == 1) {
                    monthDays[i] = 30;
                } else {
                    monthDays[i] = 31;
                }
            }
        }//월 일수 할당완료

        if (mm == 1) {
            if (yy != 2100 && yy % 4 == 0) {
                leftDate = 29 + (31 - dd);
            } else {
                leftDate = 28 + (31 - dd);
            }
        } else if (mm == 2) {
            if (yy != 2100 && yy % 4 == 0) {
                leftDate = 29 - dd;
            } else {
                leftDate = 28 - dd;
            }
        } else {
            for (int i = 3; i < 13; i++) {
                if (i == mm) {
                    break;
                } else {
                    leftDate += monthDays[i];
                }
            }
        }

        if (mm > 2)
            leftDate += dd;
            //leftDate 할당완료
        int answerInt = 0;
        if (mm > 2) {
            answerInt = ((leftDate % 7) + domsDay) % 7;
        } else {
            answerInt = leftDate % 7;
        }
        String answer = "";
        switch (answerInt) {
            case 1:
                answer = "일요일";
                break;
            case 2:
                answer = "월요일";
                break;
            case 3:
                answer = "화요일";
                break;
            case 4:
                answer = "수요일";
                break;
            case 5:
                answer = "목요일";
                break;
            case 6:
                answer = "금요일";
                break;
            case 0:
                answer = "토요일";
                break;
            default:
                break;
        }

        System.out.println(date + "는 " + answer + " 입니다.");




    }
}
