package BaekJoon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//#2747
public class Fibonacci2747 {

    public static void main(String[] args) {
        //Fn = Fn-1 + Fn+1
        Scanner sc = new Scanner(System.in);


        //출력할 n번째 숫자
        int num = sc.nextInt();

        //피보나치 담을 배열
        List<Integer> fnList = new ArrayList<>();

        //Fn
        int fn0 = 0;
        int fn1 = 1;

        for (int i = 0; i <= num; i++) {

            if (i == 0) {
                fnList.add(fn0);
            } else if (i == 1) {
                fnList.add(fn1);
            } else {
                fnList.add(fnList.get(i - 1) + fnList.get(i - 2));
            }

        }

        System.out.println(fnList.get(num));

        sc.close();
    }

}
