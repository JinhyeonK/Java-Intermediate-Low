import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final int MOD = 10007;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] dp = new int[n + 1];

        if (n >= 2) dp[2] = 1;
        if (n >= 3) dp[3] = 1;

        for (int i = 4; i <= n; i++) {
            dp[i] = (dp[i - 2] + dp[i - 3]) % MOD;
        }

        System.out.println(dp[n]);
    }
}
