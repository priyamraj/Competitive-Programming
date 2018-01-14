import java.util.*;
import java.io.*;
import java.math.*;
public class Tanks{
    public static void main(String[] args) {
        MyScanner sc=new MyScanner();
        int n=sc.nextInt();
        ArrayList<Integer> odds=new ArrayList<>();
        ArrayList<Integer> evens=new ArrayList<>();
        for(int i=1;i<=n;i++){
            if(i%2==1) odds.add(i);
            else evens.add(i);
        }
        System.out.println(2*evens.size()+odds.size());
        for(Integer x:evens) System.out.print(x+" ");
        for(Integer x:odds) System.out.print(x+" ");
        for(Integer x:evens) System.out.print(x+" ");
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