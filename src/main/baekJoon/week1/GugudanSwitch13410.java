package baekJoon.week1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class GugudanSwitch13410 {

    public static void main(String[] args) throws Exception {
        /*
        #거꾸로 구구단_13410
        N단 결과 M번재 항의 값을 스위치함
        ex) 8단 -> 8 61 42 04...
         - 입력: 단, 항(항 개수 숫자 몇까지 곱할지)
         - 출력: 가장 큰 값
         */

        /*
        1. 반복문으로 구구단을 만듦
        2. 맨 뒷자리 수를 앞에서부터 시작하게 함
          - 각 항의 결과값을 배열로 담고 split 한다. 그리고 꺼낼 땐 배열 맨 뒤에서부터 꺼낸다.
          - 10으로 나눈 나머지에 10을 곱해가며 for 반복문으로 거꾸로 만든다.
         */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] danHang = br.readLine().split(" ");
        int dan = Integer.parseInt(danHang[0]);
        int hang = Integer.parseInt(danHang[1]);
        int result = 0;
        List<Integer> resultList = new ArrayList<>();

        for (int i = 1; i <= hang; i++) {

            result = dan * i;

            int reverse = 0;

            while(result!=0) {

                //결과에 10일 나누고 나머지를 받는 변수 1
                //결과값 받을 변수2

                int remain = result % 10;
                reverse = remain + reverse * 10;

                result /= 10;

            }

            resultList.add(reverse);

        }

        Collections.sort(resultList,Collections.reverseOrder());

        System.out.println(resultList.get(0));

    }
}
