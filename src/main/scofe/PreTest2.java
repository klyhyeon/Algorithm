package scofe;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class PreTest2 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        Long testCase = Long.parseLong(input);
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        while (testCase-- > 0) {
            br.readLine().split(" ");
            st = new StringTokenizer(br.readLine());
            Long seasonal = Long.parseLong((st.nextToken()));
            Long normal = Long.parseLong((st.nextToken()));
            sb.append(getCouponCnt(seasonal, normal) + "\n");
        }
        System.out.println(sb);
    }

    static Long getCouponCnt(Long seasonal, Long normal) {
        Long result = 0L;
        Long seasonalVal = seasonal / 5;
        Long seasonalLeft = seasonal % 5;
        Long normalVal = normal / 7;
        Long normalLeft = normal % 7;
        if (seasonal < 5 || (seasonal < 12 && normal == 0))
            return 0L;
        if (seasonalVal <= normalVal) {
            result = seasonalVal;
        } else if (seasonalVal > normalVal) {
            result = normalVal;
            result+= (((seasonalVal - normalVal)*5 + seasonalLeft) + normalLeft) / 12;
        }
        return result;
    }
}
