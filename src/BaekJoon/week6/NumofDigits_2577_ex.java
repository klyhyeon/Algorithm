package baekJoon.week6;
/*
    세 개 숫자의 곱이 0~9까지 숫자가 각 몇 번 들어가 있는지 구하라
    - 입력: 각 줄에 세 개 숫자를 입력함
    - 출력: 1~10줄까지 0~9까지 각각 몇번 들어가있는지를 출력함
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class NumofDigits_2577_ex {

    static int N;
    static int max = Integer.MIN_VALUE;
    static int[] inputs, num;
    static int result = 1;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        inputs = new int[3];
        num = new int[10];
        for(int i = 0; i < 3; i++) {
            //StringTokenizer 스트링 받는 객체 선언, br.readline으로 초기화
            st = new StringTokenizer(br.readLine());
            //위에 받아둔 String을 int로 형변환, input 배열에 저장
            inputs[i] = Integer.parseInt(st.nextToken());
            result *= inputs[i];
        }
        //result -> String -> char 배열
        char[] arr = Integer.toString(result).toCharArray();
        System.out.println((arr[1]-48)+2);
        System.out.println(arr[1]+2);

        for(int i = 0; i < arr.length; i++) {
            //char을 int로 바꿔주기 위해 48 == '0'을 빼줌
            num[arr[i] - '0'] ++;
        }
        for (int n:
             num) {
            System.out.println(n);
        }




    }
}
