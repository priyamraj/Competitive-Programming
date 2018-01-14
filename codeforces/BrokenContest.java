import java.util.*;
import java.io.*;
import java.math.*;
public class BrokenContest{
    public static int matcher(String s,String p){
        int lp=p.length();
        int ls=s.length();
        int ans=0;
        for(int i=0;i<ls-lp+1;i++){
            String t=s.substring(i,i+lp);
            if(t.equals(p)) ans++;
        }
        return ans;
    }
    public static void main(String[] args) {
        MyScanner sc=new MyScanner();
        String arr[]={"Danil", "Olya", "Slava", "Ann","Nikita"};
        String inp=sc.next();
        int c=0;
        for(String x:arr){
           c+=matcher(inp,x);
        }
        if(c==1) System.out.println("YES");
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