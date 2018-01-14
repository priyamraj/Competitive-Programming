import java.util.*;
import java.io.*;
import java.math.*;
public class Email{
    static int ans=0,i=0;
    static int arr[];
    public static void read(){
      ans++;
      System.out.println("READ");
    }
    public static void scrollLeft(){
      ans++;i++;
      System.out.println("SCROLL LEFT");
    }
    public static void goback(){
      if(i+1<arr.length && arr[i+1]==1){
        i++;
        ans++;
        System.out.println("IMMEDIATE GOBACK");
        return;
      }
      while(i<arr.length && arr[i]==0) i++;
      if(i!=arr.length) ans++;
      System.out.println("CASCADED GOBACK");
    }
    public static void main(String[] args) {
        MyScanner sc=new MyScanner();
        int n=sc.nextInt();
        arr=new int[n];
        for(int i=0;i<n;i++) arr[i]=sc.nextInt();
        while(i<n && arr[i]==0) i++;
        while(i<n){
          if(arr[i]==1){
            read();
            i++;
            while(i<n && arr[i]==1) scrollLeft();
          }
          if(i<n && arr[i]==0) goback();
        }
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