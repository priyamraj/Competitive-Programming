import java.util.*;
import java.io.*;
import java.math.*;
public class Bridges{
    static final int MAX=5007;
    static final int MOD= 998244353;
    static long ncr[][]=new long[MAX][MAX];
    static long fact[]=new long[MAX];
    
    public static void makeFact(){
        fact[0]=1;
        for(int i=1;i<MAX;i++){
            fact[i]=(i *fact[i-1])%MOD;
        }
    }
    public static void makeNcr(){
        ncr[0][0]=1;
        for(int i=1;i<MAX;i++){
            ncr[i][0]=1;
            for(int j=1;j<=i;j++){
                ncr[i][j]=(ncr[i-1][j-1] +ncr[i-1][j]) % MOD;
            }
        }
    }
      
    public static void main(String[] args) {
        MyScanner sc=new MyScanner();
        makeNcr();
        makeFact();
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        long ans1=0;
        for(int i=0;i<=Math.min(a,b);i++){
            long v1=(ncr[a][i] * ncr[b][i])%MOD;
            long v2=(v1 * fact[i])%MOD;
            ans1=(ans1 + v2)%MOD;
        }
        long ans2=0;
        for(int i=0;i<=Math.min(b,c);i++){
            long v1=(ncr[b][i] * ncr[c][i])%MOD;
            long v2=(v1 * fact[i])%MOD;
            ans2=(ans2 + v2)%MOD;
        }
        long ans3=0;
        for(int i=0;i<=Math.min(a,c);i++){
            long v1=(ncr[a][i] * ncr[c][i])%MOD;
            long v2=(v1 * fact[i])%MOD;
            ans3=(ans3 + v2)%MOD;
        }
        long fin=(ans1 * ans2)%MOD;
        fin=(fin * ans3)%MOD;
        System.out.println(fin);
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