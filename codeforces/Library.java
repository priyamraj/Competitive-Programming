import java.util.*;
import java.io.*;
import java.math.*;
public class Library{
    public static void main(String[] args) {
        MyScanner sc=new MyScanner();
        int t=sc.nextInt();
        HashSet<Integer> hs=new HashSet<>();
        int max=0;
        while(t-->0){
          char ch=(sc.next()).charAt(0);
          int sign = (ch=='+')?1:-1;
          int num=sc.nextInt();
          num*=sign;
          if(num<0 && !hs.contains(-1*num)) max++;
          else if(num<0 && hs.contains(-1*num)) hs.remove(-1*num);
          else if(num>0) hs.add(num);
          max=Math.max(max,hs.size());
        }   
        System.out.println(max);
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