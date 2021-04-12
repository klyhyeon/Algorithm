package baekJoon.week6;
/*
    N개의 정수가 주어졌을 때, 최솟값과 최댓값을 구하는 프로그램 작성
    - 입력: 정수의 개수(N) N은 1이상 1,000,000이하 둘째 줄부턴 N개의 정수가 공백으로 구분해서 주어짐 모든 정수는 -1,000,000보다 크거나
    같고, 1,000,000보다 작거나 같은 정수임
    - 출력: 첫째 줄에 주어진 정수 N개의 최솟값과 최댓값을 공백으로 구분해 출력한다다 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MinMax_10818 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split(" ");
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < N; i++) {
            list.add(Integer.parseInt(input[i]));
        }

        Collections.sort(list);

        System.out.println(list.get(0) + " " + list.get(list.size()-1));

    }
}
