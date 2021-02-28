package baekJoon.week16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class AC_5430 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testNum = Integer.parseInt(br.readLine());

        while (testNum-- > 0) {
            String function = br.readLine();
            int functionSize = function.length();
            int arrSize = Integer.parseInt(br.readLine());
            String[] arrString = br.readLine().split(",");
            Integer[] arrInt = new Integer[arrSize];
            for (int i = 0; i < arrSize; i++) {
                if (i == 0) {
                    arrInt[i] = Integer.parseInt(arrString[i].substring(1));
                } else if (i == arrSize - 1) {
                    arrInt[i] = Integer.parseInt(arrString[i].substring(0, 1));
                } else {
                    arrInt[i] = Integer.parseInt(arrString[i]);
                }
            }
            List<Integer> listInt = new ArrayList<>();
            listInt = Arrays.asList(arrInt);
            for (int j = 0; j < functionSize; j++) {
                if (function.charAt(j) == 'R') {
                    if (listInt.isEmpty()) {
                        System.out.println("error");
                        break;
                    } else {
                        Collections.reverse(listInt);
                    }
                } else if (function.charAt(j) == 'D') {
                    if (listInt.isEmpty()) {
                        System.out.println("error");
                        break;
                    } else {
                        listInt.remove(0);
                    }
                }
            }
            System.out.println(Arrays.toString(listInt.toArray()));
        }

    }
}
