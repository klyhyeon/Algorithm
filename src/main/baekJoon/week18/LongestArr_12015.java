package baekJoon.week18;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class LongestArr_12015 {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int reps = Integer.parseInt(br.readLine());
        int[] inputNumbers = new int[reps];
        st = new StringTokenizer(br.readLine());
        //주어진 숫자 배열에 담기
        for (int i = 0; i < reps; i++) {
            inputNumbers[i] = Integer.parseInt(st.nextToken());
        }

        //LIS 리스트
        List<Integer> longestArr = new ArrayList<>();
        //첫 인자를 추가해 주기위해 리스트에 최소값을 넣어둠
        longestArr.add(Integer.MIN_VALUE);
        for (int i = 0; i < reps; i++) {
            //주어진 배열 인자값을 number 변수로 받음
            int number = inputNumbers[i];
            int end = longestArr.size() - 1;
            //number가 리스트 최대값보다 크면 add, 작거나 같으면 이분탐색
            if (number > longestArr.get(end)) {
                longestArr.add(number);
            } else {
                int left = 0;
                int right = end;
                while (left < right) {
                    int middle = (left + right) / 2;
                    if (longestArr.get(middle) < number) {
                        left = middle + 1;
                    } else {
                        right = middle;
                    }
                }
                //end 인자값 다음으로 작으면 number값으로 최대값 교체
                //중간값이 되면 순서가 관여되는데 교체하면 안되지 않나?
                //add가 아니라 대체하는 것이기 때문에 size엔 영향을 주지 않는다.
                //10 30 40 50 20 이라면, 20이 left = 1번째가 되므로 30을 대체하여도 사이즈는 40 그대로다.
                longestArr.set(left, number);
            }
        }
        System.out.println(longestArr.size() - 1);
    }
}
