import java.util.*;
import java.io.*;

public class Main {
    public static final int MOD = 1000000007;

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // dp[i]는 2×i 직사각형을 타일로 채우는 방법의 수
        long[] dp = new long[n + 1];
        // sum[i]는 dp[0]부터 dp[i]까지의 누적합 (반복되는 합을 줄이기 위한 최적화)
        long[] sum = new long[n + 1];

        dp[0] = 1;
        if (n >= 1) dp[1] = 2;
        if (n >= 2) dp[2] = 7;

        sum[0] = dp[0];
        if (n >= 1) sum[1] = (sum[0] + dp[1]) % MOD;
        if (n >= 2) sum[2] = (sum[1] + dp[2]) % MOD;

        for (int i = 3; i <= n; i++) {
            // 점화식: dp[i] = dp[i-1]*2 + dp[i-2]*3 + sum[i-3]*2
            dp[i] = (dp[i - 1] * 2 + dp[i - 2] * 3 + sum[i - 3] * 2) % MOD;
            sum[i] = (sum[i - 1] + dp[i]) % MOD;
        }

        System.out.println(dp[n]);
    }
}
