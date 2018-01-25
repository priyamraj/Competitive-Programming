import java.util.*;
import java.io.*;
import java.math.*;
public class HungryStudent{
    public static void main(String[] args) {
        MyScanner sc=new MyScanner();
        int t=sc.nextInt();
        while(t-->0){
            boolean b=false;
            int k=sc.nextInt();
            for(int i=0;i<=100;i++)
                for(int j=0;j<=100;j++){
                    int v=3*i+7*j;
                    if(v==k)
                        b=true;
                }
            if(b)
                System.out.println("YES");
            else
                System.out.println("NO");
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