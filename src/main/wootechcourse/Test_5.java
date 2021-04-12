package wootechcourse;

public class Test_5 {

    public static void main(String[] args) {
        System.out.println(solution("1100", "0010", "1001", "1101100100101111001111000000"));
    }

    public static String solution(String penter, String pexit, String pescape, String data) {
        String answer = penter;
        int dataLength = data.length();
        int penterLength = penter.length();
        String tempData = "";

        for (int i = 0; i <= dataLength - penterLength; i += penterLength) {
            tempData = data.substring(i, i + penterLength);

            if (tempData.equals(penter) ||
                    tempData.equals(pexit) ||
                    tempData.equals(pescape)) {
                answer += (pescape + tempData);
            } else {
                answer+= tempData;
            }
        }

        answer = answer + pexit;

            return answer;
    }


}
