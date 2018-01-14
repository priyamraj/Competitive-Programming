import java.util.*;
import java.io.*;
import java.math.*;
public class NikitaStrings{
    public static void main(String[] args) {
        MyScanner sc=new MyScanner();
        String s=" "+sc.next();
        int n=s.length()-1;
        int as[]=new int[s.length()];
        int bs[]=new int[s.length()];
        for(int i=1;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='a') {as[i]=as[i-1]+1;bs[i]=bs[i-1];}
            else if(ch=='b'){bs[i]=bs[i-1]+1;as[i]=as[i-1];}
        }
        int ans=Integer.MIN_VALUE;
        for(int i=1;i<=n;i++){
            for(int j=i;j<=n;j++){
                int val=as[i-1];
                val+=as[n]-as[j];
                val+=bs[j]-bs[i];
                if(s.charAt(i)=='b') val++;
                ans=Math.max(ans,val);
                //System.out.println(i+" "+j+" "+ans);
            }
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
close