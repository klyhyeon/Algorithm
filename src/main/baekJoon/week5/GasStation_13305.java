package baekJoon.week5;
/*
    - 최소 비용으로 젤 왼쪽 도시에서 젤 오른쪽 도시로 이동하는 방법
    - 입력: 도시의 개수 N(2이상 100,000이하), 다음 줄엔 도시 간 길이 N-1개(1이상 1,000,000,000이하), 마지막 줄 리터가격(범위는 길이랑 동일)
    - 출력: 최소 비용
 */
//최소 비용 조건: 해당 지역보다 기름값이 싼 지역이 나오기 전까지 km 만큼 주유 ㄱㄱ!

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GasStation_13305 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //도시의 수 입력
        int city = Integer.parseInt(br.readLine());
        long total = 0;

        long[] km = new long[city - 1];
        long[] price = new long[city];

        //km 배열 초기화
        String[] input1 = br.readLine().split(" ");
        for(int i = 0; i < input1.length; i++) {
            km[i] = Long.parseLong(input1[i]);
        }
        //price 배열 초기화
        String[] input2 = br.readLine().split(" ");
        for(int i = 0; i < input2.length; i++) {
            price[i] = Long.parseLong(input2[i]);
        }
        //이동 시 기름값 출력
        for(int i = 0; i < city-1; i++) {
            if(price[i] <= price[i+1]) {
                price[i+1] = price[i];
                total += price[i] * km[i];
            } else {
                total += price[i] * km[i];
            }
        }

        System.out.println(total);

    }
}
