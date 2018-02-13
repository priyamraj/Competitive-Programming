import java.util.*;
import java.io.*;
import java.math.*;
public class Tprime{
    static final int max=1000007;
    static int sieve[]=new int[max];
    public static void create(){
        for(int i=3;i<max;i+=2) sieve[i]=1;
        sieve[2]=1;
        for(int i=3;i*i<max;i+=2){
            for(int j=i*i;j<max;j=j+i+i)
                sieve[j]=0;
        }
    }
    public static void main(String[] args) {
        MyScanner sc=new MyScanner();
        create();
        int n=sc.nextInt();
        while(n-->0){
            long v=sc.nextLong();
            double sq=Math.sqrt(v);
            if(Math.ceil(sq)!=Math.floor(sq)){
                System.out.println("NO");
                continue;
            }
            int s=(int)sq;
            if(sieve[s]==1) System.out.println("YES");
            else System.out.println("NO");
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