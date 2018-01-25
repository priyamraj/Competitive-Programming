import java.util.*;
import java.io.*;
import java.math.*;
public class Div64{
    public static void main(String[] args) {
        MyScanner sc=new MyScanner();
        String s=sc.next();
        Stack<Integer> st=new Stack<>();
        st.push(0);st.push(0);st.push(0);st.push(0);st.push(0);st.push(0);
        st.push(1);
        for(int i=0;i<s.length();i++){
            int j=s.charAt(i)-'0';
            if(!st.isEmpty() && j==st.peek()) st.pop();
        }
        if(st.isEmpty()) System.out.println("yes");
        else System.out.println("no");
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