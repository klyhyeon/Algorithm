package baekJoon.week1;

/*
    백준 - 2503 숫자야구
    시도1: 23:00~23:12(stream 객체 검색) 너무 잠옴... 내일 이어서 해야지
    시도2: 09:46~09:54(지하철)
    시도3: 10:31~10:35(피부과)
    시도4: 11:04~11:39(지하철) --여기까지 60min
    시도5: 12:07~12:20(학원)
    시도n: 다음날(7/25/20) 10:00 --스트라잌 카운트 입출력 작업 완료
    =================================
    1~9 서로 다른 세 개로 구성된 세 자리 수(123 ~ 987)
    상대방이 세 자리 수를 유추함

    조건1. 같은 숫자가 동일 위치에 있으면 1스트
    조건2. 같은 숫자가 다른 위치에 있으면 1볼

    입력: 1<N<100 질문 횟수 = 반복횟수
    입력: 세 자리 숫자 유추
    입력: 스트라잌 카운트

    결과: 스트라잌 카운트가 주어질 때마다 경우의 수

    조건3. 유추에 대한 대답이 누적돼야 함 -> 누적돼야지.
    조건3.1 누적받는 변수 선언필요 -> max로 봐야 맞음. 왜냐면 이미 맞춘 자리 수도 누적 합산되기 때문이다.
    -> max 잡는 법: 스트라잌 카운트 리스트 비우기 전 스트라잌과 볼 담아줄 변수 필요. 이 전 데이터와 비교해서 높은 값만 남김
    -> 마지막에 남는 max값 기준으로 경우의 수 도출
    -> n스트라이크 m볼 조합일 때 경우의 수는?
    -> 1) 1스트 1볼 = *** 중 1** 둘 중 하나의 값을 알고 있음,
    -> 2) cont. 자릿 수 경우의 수 & 해당 자릿 수 값
    -> 3) 스트라이크 = 자릿 수 & 숫자 값 처리됨
    -> 4) 볼 = 숫자 값만 처리됨
    모르겠다..
    -> 경우의 수 접근방식: 1~987까지 모든 숫자를 넣고, 스트라잌 카운트와 같은 경우의 수를 출력한다.
        - 필요한 것: 스트라잌 카운트 배열을 담는 객체
       1. 123~987을 for문 int i로 받는다.
       int i를 split한 다음 배열로 만든다.
       배열 내 같은 숫자가 있으면 다음 숫자로 pass하는 if문을 넣는다.
       배열을 스트라잌, 볼 판정 연산에 넣고 입력받는 inputList와 비교한다.
       완전히 동일한 경우의 수를 갖는 숫자 개수를 출력한다.

    =================================
 */


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NumericBaseball {

    public static void main(String[] args) throws IOException {

        //#1 질문 횟수
        Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int round = Integer.parseInt(br.readLine());
        //int round = sc.nextInt();

        //#2 정답 세 자리 수 생성
//        List<Integer> fixedDigits = new ArrayList<>();
//
//        while(fixedDigits.size() < 3) {
//            int ranNum = (int) (Math.random()*9)+1;
//
//            if(!fixedDigits.contains(ranNum)){
//                fixedDigits.add(ranNum);
//            }
//        }

        //#생성 확인용 리스트 출력
//        System.out.println(fixedDigits);

        //# rsbList(모든 경우의 수) 스트라잌, 볼 변수 선언
        int rStrike = 0;
        int rBall = 0;

        //#스트라잌, 볼 담을 List 선언
        List<StrikeBall> rsbList = new ArrayList<>();

        //#3 예측 세 자리 수 생성 & 스트라잌 카운트 출력
        for(int j = 0; j < round; j++) {

            String[] inputArr = new String[3];
            //세자리 수, 스트라이크, 볼 생성
            int num;
            int strike;
            int ball;

            inputArr = br.readLine().split(" ");

            num = Integer.parseInt(inputArr[0]);
            strike = Integer.parseInt(inputArr[1]);
            ball = Integer.parseInt(inputArr[2]);


            StrikeBall sb = new StrikeBall(num, strike, ball);

            List<Integer> fsbList = new ArrayList<>();

            fsbList.add(sb.strike);
            fsbList.add(sb.ball);

            //fsbList.add(fsb);

            //줄 개행
            //System.out.println("");

            //# 예측 세 자리 수 Array[input] List 변환
            //int[] inputArr = Stream.of(String.valueOf(input).split("")).mapToInt(Integer::parseInt).toArray();



            //#생성 확인용 리스트 출력
//            System.out.println(inputList);
//
//            //예측 세 자리 수 스트라잌, 볼 변수 선언
//            int strike = 0;
//            int ball = 0;
//
//            //# 스트라잌 카운트 출력
//            for (int a : inputList //예측 세 자리 수
//            ) {
//                for (int b : fixedDigits //정답 세 자리 수
//                ) {
//                    if (a == b) {
//                        if (inputList.indexOf(a) == fixedDigits.indexOf(b)) {
//                            strike++;
//                        } else {
//                            ball++;
//                        }
//                    } else {
//
//                    }
//                }
//
//            }


//                System.out.printf("%d 스트라이크", strike);
//                System.out.printf(" %d 볼 \n", ball);

                //모든 경우의 수 배열 선언
                List<Integer> rList = new ArrayList<>();

                for (int r = 123; r < 988; r++) {

                    //세자리 수 리스트 배열화 [1,2,3]
                String[] rArr = (String.valueOf(r).split(""));
                int r1 = Integer.parseInt(rArr[0]);
                int r2 = Integer.parseInt(rArr[1]);
                int r3 = Integer.parseInt(rArr[2]);

                for (int l : rList
                ) {
                    if (!rList.contains(l)) {
                        rList.add(r1);
                        rList.add(r2);
                        rList.add(r3);
                    }
                    break;
                }
                

            }


            }

        sc.close();
    }
}
