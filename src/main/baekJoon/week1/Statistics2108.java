package baekJoon.week1;

import java.util.*;

public class Statistics2108 {

    public static void main(String[] args) {

        /*
         - 입력: N개 숫자 입력받을 거임(N은 홀수)
           1) N
           2) N개의 줄에는 정수가 입력됨(절대값 4000 이하)

         - 출력:
         산술평균 : N개의 수들의 합을 N으로 나눈 값
         중앙값 : N개의 수들을 증가하는 순서로 나열했을 경우 그 중앙에 위치하는 값
         최빈값 : N개의 수들 중 가장 많이 나타나는 값
         범위 : N개의 수들 중 최댓값과 최솟값의 차이

        첫째 줄에는 산술평균을 출력한다. 소수점 이하 첫째 자리에서 반올림한 값을 출력한다. -> average 변수 선언
        둘째 줄에는 중앙값을 출력한다. -> 배열 collection.sort -> (length-1 / 2) +1
        셋째 줄에는 최빈값을 출력한다. 여러 개 있을 때에는 최빈값 중 두 번째로 작은 값을 출력한다.
        넷째 줄에는 범위를 출력한다.

         */

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        //n개 숫자 담아둘 배열
        int[] str = new int[n];
        //n개 숫자 입력
        for(int i = 0; i < n; i++) {
            int num = sc.nextInt();
            str[i] = num;
        }
        //1. 산술평균 출력
        int total = 0;
        int avg;
        for(int i : str) {
            total += i;
        }
        //산술평균 avg
            if(total < 0) {
                avg = (int) Math.floor(total / (double) n);
            } else {
                avg = (int) Math.round(total / (double) n);
            }

        //2. 중앙값 출력
        Arrays.sort(str);

        int middle;
        //중앙값 middle
        middle = str[(str.length/2)];

        //3. 최빈값 출력 -> 구글링
        //최빈값 most
        int most = 0;
        //str 배열의 인덱스 그대로 따온 index 배열

        //index + 4000 해서 배열을 생성해줌
       int[] index = new int[8000];
       int max = Integer.MIN_VALUE;

        for(int i = 0; i < str.length; i++) {
                index[str[i] + 4000]++;
        } for(int j = 0; j < index.length; j++) {
            if (max < index[j]) {
                max = index[j];
                most = j;
            }
        }
        int count = 0;

        List<Integer> list = new ArrayList<>();

            for (int k=0; k < index.length; k++) {

                if(index[most] == index[k]) {
                    count++;
                    list.add(k);
            }
        }
            if(count >= 2){
                Collections.sort(list);
                most = list.get(1)-4000;
            }



        //4. 범위 출력
        int range = 0;
        //범위 range
        range = str[n-1] - str[0];


        //5. 출력
        //System.out.println(Arrays.toString(str));
        //System.out.println(total);
        System.out.println(avg);
        System.out.println(middle);
        System.out.println(most);
        System.out.println(range);







    }


}
