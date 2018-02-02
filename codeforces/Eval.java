import java.util.*;
import java.io.*;
public class Eval{
    static int dp[][];
    static int len,n;
    public static int calc(int step,int num){
        if(dp[step][num]!=-1) return dp[step][num];
        if(step==len) return dp[step][num]=1;
        dp[step][num]=0;
        for(int i=num;i<=n;i+=num)
           dp[step][num]+=calc(step+1,i);
        return dp[step][num];
       }
    public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      n=sc.nextInt();
      len=sc.nextInt();
      dp=new int[len+1][n+1];
      for(int i=0;i<dp.length;i++)
        Arrays.fill(dp[i],-1);
      System.out.println(calc(0,1));
      for(int i=1;i<=len;i++){
          for(int j=1;j<=n;j++)
            System.out.print(dp[i][j]+" ");
          System.out.println();
      }
    }
}