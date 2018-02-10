import java.util.*;
import java.io.*;
import java.math.*;
public class LittleGame{
    public static void main(String[] args) {
        MyScanner sc=new MyScanner();
        String s=sc.next();
        int c[]=new int[26];
        for(int i=0;i<s.length();i++){
          char ch=s.charAt(i);
          c[ch-'a']++;
        }
        int ans=0;
        for(Integer x:c){
          if(x%2==1) ans++;
        }
        if(ans==0 || ans%2 == 1) System.out.println("First");
        else System.out.println("Second");
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