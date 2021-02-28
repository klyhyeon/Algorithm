package baekJoon.week2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Que10845 {

    /*
        - 입력받은 명령어대로 실행되는 Que 알고리즘을 구현하라.
        - N은 10,000보다 작거나 같고 X는 100,000보다 작거나 같은 양의 정수
        1) push X : X를 큐에 넣는다.
        2) pop : 큐의 가장 앞에 있는 수를 빼고 출력한다. 없을 경우 -1을 출력
        3) size: 큐에 들어있는 정수의 개수를 출력한다.
        4) empty: 큐가 비어있으면 1, 아니면 0을 출력한다.
        5) front: 큐의 가장 앞에 있는 정수를 출력한다. 없을 경우 -1을 출력
        6) back: 큐의 가장 뒤에 있는 정수를 출력한다. 없을 경우 -1을 출력
     */

    /*
        - Stack과 Queue의 차이점: LIFO, FIFO
            > Stack은 프로세스의 undo/redo와 웹 뒤로/앞으로가기에 쓰임
            > Queue는 최근 사용문서, 인쇄 대기목록, 버퍼 등의 기능 구현할 때 쓰임
     */


    public static void main(String[] args) throws IOException {

        //명령어 받을 BufferedReader 생성
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //반복횟수 입력 N <= 10000
        int num = Integer.parseInt(br.readLine());
        //정수를 큐로 저장할 리스트 생성
        List<Integer> list = new ArrayList<>();

        //명령어 num회 시행
        for(int i = 0; i < num; i++) {
            //명령어 변수 초기화 선언
            String input = br.readLine();
            //list.size 변수
            int size = list.size();

            //1) push 일 때 list에 add
            if (input.contains("push")) {
            //push 가려내기 위한 split으로 배열 생성
                String[] arr = input.split(" ");
                list.add(Integer.parseInt(arr[1]));
            }
            //2) pop 일때 스택이 가장 먼저 add된 수 출력 후 삭제, 비어있으면 -1 출력
            else if (input.equals("pop")) {
                if (list.isEmpty()) {
                    System.out.println(-1);
                } else {
                    System.out.println(list.get(0));
                    list.remove(0);
                }
            }
            //3) size 일때 list size 출력
            else if (input.equals("size")) {
                System.out.println(list.size());
            }
            //5) front 일때 가장 먼저 add된 수 출력, 비어있으면 -1 출력
            else if (input.equals("front")) {
                if (list.isEmpty()) {
                    System.out.println(-1);
                } else {
                    System.out.println(list.get(0));
                }
            }
            //6) back
            else if (input.equals("back")) {
                if (list.isEmpty()) {
                    System.out.println(-1);
                } else {
                    System.out.println(list.get(size-1));
                }
            }
            //4) empty 일때 list size가 0이면 1, 아니면 0
            else if (input.equals("empty")) {
                if (list.isEmpty()) {
                    System.out.println(1);
                } else {
                    System.out.println(0);
                }
            }
        }



    }
}
