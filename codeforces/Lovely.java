import java.util.*;
import java.io.*;
import java.math.*;
public class Lovely{
    public static void main(String[] args) {
        MyScanner sc=new MyScanner();
        long n=sc.nextLong();
        ArrayList<Long> arr=new ArrayList<>();
        for(long i=2;i*i<=n && n>0;i++){
            if(n%i==0){
                arr.add(i);
                while(n%i==0) n/=i;                
            }
        }
        if(n!=0) arr.add(n);
        long f=1;
        for(Long x:arr) f*=x;
        System.out.println(f);
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