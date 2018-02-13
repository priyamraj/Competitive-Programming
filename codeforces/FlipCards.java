import java.util.*;
import java.io.*;
import java.math.*;
public class FlipCards{
    public static void main(String[] args) {
        MyScanner sc=new MyScanner();
        String s=sc.next();
        int ans=0;
        for(int i=0;i<s.length();i++){
           char ch=s.charAt(i);
           if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
            ans++;
           if(ch=='1'||ch=='3'||ch=='5'||ch=='7'||ch=='9')
            ans++;
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