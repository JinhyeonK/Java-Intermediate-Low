import java.util.*;
import java.io.*;

public class Main {
    public static final int MAX_N = 10;
    public static int n, k;
    public static int[] coins = new int[MAX_N];
    public static int ans;

    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());

        for (int i = 0; i < n; i++) {
            coins[i] = Integer.parseInt(br.readLine());
        }

        for (int i = n - 1; i >= 0; i--) {
            ans += k / coins[i];
            k %= coins[i];
        }

        System.out.print(ans);
    }
}
