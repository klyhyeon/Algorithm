package wootechcourse;
//25min

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class First_2 {
    static char[] ascAlphabet = new char[26];
    static char[] desAlphabet = new char[26];
    static String inputString;
    static String tempString;
    static String resultString;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        inputString = br.readLine();

        System.out.println(solution(inputString));
    }

    public static String solution(String inputString) {
        tempString = inputString.toLowerCase();
        resultString = "";

        for (int i = 0; i < 26; i++) {
            ascAlphabet[i] = (char) (i + 97);
            desAlphabet[25 - i] = (char) (i + 97);
        }

        for (int i = 0; i < inputString.length(); i++) {
            if (Character.isLowerCase(inputString.charAt(i))) {
                resultString += desAlphabet[(int) tempString.charAt(i) - 97];
            } else if (Character.isUpperCase(inputString.charAt(i))) {
                resultString += Character.toUpperCase((desAlphabet[(int) tempString.charAt(i) - 97]));
            } else {
                resultString += inputString.charAt(i);
            }
        }

        return resultString;
    }
}
