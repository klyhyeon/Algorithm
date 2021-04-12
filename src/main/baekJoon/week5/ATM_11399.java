package baekJoon.week5;
/*
    ATM에 N명의 사람이 대기 중. 인출에 걸리는 시간은 Pi.
    사람들 인출 순서를 조정해 시간을 최소화하라.
    - 입력: N명(1이상 1,000이하), 각 사람마다 인출하는 시간 Pi(1이상 1000이하)
    - 출력: 모든 사람들이 인출을 완료하는데 걸리는 시간
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ATM_11399 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //사람 수
        int people = Integer.parseInt(br.readLine());
        //인출 시간
        String[] input1 = br.readLine().split(" ");
        //int 배열 선언
        int[] waiting = new int[people];
        for (int i = 0; i < people; i++) {
            waiting[i] = Integer.parseInt(input1[i]);
        }
        //waiting 배열 ASC 정렬
        Arrays.sort(waiting);
        //{1,2,3,4,5}
        //인출 시간 총합
        int total = 0;
        //각 사람의 인출 시간
        for(int i = 1; i < people; i++) {
            waiting[i] = waiting[i-1] + waiting[i];
            total += waiting[i];
        }


        System.out.println(total+waiting[0]);

    }
}
