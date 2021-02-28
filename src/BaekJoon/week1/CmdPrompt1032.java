package baekJoon.week1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CmdPrompt1032 {

    public static void main(String[] args) {

        /*

        # 명령 프롬프트 - 파일 찾기 명령어 - 파일 이름 패턴 파악하기
         - 입력: 파일 개수 N <= 50, 파일 이름 N개
         - 출력: 파일 패턴
         ex)

         3
        config.sys
        config.inf
        configures

        config????

         */

        /*

         1. 파일 이름 각각을 배열로 받는다 -> 반복문으로 각 자리들을 비교한다, issue: N개 파일 이름을 어떻게 다 비교하나?
         2. "."이 포함된 N개 문자열을 비교할 수 있는 함수가 있나? -> SQL에서 처럼 regex라는 함수가 있진 않을까?
         3. N개의 문자열을 각각 split해서 배열에 담음. -> split된 개별의 문자들을 비교함 -> 같으면 반환, 같지 않으면 ?처리 (채택)
          -
         4. 첫번째 입력값을 기준으로 잡고, 반복문으로 모든 배열들과 비교하면 됨.
          - charAt(): n번째 문자를 반환

         */

        Scanner sc = new Scanner(System.in);
        String str = "";

        // 파일 갯수 <= 50
        int round = sc.nextInt();

        //입력값을 담을 배열
        List<String> list = new ArrayList<>();

        for(int i = 0; i < round; i++) {

            list.add(sc.next());

        }

        //입력값 내 문자들을 비교할 반복문
        //입력된 모든 값의 문자들을 반복문으로 비교함
        //반복 수: length of String

        boolean flag = true;

        for(int i = 0; i < list.get(0).length(); i++) {

          for(int j = 1; j < round; j++) {
                if(list.get(0).charAt(i) == list.get(j).charAt(i)) { //flag true로 안바꿔주면 2번째 이하 자리에서 패턴이 있을 경우 읽지 못함. 왜냐하면 재선언 하지 않으면 false인 거야. flag가 계속!
                    flag = true;
                } else {
                    flag = false;
                    break;
                }
             }

          if(flag != false) {
              str+= list.get(0).charAt(i);
          } else {
              str += "?";
          }
        }

        System.out.println(str);


        sc.close();


    }


}
