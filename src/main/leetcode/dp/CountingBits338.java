package leetcode.dp;

public class CountingBits338 {

    public static void main(String[] args) {
        int[] ans = countBits(2);
        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i]);
        }

    }

    public static int[] countBits(int n) {
        int[] ans = new int[n+1];

        String bi = Integer.toBinaryString(n);
        for (int i = 0; i < bi.length(); i++) {
            ans[i] = bi.charAt(i) - 48;
        }
        return ans;
    }
}
