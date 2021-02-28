package baekJoon.week3;

import java.util.*;

/*
    - N명의 사람들이 주어지며 N줄엔 각 사람들이 지불할 팁 액수가 적혀있다.
    팁은 지불할 팁 액수 -(등수 -1)원으로 정해진다. 팁을 최대로 높이는 배열을 구했을 때 최대값을 출력하시오
 */
/*
    - Map 사용
     > key엔 등수, value엔 팁 금액.
     > value를 sum했을때 max 되는 값 출력

    - 틀렸다고 나옴..
 */
public class StarBox_1758 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //<등수K, 금액V>
        //HashMap<Integer, Integer> tipRank = new HashMap<>();
        int people = sc.nextInt();
        List<Integer> tipRank = new ArrayList<>();

        for(int i = 0; i < people; i++) {
            int tip = sc.nextInt();
            tipRank.add(tip);
        }

        Collections.sort(tipRank, Collections.reverseOrder());

        int tipFixed = 0;
        int sum = 0;

        for(int j = 0; j < people; j++) {
            tipFixed = tipRank.get(j) - j;
            if(tipFixed>0) sum += tipFixed;
        }

        System.out.println(sum);

    }




}
