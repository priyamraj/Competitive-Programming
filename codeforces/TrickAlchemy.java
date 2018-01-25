import java.util.*;
import java.io.*;
import java.math.*;
public class TrickAlchemy{
    public static void main(String[] args) {
        MyScanner sc=new MyScanner();
        long yellow=sc.nextLong();
        long blue=sc.nextLong();
        long x=sc.nextLong();
        long y=sc.nextLong();
        long z=sc.nextLong();
        long yneeded=x*2+y-yellow;
        long bneeded=y+3*z-blue;
        if(yneeded<0) yneeded=0;
        if(bneeded<0) bneeded=0;
        yneeded+=bneeded;
        System.out.println(yneeded);
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