package wootechcourse;

import java.util.Scanner;

public class First_4 {
    //3,6,9가 들어간 수의 총 개수를 return하면 됨
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cases = sc.nextInt();
        System.out.println(tsnCnt(cases));

    }

    public static int tsnCnt(int n) {
        int answer = 0;
        String numString = "";
        int length = 0;

        for (int i = 1; i <= n; i++) {
            numString = String.valueOf(i);
            length = numString.length();

            for (int j = 0; j < length; j++) {
                char numChar = numString.charAt(j);
                if (numChar == '3' ||
                        numChar == '6' ||
                        numChar == '9') {
                    answer++;
                }
            }
        }

        return answer;
    }
}
