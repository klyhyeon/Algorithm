package wootechcourse;

public class Test_3 {

    public static void main(String[] args) {
        String[] expected = {"H", "H", "H", "T", "H"};
        String[] actual = {"T", "T", "T", "H", "T"};
        System.out.println(solution(1500, expected, actual));
    }

    public static int solution(int money, String[] expected, String[] actual) {
        int length = expected.length;
        int betCoin = 100;
        int sumCoin = money;
        String expectedEle;
        String actualEle;
        int answer = 0;

        for (int i = 0; i < length; i++) {
            expectedEle = expected[i];
            actualEle = actual[i];

            if (expectedEle.equals(actualEle)) {
                sumCoin += betCoin;
                betCoin = 100;
            } else {
                sumCoin -= betCoin;

                if (sumCoin < betCoin * 2) {
                    betCoin = sumCoin;
                } else {
                    betCoin *= 2;
                }
            }

            if (sumCoin <= 0) {
                answer = 0;
                break;
            }
        }

        answer = sumCoin;
        return answer;
    }

}
