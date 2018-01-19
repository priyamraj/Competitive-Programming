import java.util.*;
import java.io.*;
import java.math.*;
public class Replace{
    public static void main(String[] args) {
        MyScanner sc=new MyScanner();
        int n=sc.nextInt();
        int m=sc.nextInt();
        char ch[]=(sc.next()).toCharArray();
        while(m-->0){
            int l1=sc.nextInt()-1;
            int l2=sc.nextInt()-1;
            char c1=(sc.next()).charAt(0);
            char c2=(sc.next()).charAt(0);
            for(int i=l1;i<=l2;i++)
                if(ch[i]==c1)
                    ch[i]=c2;
        }
        for(Character c:ch)
            System.out.print(c);
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