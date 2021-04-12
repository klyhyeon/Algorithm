package inflearn;

public class Recursion_2 {


    public static void main(String[] args) {


    }

    public static void printCharsRevers(String str) {
        str = "length";
        if(str.length()==0)
            return;
        else {
            printCharsRevers(str.substring(1));
            System.out.println(str.charAt(0));
        }
    }

    //2진수 변환법
    public static void printInBinary(int n) {
        if (n < 2)
            System.out.print(n);
        else {
            printInBinary(n / 2);
            System.out.print(n % 2);
        }
    }

    //배열의 합 구하기
    public static int sum(int n, int[] data) {
        if (n<= 0)
            return 0;
        else
            return sum(n-1, data) + data[n-1];
    }


}
