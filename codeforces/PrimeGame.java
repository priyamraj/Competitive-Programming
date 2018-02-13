import java.util.*;
import java.io.*;
import java.math.*;
public class PrimeGame{
    static int max=1007;
    public static boolean isPrime(int n){
        BigInteger b=new BigInteger(Integer.toString(n));
        return b.isProbablePrime(10);
    }
    public static void main(String[] args) {
        MyScanner sc=new MyScanner();
        ArrayList<Integer> p=new ArrayList<>();
        for(int i=2;i<=max;i++){
            if(isPrime(i))
                p.add(i);
        }
        ArrayList<Integer> ans=new ArrayList<>();
        int n=sc.nextInt();
        for(int i=0;i<p.size();i++){
            int prime=p.get(i);
            if(prime>n) break;
            int t=prime;
            while(t<=n){
                ans.add(t);
                t*=prime;
            }
        }
        System.out.println(ans.size());
        for(Integer x:ans)
            System.out.print(x+" ");
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