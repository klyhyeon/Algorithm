package baekJoon.personal.prac;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderPrac {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\klyhy\\git\\salle_eclipse_v1\\demo\\src\\main\\resources\\static\\txt\\15_27.txt"));

        String test1;

        while ((test1 = br.readLine()) != null) {
            System.out.println(test1);
        }
    }
}
