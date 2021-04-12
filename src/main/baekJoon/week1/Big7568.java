package baekJoon.week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Big7568 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Big> list = new ArrayList<>();
        List<Integer> rank = new ArrayList<Integer>();

        String str = br.readLine();
        int num = Integer.parseInt(str);

        for (int i = 0; i < num; i++) {

            String[] input = br.readLine().split(" ");

            int kg = Integer.parseInt(input[0]);
            int cm = Integer.parseInt(input[1]);

            Big big = new Big(kg, cm);

            list.add(big);

        }

        for (int z = 0; z < num; z++) {
            rank.add(1);
        }

        //순위
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < rank.size(); j++) {
                if (list.get(i).getCm() > list.get(j).getCm() && list.get(i).getKg() > list.get(j).getKg()) {

                } else if (list.get(i).getCm() < list.get(j).getCm() && list.get(i).getKg() < list.get(j).getKg()) {
                    rank.set(i, rank.get(i) + 1);
                }
            }
        }

        for (int i : rank) {
            System.out.print(i + " ");
        }

    }

    static class Big {

        private int kg = 0;
        private int cm = 0;

        public Big() {

        }

        public Big(int kg, int cm) {
            this.kg = kg;
            this.cm = cm;
        }

        public int getKg() {
            return kg;
        }

        public void setKg(int kg) {
            this.kg = kg;
        }

        public int getCm() {
            return cm;
        }

        public void setCm(int cm) {
            this.cm = cm;
        }
    }


}
