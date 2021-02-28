package wootechcourse;

import java.util.*;

public class Test_6 {

    public static void main(String[] args) {
        String[] log = {"1901 10 50", "1909 10 50"};
        Iterator<String> iter = solution(log).iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
    }

    public static TreeSet<String> solution(String[] logs) {
        int length = logs.length;
        String registNum = "";
        String testNum = "";
        String testScore = "";
        TreeSet<String> answer = new TreeSet<String>();
        Set<String> primaryKeys = new HashSet<>();
        //<수험번호, <문제번호, 점수>
        HashMap<String, HashMap<String, String>> logsMap = new HashMap<>();
        //모든 데이터 map에 저장(중복문제 점수업뎃 완료)
        for (int i = 0; i < length; i++) {
            registNum = logs[i].split(" ")[0];
            testNum = logs[i].split(" ")[1];
            testScore = logs[i].split(" ")[2];

            if (primaryKeys.contains(registNum)) {
                logsMap.get(registNum).put(testNum, testScore);
            } else {
                primaryKeys.add(registNum);
                HashMap<String, String> testMap = new HashMap<>();
                testMap.put(testNum, testScore);
                logsMap.put(registNum, testMap);
            }
        }

        String[] primaryKeysArr = primaryKeys.toArray(new String[primaryKeys.size()]);
        boolean overlapFlag = false;

        for (int i = 0; i < primaryKeysArr.length; i++) {
            String currentKey = primaryKeysArr[i];
            for (int j = 0; j < primaryKeysArr.length; j++) {
                String tempKey = primaryKeysArr[j];
                if (currentKey.equals(tempKey))
                    continue;

                Set<String> currentKeyTestKey = logsMap.get(currentKey).keySet();
                String[] currentKeyTestArr = currentKeyTestKey.toArray(new String[currentKeyTestKey.size()]);
                Set<String> tempKeyTestKey = logsMap.get(tempKey).keySet();
                String[] tempKeyTestArr = tempKeyTestKey.toArray(new String[tempKeyTestKey.size()]);

                int currentKeySize = currentKeyTestArr.length;
                int tempKeySize = tempKeyTestArr.length;
                int cnt = 0;

                testInspect:
                for (int k = 0; k < currentKeySize; k++) {
                    if (currentKeySize != tempKeySize) {
                        break;
                    } else {
                        //<문제번호, 점수> 같은지 비교검사
                        for (int l = 0; l < currentKeySize; l++) {
                            if (currentKeyTestArr[k].equals(tempKeyTestArr[l])) {
                                cnt++; //일치하는 문제번호 수가 size와 같아야 함
                                if (logsMap.get(currentKey).get(currentKeyTestArr[k]).equals(
                                        logsMap.get(tempKey).get(tempKeyTestArr[l]))) {
                                    overlapFlag = true;
                                } else {
                                    overlapFlag = false;
                                    break testInspect;
                                }
                            }
                        }
                    }
                    if (overlapFlag && cnt == currentKeySize && cnt >= 5) {
                        answer.add(currentKey);
                        answer.add(tempKey);
                    }
                } //<문제번호, 점수> 비교검사
                overlapFlag = false;
            } //수험번호 비교검사
        } //for문 끝

        if (answer.isEmpty())
            answer.add("NONE");

        return answer;
    }
}

