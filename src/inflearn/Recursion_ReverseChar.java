package inflearn;

public class Recursion_ReverseChar {

    public static void main(String[] args) {
        System.out.println(printCharsReverse("Hello"));
    }


    static String answer = "";

    public static String printCharsReverse(String str) {
        if (str.length() == 0) {
            return "";
        } else {
            printCharsReverse(str.substring(1));
            answer += (str.charAt(0));
        }

        return answer;
    }


}
