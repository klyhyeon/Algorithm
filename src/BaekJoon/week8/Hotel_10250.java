package baekJoon.week8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
//왜 틀린지 모르겠음

public class Hotel_10250 {

    static int num;
    static int h;
    static int w;
    static int n;
    static int floor;
    static int room;
    static int answer;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        st = new StringTokenizer(br.readLine());
        num = Integer.parseInt(st.nextToken());

        for (int i = 0; i < num; i++) {
            st = new StringTokenizer(br.readLine());
            h = Integer.parseInt(st.nextToken());
            w = Integer.parseInt(st.nextToken());
            n = Integer.parseInt(st.nextToken());
            //층 구하는 식
            if(n % h == 0)
                floor = h;
            else
                floor = n % h;
            //호수 구하는 식
            if (n % h == 0)
                room = n / h;
            else
                room = (n / h) + 1;

            answer = floor * 100 + room;
            System.out.println(answer);

        }
    }
}
