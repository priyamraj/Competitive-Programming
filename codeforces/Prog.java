import java.util.*;
import java.io.*;
import java.math.*;
public class Prog{
    public static void main(String[] args) {
        MyScanner sc=new MyScanner();
        int n=sc.nextInt();
        HashMap<String,Integer> hs=new HashMap<>();
        while(n-->0){
            String s=sc.next();
            if(!hs.containsKey(s)){
                hs.put(s,0);
                System.out.println("OK");
            }
            else{
                hs.put(s,hs.get(s)+1);
                System.out.println(s+""+hs.get(s));
            }
        }//end of while
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