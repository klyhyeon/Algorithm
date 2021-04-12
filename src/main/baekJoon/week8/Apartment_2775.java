package baekJoon.week8;
//부녀회장이 될테야

import java.util.Scanner;

public class Apartment_2775 {

    static int r;
    static int a;
    static int b;
    static int n;
    static int[] people = new int[186];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        r = sc.nextInt();

        for (int i = 0; i < r; i++) {
            a = sc.nextInt();
            b = sc.nextInt();
            //층, 호에 일련번호(n) 부여
            n = a * 14 + b;
            System.out.println(home(n));
        }
    }


    public static int home(int n) {

        if (n < 15)
            return people[n] = n;

        if (n % 14 == 0)
            people[n] = people[n - 14];
        else
            people[n] = people[n - 14] + home(n - 1);

        return people[n];
    }
}
