package kakao.winter2020;
/*
    규칙이 맞지 않는 아이디 입력 시 올바른 아이디 추천해주는 프로그램
    - 아이디는 3자 이상 15자 이하
    - 소문자, 숫자, -, _, .문자만 사용할 수 있음
    - .는 처음과 끝에 사용할 수 없음. 연속으로 사용할 수 없음

 */

import java.util.LinkedList;

public class No1 {

    static String answer = "";

    public static void main(String[] args) {

        System.out.println(solution("...!@BaT#*..y.abcdefghijklm"));
    }

    public static String solution(String new_id) {

        for (int i = 0; i < new_id.length(); i++) {
            answer += Character.toLowerCase(new_id.charAt(i));
        }

        for (int i = 0; i < answer.length(); i++) {
            if (((int) answer.charAt(i)>= 97 && (int) answer.charAt(i) <= 122 ) || answer.charAt(i) == '.' || answer.charAt(i) =='_'
            || answer.charAt(i) == '-') {

            } else {
                answer = answer.replace(answer.substring(i, i+1),"");
            }
        }
        return answer;
    }
}
