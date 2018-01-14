import java.util.*;
import java.io.*;
import java.math.*;
public class PrisonTransfer{
    public static void main(String[] args) {
        MyScanner sc=new MyScanner();
        int n=sc.nextInt();
        int t=sc.nextInt();
        int c=sc.nextInt();
        int buffer=0;
        int m=n;
        long ans=0;
        while(m-->0){
            int x=sc.nextInt();
            if(x>t){
                int v;
                if(buffer<c) v=0;
                else v=buffer-c+1;
                if(v>=0)
                ans+=v;
                buffer=0;
            }
            else
              buffer++;
        }
        if(buffer-c+1 > 0)
        ans+=buffer-c+1;
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