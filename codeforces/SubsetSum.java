import java.io.*;
import java.util.*;
public class SubsetSum{
    public static boolean isSubsetSum(int arr[],int n,int sum){
        boolean dp[][]=new boolean[n+1][sum+1];
        for(int i=0;i<=n;i++)
         dp[i][0]=true;
        for(int i=0;i<=sum;i++)
         dp[0][i]=false;
        
         for(int i=1;i<=n;i++){
             for(int j=1;j<=sum;j++){
                if(arr[i-1]>j)
                  dp[i][j]=dp[i-1][j];
                else
                  dp[i][j]=dp[i-1][j] || dp[i-1][j-arr[i-1]];
             }
         }
            return dp[n][sum];
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int tc=sc.nextInt();
        while(tc-->0){
        int n=sc.nextInt();
        int set[]=new int[n];
        int del=0;
        for(int i=0;i<n;i++){
        set[i]=sc.nextInt();
        del+=set[i];
    }
        if(del%2==1){
            System.out.println("NO");
            continue;
        }

        int sum = del/2;
        if (isSubsetSum(set, n, sum) == true)
             System.out.println("YES");
        else
             System.out.println("NO");
        }
    }
}