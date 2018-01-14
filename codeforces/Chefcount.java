import java.util.*;
import java.io.*;
import java.math.*;
public class Chefcount{
    public static void main(String[] args) {
        MyScanner sc=new MyScanner();
        int tc=sc.nextInt();
        while(tc-->0){
           int n=sc.nextInt();
        //    long v=4294967296L;
        //    double k=v/(n+1);
        //    long ans=(long)Math.ceil(k);
        int ans=100000;
           for(int i=0;i<n;i++)
             System.out.print(ans+" ");
           System.out.println();
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