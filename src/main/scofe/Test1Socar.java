package scofe;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.time.LocalTime;

public class Test1Socar {
        //35min
        public static void main(String[] args) throws Exception {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int people = Integer.parseInt(br.readLine());
            LocalTime[] desTimeArr = new LocalTime[people];
            LocalTime[] endTimeArr = new LocalTime[people];
            LocalTime desTimeAnswer = LocalTime.MIN;
            LocalTime endTimeAnswer = LocalTime.MAX;
            int i = 0;
            while (i <  people) {
                String positiveTime = br.readLine();
                LocalTime desTime = LocalTime.parse(positiveTime.substring(0,5));
                LocalTime endTime = LocalTime.parse(positiveTime.substring(8));
                desTimeArr[i] = desTime;
                endTimeArr[i] = endTime;
                    if (desTimeAnswer.compareTo(desTimeArr[i]) < 0)
                        desTimeAnswer = desTimeArr[i];
                    if (endTimeAnswer.compareTo(endTimeArr[i]) > 0)
                        endTimeAnswer = endTimeArr[i];
                i++;
            }
            if (desTimeAnswer.compareTo(endTimeAnswer) >= 0) {
                System.out.println(-1);
            } else {
                System.out.println(desTimeAnswer + " ~ " + endTimeAnswer);
            }
        }

}
