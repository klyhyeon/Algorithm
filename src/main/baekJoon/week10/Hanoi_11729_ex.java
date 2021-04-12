package baekJoon.week10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Hanoi_11729_ex {
    static int answer = 0;
    static StringBuilder sb = new StringBuilder();
    static int num;

    public static void tower(int num, int from, int via, int to) {
        ++answer;
        //이동할 원반의 수가 1개일 때(basecase)
        if(num == 1) {
            sb.append(from + " " + to + "\n");
        } else {
            // STEP1: num-1개를 A에서 B로 이동
            tower(num-1, from, to, via);
            // STEP2: 1개를 A에서 C로 이동??
            sb.append(from + " " + to + "\n");
            // STEP3: num-1개를 B에서 C로 이동
            tower(num-1, via, from, to);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        num = Integer.parseInt(br.readLine());
        tower(num, 1, 2, 3);
        sb.insert(0, answer + "\n"); //row 번호가 offset인듯
        System.out.println(sb);
    }
}
