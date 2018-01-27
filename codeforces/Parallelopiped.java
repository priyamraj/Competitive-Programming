import java.util.*;
import java.io.*;
import java.math.*;
public class Parallelopiped{
    public static void main(String[] args) {
        MyScanner sc=new MyScanner();
        int a1=sc.nextInt();
        int a2=sc.nextInt();
        double a3=sc.nextDouble();
        int a=(int)Math.sqrt((a1*a3)/a2);
        int b=(int)Math.sqrt((a1*a2)/a3);
        int c=(int)Math.sqrt((a2*a3)/a1);
        System.out.println(4*(a+b+c));
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