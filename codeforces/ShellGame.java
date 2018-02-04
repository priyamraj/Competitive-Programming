import java.util.*;
import java.io.*;
import java.math.*;
public class ShellGame{
    public static void main(String[] args) {
        MyScanner sc=new MyScanner();
        int n=sc.nextInt();
        n%=6;
        int arr[]=new int[3];
        int b=sc.nextInt();
        arr[b]=1;
        while(n>0){
          if(n%2==1){
            int t=arr[0];
            arr[0]=arr[1];
            arr[1]=t;
          }
          else{
            int t=arr[1];
            arr[1]=arr[2];
            arr[2]=t;
          }
          // for(Integer x:arr)
          //   System.out.print(x+" ");
          // System.out.println(n);
          n--;
        }
        for(int i=0;i<3;i++)
          if(arr[i]==1)
            System.out.println(i);
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