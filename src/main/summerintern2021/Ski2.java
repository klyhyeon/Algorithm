package summerintern2021;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Ski2 {

    public static void main(String[] args) {

        /**
         * t	r	result
         * [0,1,3,0]	[0,1,2,3]	[0, 1, 3, 2]
         * [7,6,8,1]	[0,1,2,3]	[3, 1, 0, 2]
         */
    }

    public int[] solution(int[] t, int[] r) {
        int[] answer = new int[t.length];
        List<Integer> newT = new LinkedList<>();
        List<Integer> newR = new LinkedList<>();
        for (int i = 0; i < t.length; i++) {
            newT.add(t[i]);
            newR.add(r[i]);
        }
        int lift = 0;
        int target = 0;
        int maxGrade = 0;
        Queue<Integer> left = new ArrayDeque<>();
        for (int i = 0; i < t.length; i++) {

        }
        return answer;
    }

}
