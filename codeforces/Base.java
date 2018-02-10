import java.util.*;
import java.io.*;
import java.math.*;
public class Base{
    public static void main(String[] args) {
        MyScanner sc=new MyScanner();
        long v1=0,v2=0;
        int x=sc.nextInt();
        int arr[]=new int[x];
        int bx=sc.nextInt();
        long init=1;
        for(int i=0;i<x;i++) arr[i]=sc.nextInt();
        for(int i=x-1;i>=0;i--){
          v1+=arr[i]*init;
          init*=bx;
        }
        int y=sc.nextInt();
        int by=sc.nextInt();
        int brr[]=new int[y];
        init=1;
        for(int i=0;i<y;i++) brr[i]=sc.nextInt();
        for(int i=y-1;i>=0;i--){
          v2+=brr[i]*init;
          init*=by;
        }        
        if(v1>v2) System.out.println(">");
        else if(v1==v2) System.out.println("=");
        else System.out.println("<");
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