package baekJoon.personal.week5;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Map_HashMap {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("001", "kim");
        map.put("002", "lee");
        map.put("003", "choi");
        //key값은 중복될 수 없다. 중복된다면 마지막에 넣어준 key의 value를 출력한다.
        map.put("001", "kang");

        System.out.println(map.size());

        System.out.println(map.get("001"));
        System.out.println(map.get("002"));

        //map이 가지고 있는 모든 key값들을 구하는 메서드
        Set<String> keys = map.keySet();
        //key Set 자료구조에 key 값들만 들어있음
        Iterator<String> iter = keys.iterator();
        while(iter.hasNext()) {
            String key = iter.next();
            String value = map.get(key);
            System.out.print(key + ": ");
            System.out.println(value);
        }

    }
}
