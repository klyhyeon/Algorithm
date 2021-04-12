package baekJoon.week3;

import java.util.Scanner;

public class Change_5585 {


        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            int money = sc.nextInt();
            int change = 1000 - money;
            int count = 0;
            int[] coin = {500, 100, 50, 10, 5, 1};
            for (int i = 0; i < coin.length; i++) {
                count += change / coin[i];
                change = change % coin[i];
            }

            for (int c:
                 coin) {

            }


            System.out.println(count);
//            int change = 1000 - money;
//            int coin = 0;
//
//
//            while(change != 0) {
//                if(change >= 500) {
//                    coin ++;
//                    change -= 500;
//                } else if(change >= 100) {
//                    coin++;
//                    change -= 100;
//                } else if(change >= 50) {
//                    coin++;
//                    change -= 50;
//                } else if(change >= 10) {
//                    coin++;
//                    change -= 10;
//                } else if(change >= 5) {
//                    coin++;
//                    change -= 5;
//                } else if(change >= 1) {
//                    coin++;
//                    change -= 1;
//                }
//            }
//            System.out.println(coin);
//        }

    }
}
