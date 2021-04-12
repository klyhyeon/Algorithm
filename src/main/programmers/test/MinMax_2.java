package programmers.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MinMax_2 {
    static String input;
    static String[] inputArray;
    static int min = Integer.MAX_VALUE;
    static int max = Integer.MIN_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(returnMinMax(br.readLine()));
    }

    public static String returnMinMax(String input) {
        inputArray = input.split(" ");

       for (int i = 0; i < inputArray.length; i++) {
           if (Integer.parseInt(inputArray[i]) <= min) {
               min = Integer.parseInt(inputArray[i]);
           }
           if (Integer.parseInt(inputArray[i]) >= max) {
               max = Integer.parseInt(inputArray[i]);
           }
       }
        return min + " " + max;
    }
}
