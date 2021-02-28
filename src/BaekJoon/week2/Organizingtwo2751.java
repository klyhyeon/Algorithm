package baekJoon.week2;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Organizingtwo2751 {

        public static void main(String[] args) throws IOException {
        /*
              N개의 숫자가 주어졌을 때, 이를 오름차순으로 정렬하는 프로그램

            - 입력: 첫째 줄엔 수의 개수, 둘째 줄부턴 N개의 수 이는 절댓값이 1000000보다 작거나 같은 정수,  중복 없음
            - 출력: 윗 줄부터 순서대로 출력

         */

            //!오름차순 기준을 1<2<3... 가 아닌 8<2<4... 로 변경했을 땐 어떻게 접근해야할까?

            //*탐색과 정렬 알고리즘 이용해보기
            //Arraysort를 이용하면 시간이 오래걸림. nlogn 정렬을 이용하기 때문.
            //List는 Timsort를 이용하는 CollectionSort를 사용하기에 시간이 단축됨
            //StringBuilder는 String과 달리 문자를 저장해놓지 않기 때문에 연산 시 속도가 더 빠르다.
            // > 객체를 생성해줘야 하며, 호출 시 append 즉, 문자를 추가해주어서 한번에 출력되도록 해야한다.


            //1번 풀이. List 활용
//            Scanner sc = new Scanner(System.in);
//            StringBuilder sb = new StringBuilder();
//
//            int round = sc.nextInt();
//            ArrayList<Integer> list = new ArrayList<>();
//
//            for (int i = 0; i < round; i++) {
//                list.add(sc.nextInt());
//            }
//
//            Collections.sort(list);
//
//            for (int j : list
//            ) {
//                sb.append(j).append('\n');
//            }
//
//            System.out.println(sb);

            //2번 풀이. List + Bufferedreader 활용
            //1번 보다 메모리 & 시간 0.5배 단축
//            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//            StringBuilder sb = new StringBuilder();
//
//            int round = Integer.parseInt(br.readLine());
//            List<Integer> list = new ArrayList<>();
//
//            for(int i = 0; i < round; i++) {
//                list.add(Integer.parseInt(br.readLine()));
//            }
//
//            Collections.sort(list);
//
//            for (int v : list
//                 ) {
//                sb.append(v).append('\n');
//            }
//
//            System.out.println(sb);

            //3번 풀이. Boolean 배열 + BufferedReader 활용
            //최단시간 2번보다 약 0.4배 단축
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringBuilder sb = new StringBuilder();

            int round = Integer.parseInt(br.readLine());

            boolean[] arr = new boolean[2000001];

            //O(n)
            for(int i = 0; i < round; i++) {
                arr[Integer.parseInt(br.readLine()) + 1000000] = true;
            }
            //O(n)
            for(int i = 0; i < arr.length; i++) {
                if(arr[i]) {
                    sb.append(i-1000000).append('\n');
                }
            }

            System.out.println(sb);







        }

    }


