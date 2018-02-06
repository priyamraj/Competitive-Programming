import java.util.*;
import java.io.*;
import java.math.*;
public class HungrySequence{
    public static boolean isPrime(int n){
        BigInteger b=new BigInteger(Integer.toString(n));
        if(b.isProbablePrime(10))
            return true;
        return false;
    }
    public static void main(String[] args) {
        MyScanner sc=new MyScanner();
        int m=10000000;
        int ans=0;
        for(int i=2;i<m+7;i++)
            if(isPrime(i)) ans++;
        System.out.println(ans);
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