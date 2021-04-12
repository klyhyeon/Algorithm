package baekJoon.week1;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LongestWord5637 {

    public static void main(String[] args) throws IOException {

        /*
        #5637 가장 긴 단어
         - 입력: 10,000 단어가 넘지 않는 문단들 입력, 맨 마지막에 E-N-D가 온다.
         - 출력: 기호, 문자 통틀어 가장 긴 단어 출력
         */

        /*

         1. Space조건으로 split하고 String로 다 받는다.
         2. String 사이즈가 가장 큰 단어를 반환한다.

         */

        /*

        - GG.. 도저히 못풀겠다..
            개행이 있는 입력값을 어떻게 받아야 할지 모르겠다.
         */

        /* 원본 문제

        A word is composed of only letters of the alphabet (a-z, A-Z) and may contain one hyphen (-) or more.
Given a text containing words, and other characters (punctuations, numbers, symbols, etc), you are to
write a program to find the longest word.
Each letter or a hyphen in a word is counted as 1. For example,

The length of Apple is 5
The length of son-in-law is 10
The length of ACM-ICPC is 8

Input
A text may contain several lines and paragraphs but the text does not exceed 10,000 characters. No
word can exceed 100 characters. The word ‘E-N-D’ indicates the end of input.

Output
Print out the longest word in small letters. If there exist several longest words, print only the first one
found in the text.

Sample Input
ACM International Collegiate Programming Contest (abbreviated as
ACM-ICPC or just ICPC) is an annual multi-tiered computer programming
competition among the universities of the world. The contest is
sponsored by IBM. Headquartered at Baylor University, with autonomous
regions on six continents, the ICPC is directed by Baylor Professor
William B. Poucher, Executive Director, and operates under the
auspices of the Association for Computing Machinery (ACM).
The 2012 ACM-ICPC Asia Hatyai Regional Programming Contest is
held during 15-16 November 2012. It is hosted by Prince of Songkla
University, Hatyai campus. E-N-D

Sample Output
international
         */

        Scanner sc = new Scanner(System.in);

        while(true){

            String[] str = sc.nextLine().split(" ");
            List<String> list = new ArrayList<>();

            if(list.contains("E-N-D")) {
                break;
            }

            System.out.println(list);

        }

        System.out.println("끝");


    }


}
