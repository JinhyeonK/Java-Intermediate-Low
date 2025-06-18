import java.util.*;
public class Main {
    public static void main(String[] args) {
        final int MOD = 10007;
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [][]dp=new int [n-1][1];
        for (int i = 0; i <n; i++) {
            for(int j=0;j<=1;j++)
            dp[n][2] = (dp[i-1][j] + dp[i-2][j]) % MOD;
        }
        System.out.print(dp[n][2]);

    }
}