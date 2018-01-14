import java.util.*;
import java.io.*;
import java.math.*;
public class RemoveZeros{
    public static int remove(int a){
        String s=Integer.toString(a);
        StringBuilder str=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!='0') str.append(s.charAt(i));
        }
        return Integer.parseInt(str.toString());
    }
    public static void main(String[] args) {
        MyScanner sc=new MyScanner();
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=a+b;
        int a0=remove(a);
        int b0=remove(b);
        if(a0+b0 == remove(c))System.out.println("YES");
        else System.out.println("NO");
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