import java.util.*;
import java.io.*;
import java.math.*;
public class Bus{
    public static void main(String[] args) {
        MyScanner sc=new MyScanner();
        int n=sc.nextInt();
        int m=sc.nextInt();
        int ans=1;
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        int curr=0;
        for(int i=0;i<n;i++){
            if(curr+arr[i]<=m){
                curr+=arr[i];
            }
            else{
                ans++;
                curr=arr[i];
            }
        }
        System.out.println(ans);
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