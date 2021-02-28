package baekJoon.week13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class LongestBitonic_11054 {

    static int n; //수열 개수
    static int max = 0; //정답 변수
    static int[] arr1; //입력받은 수열
    static int[] dpIn; //왼 -> 오 LIS 수열
    static int[] dpDe; // 오 -> 왼 LIS 수열
    static int[] dpSum; // 통합 LIS 수열

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        n = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        arr1 = new int[n];
        dpIn = new int[n];
        dpDe = new int[n];
        dpSum = new int[n];

        for (int i = 0; i < n; i++) {
            arr1[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < n; i++) {
            dpIn[i] = 1;
            for (int j = 0; j <= i; j++) {
                if (arr1[i] > arr1[j]) {
                    dpIn[i] = Math.max(dpIn[i], dpIn[j] + 1);
                }
            }
        }

        for (int i = n - 1; i >= 0; i--) {
            dpDe[i] = 1;
            for (int j = n - 1; j >= i; j--) {
                if (arr1[i] > arr1[j]) {
                    dpDe[i] = Math.max(dpDe[i], dpDe[j] + 1);
                }
            }
        }


        for (int i = 0; i < n; i++) {
            dpSum[i] = dpIn[i] + dpDe[i];
        }

        for (int ele :
                dpSum) {
            if (ele >= max) {
                max = ele;
            }
        }

        System.out.println(max - 1);

    }


}
