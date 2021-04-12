package baekJoon.week8;
//부녀회장이 될테야
//2) 재귀식 사용해서 풀기

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Apartment_2775_ex2 {

    static int r;
    static int a;
    static int b;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        r = Integer.parseInt(br.readLine());


        for (int i = 0; i < r; i++) {
            a = Integer.parseInt(br.readLine());
            b = Integer.parseInt(br.readLine());

            System.out.println(house(a,b));
        }
    }

    public static int house(int a, int b) {
        if (b == 1)
            return 1;
        if (a == 0)
            return b;
        else
            return house(a-1, b) + house(a, b-1);
    }

}
