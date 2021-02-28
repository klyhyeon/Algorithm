package baekJoon.personal.week5;

public class DP_fibonacci {

    public static void main(String[] args) {
        System.out.println(dp(50));
    }

    public static int dp(int x) {

        int[] d = new int[100];
    if(x ==1)return 1;
    if(x ==2)return 1;
    if(d[x] != 0) return d[x];
    return d[x] = dp(x -1) + dp(x -2);

    }


}
