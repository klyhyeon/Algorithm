package baekJoon.week19;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Palindrome {

    static boolean[][] dp;
    static int numbers;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        numbers = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        int[] arr = new int[numbers + 1];
        dp = new boolean[numbers + 1][numbers + 1];

        //수열 저장
        for (int i = 1; i <= numbers; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        //메서드 실행
        getPalin(arr, numbers);
        int reps = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        //결과값 sb저장
        for (int i = 0; i < reps; i++) {
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());

            //팰린드롬 찾는 로직
            if (dp[s][e]) {
                sb.append("1\n");
            } else {
                sb.append("0\n");
            }
        }

        System.out.println(sb);


    }

    //펠린드롬인지 판별해 dp[][]에 저장하는 메서드
    public static void getPalin(int[] arr, int n) {

        //dp[i][j]라면 i가 검사시작(s), j가 검사종료(e)
        //길이 1일때
        for(int i = 1; i <= n; i++)
            dp[i][i] = true;

        //길이 2일때
        for(int i = 1; i <= n - 1; i++)
            if(arr[i] == arr[i + 1]) dp[i][i + 1]= true;


        for(int i = 2; i < n; i++){
            for(int j = 1; j <= n - i; j++){
                if(arr[j] == arr[j + i] && dp[j + 1][j + i - 1])
                    dp[j][j + i] = true;
            }
        }
    }
}
