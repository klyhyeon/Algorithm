package deliveryhero;

import java.util.*;

public class Question2 {

    public static void main(String[] args) {
        int[] array = {4,2,2,4,2};
        System.out.println(solution(array));
    }

    public static int solution(int[] A) {
        // write your code in Java SE 8
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : A) {
           map.put(i, 0);
        }
        List<Integer> list = new ArrayList<>();
        for (Map.Entry<Integer,Integer> e : map.entrySet()) {
            list.add(e.getKey());
        }
        for (int i = 0; i < list.size(); i++) {
            int cnt = 0;
            for (int j = 0; j < A.length; j++) {
                if (list.get(i) == A[j])
                    cnt++;
            }
            map.put(list.get(i), cnt);
        }
        List<Integer> cntList = new ArrayList<>();
        for (Map.Entry<Integer,Integer> e : map.entrySet()) {
            cntList.add(e.getValue());
        }
        Collections.sort(cntList);

        return cntList.get(cntList.size() - 1) + cntList.get(cntList.size() - 2);
    }
}
