import java.util.*;
import java.io.*;
import java.math.*;
public class ThreePalin{
    public static boolean isNotPalin(String s){
        String s2=((new StringBuilder(s)).reverse()).toString();
        if(s.equals(s2))return false;
        return true;
    }
    public static void main(String[] args) {
        MyScanner sc=new MyScanner();
        int n=sc.nextInt();
        String pre[]={"a","aa","bba"};
        if(n<=3){
            System.out.println(pre[n-1]);
            System.exit(0);
        }
        StringBuilder ans=new StringBuilder("bba");
        for(int i=3;i<n;i++){
            String witha=ans.charAt(i-2)+""+ans.charAt(i-1)+"a";
            if(isNotPalin(witha)){ans.append("a");continue;}
            String withb=ans.charAt(i-2)+""+ans.charAt(i-1)+"b";
            if(isNotPalin(withb)){ans.append("b");continue;}
            ans.append("c");
        }
        System.out.println(ans);
    }
    public static int gcd(int a,int b){
        if(a==1||b==1)return 1;
        if(a%b==0)return b;
        return gcd(b,a%b);
    }
    public static int[] intArrayUtil(){
        MyScanner sc=new MyScanner();
        int n=sc.nextInt();
        int arr[]=new int[n];
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