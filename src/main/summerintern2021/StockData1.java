package summerintern2021;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class StockData1 {

    //기업, 시간 검증
    //price 배열 추가
    public static void main(String[] args) {
        String[] data = {"price=80 code=987654 time=2019062113","price=90 code=012345 time=2019062014","price=120 code=987654 time=2019062010","price=110 code=012345 time=2019062009","price=95 code=012345 time=2019062111"};
        System.out.println(solution("012345", "20190620", data).toString());
    }

    public static List<Integer> solution(String code, String day, String[] data) {
        List<Integer> answer = new ArrayList<>();
        StringTokenizer st;
        int price = 0;
        String givenCode = "";
        String givenDay = "";
        for (String d: data) {
            int count = 0;
            boolean flag = true;
            st = new StringTokenizer(d);
            while (count < 3) {
                String temp = st.nextToken();
                int index = temp.indexOf('=') + 1;
                if (count == 0)
                    price = Integer.parseInt(temp.substring(index));
                else if (count == 1) {
                    givenCode = temp.substring(index);
                    if (!givenCode.equals(code)) {
                        flag = false;
                        break;
                    }
                }
                else if (count == 2){
                    givenDay = temp.substring(index, temp.length() - 2);
                    if (!givenDay.equals(day)) {
                        flag = false;
                        break;
                    }
                }
                count++;
            }
            if (flag)
                answer.add(price);
        }
        Collections.sort(answer);
        Collections.reverse(answer);
        return answer;
    }
}
