package baekJoon.personal.week5;
//프로그래머스 N으로 표현 문제(DFS)

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class DFS_ExpressN_PG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int number = sc.nextInt();

    }

    public int solution(int N, int number) {
        int answer = -1;
        HashMap<Integer, HashSet<Integer>> map = new HashMap<>();
        HashSet<Integer> s = new HashSet<>();
        s.add(N);
        map.put(1, s);

        loop : for(int i = 2; i < 9; i++) {
            HashSet<Integer> set = new LinkedHashSet<>();

            //toBinaryString : 10진수를 2진수로 변환
            int NNN = Integer.parseInt(Integer.toBinaryString((int) Math.pow(2, i) -1)) * N;
        }

        return answer;
    }
}
