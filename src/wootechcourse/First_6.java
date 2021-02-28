package wootechcourse;

public class First_6 {

    public static void main(String[] args) {
        int totalTicket = 0;
        String[] logs = {"woni request 09:12:29", "brown request 09:23:11"};

        System.out.println(ticketingSuceed(totalTicket, logs));
    }

    public static String[] ticketingSuceed(int n, String[] s) {
        String[] answer = new String[10001];
        int logCnt = s.length;
        int[] currentLogin = new int[2];
        int[] currentLeave = new int[2];
        String[] tempLog = new String[3];
        String[][] logData = new String[logCnt][3];

        for (int i = 0; i < logCnt; i++) {
            logData[i] = s[i].split(" ");
        }

        for (int i = 0; i < logCnt; i++) {
            tempLog = logData[i][2].split(":");
            if (i == 0) {
                currentLogin[0] = Integer.parseInt(tempLog[1]);
                currentLogin[1] = Integer.parseInt(tempLog[2]);
            }

            for (int j = i + 1; j < logCnt; j++) {
            }
        }
        return answer;
    }


}
