package baekJoon.week11;
//똑똑한 방법을 찾았다!

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DirectorShom_1436_ex {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        System.out.println(func(N));

    }

    public static int func(int n) {
        int order = 0;
        int result = 0;
        int target = 0;

        for (int i = 666; order < n; i++) {
            target = i;
            while (target > 100) {
                if ((target % 1000) == 666) {
                    order++;
                    result = i;
                    break;
                }
                target /= 10;
            }
        }
        return result;
    }
}
