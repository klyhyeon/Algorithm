package baekJoon.week6;
/*
    OX 결과가 주어짐 OXOXOOO 연속된 O는 연속 선상에서 n번째 값으로 매겨진다. OXOXOOO = 1 + 1 + 1 + 2 + 3
    - 입력: 첫째 줄에 테스트 케이스 개수가 주어짐. 한 줄로 이루어져 있고 길이가 0보다 크고 80보다 작다.
    - 출력: 테스트 케이스 마다 점수를 출력한다.
 */
/*
    다른 풀이 방법: 조건식을 복잡하게 가져가지 않고, 'O'와 같으면 cnt++; 해준 다음 중첩 반복문에 sum+= cnt; else 일 때 cnt = 0;
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class OXQuiz_8958 {

    static char[] ox;
    static int N;
    static int tempNum = 1;
    static int sum = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());

        for(int i = 0; i < N; i++) {

            st = new StringTokenizer(br.readLine());
            ox = st.nextToken().toCharArray();
            for (int j = 1; j < ox.length; j++) {

                if(ox[j-1] == 'O' && ox[j] == 'O') {

                    tempNum++;
                    sum += tempNum;
                } else if(ox[j-1] != 'O' && ox[j] == 'O') {

                    tempNum = 1;
                    sum++;
                } else {

                    tempNum = 1;
                }

            }

            if(ox[0] == 'O') {
                System.out.println(sum + 1);
            } else {
                System.out.println(sum);
            }
                sum = 0;
                tempNum = 1;
        }

    }
}
