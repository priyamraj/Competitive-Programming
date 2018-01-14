import java.util.*;
import java.io.*;
public class Vacations{
    public static int maximum(int arr[]){
        int  ans=0;
        for(Integer x:arr)
          ans=Math.max(ans,x);
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n+1];
        for(int i=1;i<=n;i++) arr[i]=sc.nextInt();
        int dp[][]=new int[n+1][3];
        for(int i=1;i<=n;i++){
            dp[i][0]=maximum(dp[i-1]);
            if(arr[i]==1||arr[i]==3)
              dp[i][1]=Math.max(dp[i-1][0]+1,dp[i-1][2]+1);
            if(arr[i]==2||arr[i]==3)
              dp[i][2]=Math.max(dp[i-1][0]+1,dp[i-1][1]+1);
        }
        int ans=0;
        for(int i=1;i<=n;i++)
          for(int j=0;j<3;j++)
            ans=Math.max(ans,dp[i][j]);
        System.out.println((n-ans));
    }
}