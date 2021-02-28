package baekJoon.week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NumericBaseballNew {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int round = Integer.parseInt(br.readLine());

        List<StrikeBall> fsbList = new ArrayList<>();
        String[] st = new String[2];
        List<String> li = new ArrayList<>();

        //세 자리 수 생성
        int input;

        //st = br.readLine().split(" ");
        li = Arrays.asList(br.readLine().split(" "));

        //스트라이크, 볼 생성
        int strike = Integer.parseInt(st[0]);
        int ball = Integer.parseInt(st[1]);

        System.out.println(strike + "" + ball);


    }

}