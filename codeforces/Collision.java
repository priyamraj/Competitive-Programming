import java.util.*;
import java.io.*;
import java.math.*;
public class Collision{
    public static void main(String[] args) {
        MyScanner sc=new MyScanner();
        int n=sc.nextInt();
        char dir[]=(sc.next()).toCharArray();
        int arr[]=intArrayUtil(n);
        int mn=Integer.MAX_VALUE;
        for(int i=1;i<n;i++){
            if(dir[i-1]=='R' && dir[i]=='L')
            mn=Math.min(mn,(arr[i]-arr[i-1])/2);
        }
        if(mn==Integer.MAX_VALUE) System.out.print(-1);
        else System.out.print(mn);
    }
    public static int gcd(int a,int b){
        if(a==1||b==1)return 1;
        if(a%b==0)return b;
        return gcd(b,a%b);
    }
    public static int[] intArrayUtil(int n){
        int arr[]=new int[n];
        MyScanner sc=new MyScanner();
        for(int i=0;i<n;i++) arr[i]=sc.nextInt();
        return arr;
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