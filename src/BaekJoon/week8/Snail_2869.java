package baekJoon.week8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Snail_2869 {

    static int a;
    static int b;
    static int v;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        a = Integer.parseInt(st.nextToken());
        b = Integer.parseInt(st.nextToken());
        v = Integer.parseInt(st.nextToken());

        System.out.println(day(a,b,v));
    }

    static int answer;
    public static int day(int a, int b,int v) {
        answer = (int) Math.ceil((double) (v - a) / (a - b) + 1) ;
        return answer;
    }
}
