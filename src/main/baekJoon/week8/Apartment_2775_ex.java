package baekJoon.week8;
//부녀회장이 될테야
//1) 반복문 사용해서 풀기

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Apartment_2775_ex {

    static int r;
    static int a;
    static int b;
    static int[][] people;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        r = Integer.parseInt(br.readLine());

        people = new int[15][15];

        for (int i = 1; i < 15; i++) {
            people[0][i] = i;
            people[i][1] = 1;
        }

        for (int i = 0; i < r; i++) {
            a = Integer.parseInt(br.readLine());
            b = Integer.parseInt(br.readLine());

            for (int j = 1; j < 15; j++) {
                for (int k = 2; k < 15; k++) {
                    people[j][k] = people[j][k-1] + people[j-1][k];
                }
            }
            sb.append(people[a][b] + "\n");
        }
        System.out.println(sb);

    }

}
