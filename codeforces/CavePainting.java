import java.util.*;
import java.io.*;
import java.math.*;
public class CavePainting{
    public static void main(String[] args) {
        MyScanner sc=new MyScanner();
        // long p=1, lim=(long)Math.pow(10,18);
        // System.out.println(lim);
        // for(int i=1;;i++){
        //   p*=i;
        //   if(p>lim){System.out.println(i);break;}
        // }
        long n=sc.nextLong();
        long k=sc.nextLong();
        HashSet<Long> hs=new HashSet<>();
        for(long i=1;i<=k;i++){
          long v=n%k;
          if(hs.contains(v)){System.out.println("No");System.exit(0);}
          hs.add(v);
        }
        System.out.println("Yes");
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