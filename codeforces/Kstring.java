import java.util.*;
import java.io.*;
import java.math.*;
public class Kstring{
    public static void main(String[] args) {
        MyScanner sc=new MyScanner();
        int k=sc.nextInt();
        String s=sc.next();
        int c[]=new int[26];
        for(int i=0;i<s.length();i++)
          c[s.charAt(i)-'a']++;
        
        StringBuilder token=new StringBuilder();
        for(int i=0;i<26;i++){
            if(c[i]==0) continue;
            if(c[i]%k!=0){System.out.println(-1);System.exit(0);}
            int t=c[i]/k;
            char add=(char)(97+i);
            for(int j=0;j<t;j++)token.append(add);
        }
        for(int i=0;i<k;i++)
        System.out.print(token);
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