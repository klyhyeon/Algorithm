package baekJoon.week13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Coin0_11047 {

    static int[] coins;
    static int target;
    static int targetTemp;
    static int num;
    static int coinCnt;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        num = Integer.parseInt(st.nextToken());
        target = Integer.parseInt(st.nextToken());
        targetTemp = target;
        coins = new int[num - 1];
        coinCnt = 0;

        //A1 == 1
        br.readLine();

        //동전 종류 coins에 저장
        for (int i = 0; i < num - 1; i++) {
            coins[i] = Integer.parseInt(br.readLine());
        }

        //coins 오름차순 정렬
        Arrays.sort(coins);

        //문제 해결 반복문
        for (int i = num - 2; i >= 0; i--) {
            if (coins[i] > targetTemp)
                continue;

                coinCnt += targetTemp / coins[i];
                targetTemp %= coins[i];
        }

        //1보다 큰 가장 작은 동전으로 안나눠질 경우
        if (targetTemp > 0)
            coinCnt += targetTemp;

        System.out.println(coinCnt);


    }
}
