package baekJoon.week16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class TurningQueue_1021 {

        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String input = br.readLine();
            String[] numArr_str = br.readLine().split(" ");

            int n = Integer.parseInt(input.split(" ")[0]);
            int m = Integer.parseInt(input.split(" ")[1]);

            int[] numArr = new int[numArr_str.length];
            for (int i = 0; i < numArr_str.length; i++)
                numArr[i] = Integer.parseInt(numArr_str[i]);

            LinkedList<Integer> deQ = new LinkedList<Integer>();
            for (int i = 1; i <= n; i++) deQ.offer(i);

            int cnt = 0, half = 0;
            for (int i = 0; i < numArr.length; i++) {
                if (deQ.size() % 2 == 0) half = (deQ.size() / 2) - 1;
                else half = deQ.size() / 2;

                int idxDeQ = 0;
                for (int j = 0; j < deQ.size(); j++) {
                    if (deQ.get(j) == numArr[i]) {
                        idxDeQ = j;
                        break;
                    }
                }

                if (half - idxDeQ >= 0) {
                    for (int j = 0; j < idxDeQ; j++) {
                        int first = deQ.pollFirst();
                        deQ.addLast(first);
                        cnt++;
                    }
                    deQ.poll();
                } else {
                    for (int j = 0; j < deQ.size() - idxDeQ; j++) {
                        int last = deQ.pollLast();
                        deQ.addFirst(last);
                        cnt++;
                    }
                    deQ.poll();
                }
            }
            System.out.println(cnt);
        }
}
