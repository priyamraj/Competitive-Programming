import java.util.*;
import java.io.*;
import java.math.*;
public class Eleven{
    public static void main(String[] args) {
        MyScanner sc=new MyScanner();
        int n=sc.nextInt();
        int a=1,b=1,c=0;
        HashSet<Integer> fib=new HashSet<>();
        fib.add(1);
        while(c<=1000){
          c=a+b;
          fib.add(c);
          a=b;b=c;
        }
        for(int i=1;i<=n;i++){
          if(fib.contains(i)) System.out.print("O");
          else System.out.print("o");
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