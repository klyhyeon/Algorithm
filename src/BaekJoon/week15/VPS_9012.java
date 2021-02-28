package baekJoon.week15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class VPS_9012 {
    /*
    괄호가 열고 닫힘이 올바르게 돼있으면 YES 출력
    - ) 개수가 더 많아선 안되고, 반복이 끝났을 때 () 쌍이 일치해야함
     */
    static String[] parents;
    static int testNum;
    static int openParentsCnt = 0;
    static int closeParentsCnt = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Boolean flag = true;
        testNum = Integer.parseInt(br.readLine());


        while (testNum-- > 0) {
            openParentsCnt = 0;
            closeParentsCnt = 0;
            flag = true;
            parents = null;

            parents = br.readLine().split("");

            for (String ele :
                    parents) {
                if (ele.equals("(")) {
                    openParentsCnt++;
                } else {
                    closeParentsCnt++;
                }

                if (closeParentsCnt > openParentsCnt) {
                    flag = false;
                }
            }
            if (!flag || openParentsCnt > closeParentsCnt) {
                sb.append("NO" + "\n");
            } else {
                sb.append("YES" + "\n");
            }
        }

        System.out.println(sb);
    }
}
