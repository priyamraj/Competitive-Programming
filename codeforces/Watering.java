import java.util.*;
import java.io.*;
import java.math.*;
public class Watering{
    public static int leftLimit(int arr[],int p){
      int pos=-1;
      for(int i=p;i>=1;i--){
        if(arr[i]==1){
          pos=i;
          break;
        }
      }
      return pos;
    }
    public static int rightLimit(int arr[],int p){
      int pos=-1;
      for(int i=p;i<arr.length;i++){
        if(arr[i]==1){
          pos=i;
          break;
        }
      }
      return pos;
    }
    public static void main(String[] args) {
        MyScanner sc=new MyScanner();
        int tc=sc.nextInt();
        while(tc-->0){
          int n=sc.nextInt();
          int arr[]=new int[n+1];
          int t=sc.nextInt();
          int m=Integer.MIN_VALUE;
          for(int i=0;i<t;i++) arr[sc.nextInt()]=1;
          for(int i=1;i<=n;i++){
            int left=leftLimit(arr,i);
            int right=rightLimit(arr,i);
            // System.out.println(left+" "+right);
            int v=Integer.MIN_VALUE;
            if(left==-1 && right!=-1) v=right-i;
            else if(left!=-1 && right==-1) v=i-left;
            else v=Math.min(i-left,right-i);
            m=Math.max(m,v);
          }
          m++;
          System.out.println(m);
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