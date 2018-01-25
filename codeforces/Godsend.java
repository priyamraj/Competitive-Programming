import java.util.*;
import java.io.*;
import java.math.*;
public class Godsend{
    public static void main(String[] args) {
        MyScanner sc=new MyScanner();
        int n=sc.nextInt();
        int odds=0,evens=0;
        long s=0;
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            int v=sc.nextInt();
            if((v&1)==1) odds++;
            else evens++;
            arr[i]=v;
            s+=v;
        }
        if((s&1)==1){System.out.println("First");System.exit(0);}
        if(evens!=0 && odds==0){System.out.println("Second");System.exit(0);}
        if((s&1)==0 && odds!=0){System.out.println("First");System.exit(0);}
        else {System.out.println("Second");System.exit(0);}
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