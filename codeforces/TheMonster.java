import java.util.*;
import java.io.*;
import java.math.*;
public class TheMonster{
    public static void main(String[] args) {
        MyScanner sc=new MyScanner();
        String s=sc.next();
        int ans=0;
        for(int i=0;i<s.length();i++){
          int have=0,stop=0;
          for(int j=i;j<s.length();j++){
            char ch=s.charAt(j);
            if(ch=='('){have++;stop++;}
            else if(ch==')'){have--;stop--;}
            else if(ch=='?'){have--;stop++;}
            if(stop<0) break;
            have=Math.max(0,have);
            if(have==0 && (j-i+1)%2==0)
              ans++;
          }// end of j
        }// end of i
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