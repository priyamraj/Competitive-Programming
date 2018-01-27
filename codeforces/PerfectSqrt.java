import java.util.*;
import java.io.*;
import java.math.*;
public class PerfectSqrt{
    public static long sqr(long a) {
		return a * a;
	}
    public static void main(String[] args) {
        MyScanner sc=new MyScanner();
        long ans = Long.MIN_VALUE;
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			long a = sc.nextLong();
			if (ans < a && (a < 0 || a != sqr(Math.round(Math.sqrt(a))))) {
				ans = a;
			}
		}
		System.out.print(ans);
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