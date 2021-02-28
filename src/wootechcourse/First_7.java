package wootechcourse;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class First_7 {
    /*
    while문 사용. 중복되는 문자 없을 때까지 조건. chatAt으로 비교. 중첩으로 for문 사용.
    중복되는 문자를 잘라서 출력해줘야 된다.
    */

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String inputWord = br.readLine();
        int inputWordLength = inputWord.length();
        String uniqueWord = "";
        int tempIdx = 0;


        for (int i = 0; i < inputWordLength - 1; i++) {

            if (inputWord.charAt(i) == inputWord.charAt(i + 1)) {
                if (i >= inputWordLength - 2)
                    break;
                i = i + 2;
            } else {
                uniqueWord += inputWord.charAt(i);
            }
        }
        System.out.println(uniqueWord);
    }

}
