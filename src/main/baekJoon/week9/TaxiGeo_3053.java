package baekJoon.week9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TaxiGeo_3053 {

    private static int R;
    private static double ucld;
    private static double taxi;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        R = Integer.parseInt(br.readLine());

        ucld = (R*R) * Math.PI;
        taxi = (double) (R*R) * 2;

        System.out.printf("%.6f\n%.6f",ucld, taxi);

    }
}
