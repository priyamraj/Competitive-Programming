import java.util.*;
import java.io.*;
import java.math.*;
public class Perfcont{
    public static void main(String[] args) {
        MyScanner sc=new MyScanner();
        int tc=sc.nextInt();
        while(tc-->0){
            int n=sc.nextInt();
            int t=sc.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++) arr[i]=sc.nextInt();
            int cake=0,hard=0;
            for(Integer x:arr){
                if(x>=t/2) cake++;
                else if(x<=t/10) hard++;
            }
            if(cake==1 && hard==2)
            System.out.println("yes");
            else
            System.out.println("no");
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