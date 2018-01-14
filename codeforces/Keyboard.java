import java.util.*;
import java.io.*;
import java.math.*;
public class Keyboard{
    public static void main(String[] args) {
        MyScanner sc=new MyScanner();
        String s1=sc.next();
        String s2=sc.next();
        String s3=sc.next();
        HashMap<Character,Character> hs=new HashMap<>();
        for(int i=0;i<26;i++){
            char c1=s1.charAt(i),c2=s2.charAt(i);
            char c3=Character.toUpperCase(c1),c4=Character.toUpperCase(c2);
            hs.put(c1,c2);
            hs.put(c3,c4);
        }
        for(int i=0;i<s3.length();i++){
            char ch=s3.charAt(i);
            if(!hs.containsKey(ch)) System.out.print(ch);
            else System.out.print(hs.get(ch));
        }
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