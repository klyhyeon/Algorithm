package wootechcourse;

import java.util.HashMap;
import java.util.Map;

public class Test_1 {

    public static void main(String[] args) {
        String[] grades = {"A+", "D+", "F", "C0"};
        int[] weights = {2, 5, 10, 3};
        int threshold = 50;
        System.out.println(solution(grades, weights, threshold));
    }


    public static int solution(String[] grades, int[] weights, int threshold) {
        int answer = 0;
        int length = grades.length;
        int weightScore = 0;
        String gradeAlpha = "";
        int sum = 0;

        Map<String, Integer> gradesScore = new HashMap<>();
        String[] gradesStandard = {" ", " ", "F", "D0", "D+", "C0", "C+", "B0", "B+", "A0", "A+"};

        for (int i = 10; i > 1; i--) {
            if (i == 2) {
                gradesScore.put(gradesStandard[i], 0);
                break;
            } else {
                gradesScore.put(gradesStandard[i], i);
            }
        }

        for (int j = 0; j < length; j++) {
            weightScore = weights[j];
            gradeAlpha = grades[j];

            sum += gradesScore.get(gradeAlpha) * weightScore;
        }

        answer = sum - threshold;

        return answer;
    }
}
