import java.util.*;
import java.io.*;
import java.math.*;
public class Rounding{
    public static void main(String[] args) {
        MyScanner sc=new MyScanner();
        long n=sc.nextLong();
        long k=sc.nextLong();
        int cnt=0,ans=0;
        boolean b=false;
        long m=n;
        while(m>0){
            int d=(int)m%10;
            if(d==0) cnt++;
            if(cnt==k){b=true;break;}
            if(d!=0) ans++;
            m/=10;
        }
        if(b) System.out.println(ans);
        else System.out.println((Long.toString(n)).length()-1);
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