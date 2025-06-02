import java.io.*;
import java.util.*;
public class Main {
    public static final int MAX_NUM=1000;
    public static int n,m;
    public static int[][] graph =new int[MAX_NUM+1][MAX_NUM+1];
    public static boolean[] visited =new boolean[MAX_NUM+1];
    public static int vertexCnt = 0;
    public static void dfs(int vertex){
        for(int currV =1; currV<=n; currV++){
            if(graph[vertex][currV]==1 && !visited[currV]){
                visited[currV]=true;
                vertexCnt++;
                dfs(currV);
            }
        }
    }
    public static void main(String[] args) throws IOException{
        // Please write your code here.
    BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
    n=Integer.parseInt(br.readLine());
    m=Integer.parseInt(br.readLine());

    for (int i = 0; i < m; i++) {
        StringTokenizer st = new StringTokenizer(br.readLine());
        int v1 = Integer.parseInt(st.nextToken());
        int v2 = Integer.parseInt(st.nextToken());
        graph[v1][v2] = 1;
        graph[v2][v1] = 1;
    visited[1]=true;
    dfs(1);
    System.out.println(vertexCnt);
    }
}