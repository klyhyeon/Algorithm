package baekJoon.personal.week4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
    알파벳 대문자오 숫자로만 구성된 문자열이 주어짐
    이때 알파벳을 오름차순으로 정렬하여 이어서 출력한 뒤에, 그 뒤에 모든 숫자를 더한 값을 이어서 출력
    예를 들어 K1KA5CB7 -> ABCKK13을 출력
        - 입력: 하나의 문자열 s가 주어짐. 1<= S <= 10000
 */
public class StringSort_NDB {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        //문자열 받기
        String s = br.readLine();
        //배열에 넣어주기
        char[] sArr = s.toCharArray();
        //새로 넣어줄 리스트 만들기
        List<Character> sList = new ArrayList<>();
        //숫자 더해줄 sum 선언
        int sum = 0;
        //향상 for문으로 숫자/알파벳 나누기
        for (char c:
             sArr) {
            if(Character.isDigit(c)) {
                sum += Character.getNumericValue(c);
            } else {
                sList.add(c);
            }
        }

        Collections.sort(sList);
        for (char c:
             sList) {
            sb.append(c);
        }
            sb.append(sum);
        System.out.println(sb);




    }
}
