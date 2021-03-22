package scofe;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test2Curly {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tmp = Integer.parseInt(br.readLine());
        char[] route = br.readLine().toCharArray();
        int distance = tmp;
        int i = 0;
        int answer = 1;
        while (i < distance - 2) {
            if (route[i] == 0) {
                i++;
                continue;
            }
            if (route[i+1] == '1' || route[i+2] == '1') {
                answer += 2;
                i+=2;
            } else
                i++;
        }
        System.out.println(answer);
    }
}
