import java.util.*;
import java.io.*;
import java.math.*;
public class Flowers{
    static int max=100007;
    static long mod=1000000007;
    public static void main(String[] args) {
        MyScanner sc=new MyScanner();
        int tc=sc.nextInt();
        int k=sc.nextInt();
        long dp[][]=new long[2][max];
        Arrays.fill(dp[0],-1);
        Arrays.fill(dp[1],-1);
        // 0 red hai, 1 is white
        dp[0][1]=1;
        for(int i=0;i<k;i++) dp[1][i]=0;
        dp[1][k]=1;
        for(int i=1;i<max;i++){
          if(dp[0][i]==-1) // ending wid red wali series..
          dp[0][i]=(dp[0][i-1]%mod + dp[1][i-1]%mod )%mod;
          if(dp[1][i]==-1) // ending wid white wali series
          dp[1][i]=(dp[0][i-k]%mod +dp[1][i-k]%mod )%mod;
        }
        long res[]=new long[max];
        for(int i=1;i<max;i++){
          res[i]=(dp[0][i]%mod + dp[1][i]%mod )%mod;
        }
        for(int i=1;i<max;i++)
          res[i]=(res[i]%mod + res[i-1]%mod) % mod;

        while(tc-->0){
          int a=sc.nextInt();
          int b=sc.nextInt();
          long ans=res[b];
          ans=(ans-res[a-1])%mod;
          ans=(ans+mod)%mod;
          System.out.println(ans);
        }
    }


    private static class MyScanner {
      BufferedReader br;
      StringTokenizer st;

      public MyScanner() {
         br = new BufferedReader(new InputStreamReader(System.in));
      }

      String next() {
          while (st == null || !st.hasMoreElements()) {
              try {
                  st = new StringTokenizer(br.readLine());
              } catch (IOException e) {
                  e.printStackTrace();
              }
          }
          return st.nextToken();
      }

      int nextInt() {
          return Integer.parseInt(next());
      }

      long nextLong() {
          return Long.parseLong(next());
      }

      double nextDouble() {
          return Double.parseDouble(next());
      }

      String nextLine(){
          String str = "";
	  try {
	     str = br.readLine();
	  } catch (IOException e) {
	     e.printStackTrace();
	  }
	  return str;
      }
   }
}