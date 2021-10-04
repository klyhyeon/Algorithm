package bitthumb;

public class Dictionary {
    /**
     * 주어진 단어의 알파벳으로 단어를 조합해 현재 단어의 알파벳 순서 그 다음 단어를 return 해주는 문제
     * 유사문제: 백준 1256 사전(DP)
     */
    public String solution(String s) {
        String answer = "";
        char[] alphabets = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            if (alphabets[s.length() - 1] > alphabets[s.length() - 2]) {
                return null;
            }
        }
        return answer;
    }
}
