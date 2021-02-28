package baekJoon.week2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ScaleMusic2920 {
    /*
        - 1~8까지 수가 c d e f g a b C 총 8개음에 대응한다.
        - 1~8까지 오름차순으로 하면 ascending, 내림차순은 descending, 짬뽕은 mixed
        - 입력: 첫째 줄에 8개 숫자가 주어진다.
        - 출력: ascending, descending, mixed 중 맞는 것으로 출력
     */
    /*
        - 두 개 이상의 수를 담을 수 있는 건? 배열
        - BufferedReader 사용: Scanner에 비해 많은 양을 처리할 때 효율적임

     */

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //split 배열
        String[] str = br.readLine().split(" ");

        int ascCount = 0;
        int descCount = 0;

        for(int i = 0; i < 7; i++) {
            int c = Integer.parseInt(str[i]);
            int d = Integer.parseInt(str[i + 1]);
                if(d == c + 1) {
                    ascCount++;
                } else if(d == c - 1) {
                    descCount++;
                }
            }

        if(ascCount == 7) {
            System.out.println("ascending");
        } else if(descCount == 7) {
            System.out.println("descending");
        } else {
            System.out.println("mixed");
        }

        }





    }

