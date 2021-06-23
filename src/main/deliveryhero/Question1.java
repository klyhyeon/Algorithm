package deliveryhero;

import java.util.*;

public class Question1 {

    public static void main(String[] args) {
        String s = "John Doe; Peter Benjamin Parker; Mary Jane Watson-Parker; John Elvis Doe; John Evan Doe; Jane Doe; Peter Brian Parker";
        String c = "example";
        System.out.println(solution(s, c));
    }

    public static String solution(String S, String C) {
        // write your code in Java SE 8
        Map<String, Integer> map = new HashMap<>();
        String[] names = S.split("; ");
        String resultEmail = "";
        StringBuilder sb = new StringBuilder();
        int l = names.length;
        for (int i = 0; i < l; i++) {
            String editedName = editName(names[i]);
            if (map.containsKey(names[i])) {
                int duplicateNumbering = map.get(names[i]);
                editedName += duplicateNumbering;
                resultEmail = appendEmail(editedName, C);
                map.put(names[i], map.get(names[i]) + 1);
            } else {
                resultEmail = appendEmail(editedName, C);
                map.put(names[i], 1);
            }
                if (i == l-1)
                    sb.append(names[i] + " " + resultEmail);
                else
                    sb.append(names[i] + " " + resultEmail + "; ");
        }
        return sb.toString();
    }

    public static String appendEmail(String name, String company) {
        String email = "<" + name + "@" + company + ".com" + ">";
        return email;
    }

    public static String editName(String name) {
        String[] seperatedNames = name.split(" ");
        String editedName = "";
        String lastName = "";
        String firstName = seperatedNames[0];
        if (seperatedNames.length == 2) {
            lastName = seperatedNames[1];
        } else if (seperatedNames.length == 3) {
            lastName = seperatedNames[2];
        }

        //erase hyphen
        int hyphenIdx = lastName.indexOf('-');
        if (hyphenIdx != -1) {
            while (hyphenIdx != -1) {
                String last1 = lastName.substring(0, hyphenIdx);
                String last2 = lastName.substring(hyphenIdx + 1);
                lastName = (last1 + last2);
                hyphenIdx = lastName.indexOf('-');
            }
        }
        editedName = lastName + "_" + firstName;
        return editedName.toLowerCase();
    }



}
