package baekJoon.week2;
/*
    - N, M 숫자를 입력받는다. N은 저장할 포켓몬 이름의 개수이고 M은 문제다.
    - 문제는 알파벳으로 주어진 포켓몬 이름을 저장된 index 숫자로 반환하면된다.
    - 입력: N M 그리고 N행의 포켓몬 이름(첫문자 대문자), M행의 문제(숫자 or 알파벳)
        > M은 N보다 작거나 같고 주어진 포켓몬 이름 내에서 입력된다.
    - 출력: 문제가 주어지면 그에 대한 포켓몬 이름 or 저장 번호 반환
 */

/*
    - 반복문과 bufferedReader 사용해 list에 저장
    1) 시간 초과 뜸
    2) Map - HashMap??
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Pocketmon_1620 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String[] str = br.readLine().split(" ");
        int nSave = Integer.parseInt(str[0]);
        int mAsk = Integer.parseInt(str[1]);

        HashMap<String, Integer> map = new HashMap<>();
        //key는 배열로 받는다 (keyset과 iterator 이용해 출력할수도 있음)
        String[] arr = new String[100000];

        for(int i = 0; i < nSave; i++) {
            String input = br.readLine();
            map.put(input, i+1);
            arr[i] = input;
        }

        for(int j = 0; j < mAsk; j++) {
            String ask = br.readLine();
            if(isInt(ask)) {
                System.out.println(arr[Integer.parseInt(ask)-1]);
            } else {
                System.out.println(map.get(ask));
                    }
                }
            }

        //입력이 문자인지 정수인지 판별하는 메소드
        public static boolean isInt(String s) {
            try{
                Integer.parseInt(s);
                return true;
            } catch (Exception e) {
                return false;
            }


    }
        }


