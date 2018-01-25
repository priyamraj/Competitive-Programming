import java.util.*;
import java.io.*;
import java.math.*;
public class FindExtraOne{
    public static void main(String[] args) {
        MyScanner sc=new MyScanner();
        int n=sc.nextInt();
        int left=0,right=0;
        while(n-->0){
            int x=sc.nextInt();
            int y=sc.nextInt();
            if(x<0) left++;
            else if(x>0) right++;
        }
        if(left==1 && right>=1) System.out.println("Yes");
        else if(left>=1 && right==1) System.out.println("Yes");
        else if(left==0 && right>=1) System.out.println("Yes");
        else if(left>=1 && right==0) System.out.println("Yes");
        else System.out.println("No");
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