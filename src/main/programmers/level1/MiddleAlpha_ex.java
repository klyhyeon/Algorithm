package programmers.level1;
/*
    단어 s의 가운데 글자를 반환하는 함수, solution 을 만들어.
    단어의 길이가 짝수라면 가운데 두글자를 반환하면 됩니다.
    - s는 길이가 1이상 100이하인 String
 */

public class MiddleAlpha_ex {

    static String answer;

    public static void main(String[] args) {

        System.out.println(solution("power"));

    }

    public static String solution(String s) {
        //짝수일 땐 int가 자동 내림 기능을 해줘서 2개가 출력됨...
        answer = s.substring((s.length()-1) / 2, s.length() / 2 + 1);
        return answer;
    }
}
