import java.util.*;
import java.io.*;
import java.math.*;
public class ChessClass{
    public static void main(String[] args) {
        MyScanner sc=new MyScanner();
        int n=sc.nextInt();
        int jaldikhtm1=Integer.MAX_VALUE;
        int derstart1=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            int v1=sc.nextInt();
            int v2=sc.nextInt();
            jaldikhtm1=Math.min(v2,jaldikhtm1);
            derstart1=Math.max(v1,derstart1);
        }
        int jaldikhtm2=Integer.MAX_VALUE;
        int derstart2=Integer.MIN_VALUE;
        int m=sc.nextInt();
        for(int i=0;i<m;i++){
            int v1=sc.nextInt();
            int v2=sc.nextInt();
            derstart2=Math.max(derstart2,v1);
            jaldikhtm2=Math.min(jaldikhtm2,v2);
        }
        int ans1=derstart2-jaldikhtm1;
        int ans2=derstart1-jaldikhtm2;
        if(ans1<0) ans1=0;
        if(ans2<0) ans2=0;
        System.out.println(ans1+" "+ans2);
        System.out.println(Math.max(ans1,ans2));
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