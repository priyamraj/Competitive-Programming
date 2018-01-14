import java.util.*;
import java.io.*;
import java.math.*;
public class Cardgame{
    static int fact[]={1,1,2,6,24,120,720,5040,40320,362880,3628800,39916800};
    public static void main(String[] args) {
        MyScanner sc=new MyScanner();
        int n=sc.nextInt();
        int limit=fact[n+1]; // max limit is around 200 by the way
        ArrayDeque<Integer> p1=new ArrayDeque<>();
        ArrayDeque<Integer> p2=new ArrayDeque<>();
        int x1=sc.nextInt();
        for(int i=0;i<x1;i++) p1.addLast(sc.nextInt());
        int x2=sc.nextInt();
        for(int i=0;i<x2;i++) p2.addLast(sc.nextInt());
        int k=0,fights=0;
        while(p1.size()!=0 && p2.size()!=0 && k<limit){
          int p1card=p1.removeFirst();
          int p2card=p2.removeFirst();
          if(p1card>p2card){
            p1.addLast(p2card);
            p1.addLast(p1card);
            fights++;
          }
          else{
            p2.addLast(p1card);
            p2.addLast(p2card);
            fights++;
          }
          k++;
        }//end of while
        if(k>=limit) System.out.println("-1");
        else if(p1.size()==0) System.out.println(fights+" "+2);
        else System.out.println(fights+" "+1);
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