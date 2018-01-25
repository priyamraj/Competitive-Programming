import java.util.*;
import java.io.*;
import java.math.*;
public class EvilMex{
    public static void main(String[] args) {
        MyScanner sc=new MyScanner();
        int n=sc.nextInt();
        int k=sc.nextInt();
        int ops=0;
        HashSet<Integer> hs=new HashSet<>();
        while(n-->0){
            hs.add(sc.nextInt());
        }
        for(int i=0;i<=100;i++){
            if(k==i && hs.contains(i)) {ops++;break;}
            else if(k==i && !hs.contains(i)) {break;}
            else if(k>i && !hs.contains(i)){ops++;}
        }
        System.out.println(ops);
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