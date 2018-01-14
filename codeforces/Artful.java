import java.util.*;
import java.io.*;
import java.math.*;
public class Artful{
    public static void main(String[] args) {
        MyScanner sc=new MyScanner();
       int n=sc.nextInt();
       int arr[]=new int[2*n];
       for(int i=0;i<n;i++)arr[i]=sc.nextInt();
       for(int i=n;i<2*n;i++)arr[i]=sc.nextInt();
       HashSet<Integer> hs=new HashSet<>();
       for(Integer x:arr)hs.add(x);
       int pairs=0;
       for(int i=0;i<2*n;i++){
           for(int j=0;j<2*n;j++){
               if(hs.contains(arr[i]^arr[j])) pairs++;
           }
       }
       if(pairs%2==0)System.out.println("Karen");
       else System.out.println("Koyomi");
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