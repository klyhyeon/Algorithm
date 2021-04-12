package wootechcourse;
//15min
import java.util.Arrays;
import java.util.Scanner;

/*돈 일부를 출금하는데 있어 최대한 적은 화폐로 받을 것
  1 10 50 100 500 1000 5000 10000 50000
 */
public class First_1 {

    static int[] currency = new int[]{50000, 10000, 5000, 1000, 500, 100, 50, 10, 1};
    static int[] result = new int[9];
    static int money;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        money = sc.nextInt();
        System.out.println(Arrays.toString(returnCurrency(money)));
    }

    public static int[] returnCurrency(int money) {
        for (int i = 0; i < 9; i++) {
            if (money >= currency[i]) {
                result[i] = money / currency[i];
                money %= currency[i];
            }
        }
        return result;
    }
}
