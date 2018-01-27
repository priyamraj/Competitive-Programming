import java.util.*;
import java.io.*;
import java.math.*;
public class CloeAndSequence{
    public static void main(String[] args) {
        MyScanner sc=new MyScanner();
        int n=sc.nextInt();
        long k=sc.nextLong();
        long st[]=new long[51];
        long inc[]=new long[51];
        long ST=1,INC=2;
        for(int i=1;i<=50;i++){
            st[i]=ST;
            inc[i]=INC;
            ST*=2;
            INC*=2;
        }
        for(int i=1;i<=n;i++){
            double v=(k-st[i])/(double)inc[i];
            if(Math.floor(v)==Math.ceil(v)){
                System.out.println(i);
                System.exit(0);
            }
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