package baekJoon.week7;

//다른 사람 블로그 보니까 String Startwith 메서드를 활용하면 된다고 한다.
//https://javachoi.tistory.com/265?category=1079371
//코드 이해못하겠음..

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class CroatiaAlpha_2941_ex2 {


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        String[] croAlphabetArray = {
                "c=", "c-", "dz=", "d-",
                "lj", "nj", "s=", "z="
        };
        int cnt = getCnt(s, 0, croAlphabetArray);
        System.out.println(cnt);
    }

    public static int getCnt(String s, int cnt, String[] cro_alp) {
        if (s.length() == 0) return cnt;
        int matched = Arrays.stream(cro_alp)
                .filter(alp -> alp.length() <= s.length())
                .filter(alp -> s.startsWith(alp))
                .map(alp -> alp.length())
                .findFirst().orElse(1);

        return getCnt(s.substring(matched), cnt + 1, cro_alp);
    }


}

