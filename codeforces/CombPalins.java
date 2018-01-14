import java.util.*;
import java.io.*;
import java.math.*;
public class CombPalins{
    public static boolean isPalin(String s){
        String s2=((new StringBuilder(s)).reverse()).toString();
        if(s.equals(s2)) return true;
        return false;
    }
    public static void main(String[] args) {
        MyScanner sc=new MyScanner();
        String s=sc.next();
        int len=sc.nextInt();
        if((s.length())%len!=0){System.out.print("NO");System.exit(0);}
        int steps=(s.length())/len;
        for(int i=0;i<s.length();i+=steps){
            String t=s.substring(i,i+steps);
            if(!isPalin(t)){System.out.println("NO");System.exit(0);}
        }
        System.out.println("YES");
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