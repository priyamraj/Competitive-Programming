import java.util.*;
import java.io.*;
import java.math.*;
public class Pie{
    static int keys[]=new int[26];
    public static void main(String[] args) {
        MyScanner sc=new MyScanner();
        int n=sc.nextInt();
        String s=sc.next();
        int need=0;
        for(int i=0;i<s.length();i++){
            char k=s.charAt(i);
            keys[k-'a']++;
            char d=s.charAt(i+1);
            char ds=Character.toLowerCase(d);
            if(keys[ds-'a']>0)keys[ds-'a']--;
            else need++;
            i++;
        }
        System.out.println(need);
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