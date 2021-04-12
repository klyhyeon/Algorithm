package baekJoon.personal.week5;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Set_HashSet {
    public static void main(String[] args) {
        Set<String> set1 = new HashSet<>();
        //set은 중복추가 안됨
        boolean flag1 = set1.add("kang");
        boolean flag2 = set1.add("kim");
        boolean flag3 = set1.add("kang");

        System.out.println(set1.size());

        System.out.println(flag1);
        System.out.println(flag2);
        System.out.println(flag3);

        //set의 데이터를 출력하려면 Collection의 Iterator 인터페이스를 이용한다.
        Iterator<String> iter = set1.iterator();
        //hasnext 메서드는 지금 데이터가 있니? 데이터가 있는 동안만 true를 반환
        while(iter.hasNext()) {
            //next 메서드는 하나를 꺼내주고 그 다음 것으로 넘어감
            String str = iter.next();
            System.out.println(str);
        }
    }
}
