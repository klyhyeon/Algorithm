package baekJoon.week11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BlackJack_2798 {
    static int n;
    static int m;
    static int[] cards;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        cards = new int[n];

        st = new StringTokenizer(br.readLine());
        int i = 0;
        while(st.hasMoreTokens()) {
            cards[i] = Integer.parseInt(st.nextToken());
            i++;
        }
        //(m - 뽑은 카드 숫자
        int sum;
        int maxSum = Integer.MIN_VALUE;

        breakpoint:
        for (int j = 0; j < n; j++) {
            if (j > n - 3)
                break;
            for (int k = j + 1; k < n; k++) {
                for (int l = k + 1; l < n; l++) {
                    sum = cards[j] + cards[k] + cards[l];
                    if (sum > m) {
                        sum = 0;
                    }
                    else if (sum == m) {
                        maxSum = sum;
                        break breakpoint;
                    }
                    else
                        maxSum = Math.max(sum, maxSum);
                }
            }
        }

        System.out.println(maxSum);


    }
}
