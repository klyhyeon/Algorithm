package baekJoon.week3;

import java.util.Scanner;

public class Sugar_2839 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int weight = sc.nextInt();
        int sugar = 0;

        while(weight > 2) {

            if(weight % 5 == 0) {
                sugar += (weight / 5);
                weight = 0;
            } else {
                weight -= 3;
                sugar ++;
            }
        }

        if(weight == 0) {
            System.out.println(sugar);
        } else System.out.println(-1);

    }
}
