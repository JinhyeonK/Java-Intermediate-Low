import java.io.*;
import java.util.*;
public class Main {
    public static int n;
    public static final int MAX_N=19;
    public static int [] dp=new int [MAX_N+1];
    public static int nBST(int n){
    int nBST=0;
    for(int i =0; i<n;i++){
        nBST+=dp[i]*dp[n-i-1];
    }
    return nBST;
    }
    public static void main(String[] args) throws IOException{
        // Please write your code here.
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        n=Integer.parseInt(br.readLine());
        dp[0]=1;
        dp[1]=1;
        for(int i=2;i<=n;i++){
            dp[i]=nBST(i);
        }
        System.out.print(dp[n]);
    }
}