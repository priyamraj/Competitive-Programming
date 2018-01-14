import java.util.*;
import java.io.*;
import java.math.*;
public class Circular{
    public static void main(String[] args) {
        MyScanner sc=new MyScanner();
        String s=sc.next();
        HashSet<String> hs=new HashSet<>();
        hs.add(s);
        String t=s;
        do{
            t=t.charAt(t.length()-1)+t.substring(0,t.length()-1);
            hs.add(t);
        } while(!t.equals(s));
        System.out.println(hs.size()); 
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