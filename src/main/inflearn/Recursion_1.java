package inflearn;

public class Recursion_1 {

    static int result1;
    static int result2;

    public static void main(String[] args) {

        result1 = func(4);
        System.out.println(result1);

        result2 = gcd(12, 13);
        System.out.println(result2);

        String r = "ace";
        System.out.println(r.substring(1));

    }

    public static int func(int n) {

        if (n == 0)
            return 0;
        else if (n == 1)
            return 1;
        else
            return n = func(n - 1) + func(n - 2);
    }

    //Euclid method
    public static int gcd(int m, int n) {

        if (m<n) {
            int tmp=m;
            m = n;
            n = tmp;
            //swap m and n
            //반드시 작은 수에서 큰 수를 나눔
        }
        if(m%n==0)
            return n;
        else
            return gcd(n, m%n);//작은 수와 둘을 나눈 나머지를 비교
    }

    //문자열
    public static int length(String str) {
        str = "ace";
        if (str == "")
            return 0;
        else
            return 1 + length(str.substring(1));
    }
}
