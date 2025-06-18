import java.util.Scanner;

public class Main {
    public static final int MOD = 10007;
    public static final int MAX_N = 1000;
    
    // 변수 선언
    public static int n;
    
    public static int[] dp = new int[MAX_N + 1];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 입력:
        n = sc.nextInt();

        // 초기 조건 설정
        dp[0] = 1;
        dp[1] = 1;

        // 점화식에 따라 dp값 채우기
        // dp[i] = dp[i - 1] + dp[i - 2]
        for(int i = 2; i <= n; i++)
            dp[i] = (dp[i - 1] + dp[i - 2]) % MOD;

        System.out.print(dp[n]);
    }
}
