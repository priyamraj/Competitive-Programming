import java.util.*;
import java.io.*;
import java.math.*;
public class HanSolo{
    static int xyplus=0;
    static int xaxis=0;
    static int yaxis=0;
    static int xyminus=0;

    public static void main(String[] args) {
        MyScanner sc=new MyScanner();
        int n=sc.nextInt();
        int x0=sc.nextInt();
        int y0=sc.nextInt();
        int arr[][]=new int[n][2];
        int dead[]=new int[n];// 1 means dead
        for(int i=0;i<n;i++){
            arr[i][0]=sc.nextInt(); // x coordinate
            arr[i][1]=sc.nextInt();// y coordinate
        }
        int ans=0;
        for(int i=0;i<n;i++){
            if(dead[i]!=0) continue;
            ans++;
            dead[i]++;
            for(int j=i+1;j<n;j++){
                int x1=arr[i][0],y1=arr[i][1];
                int x2=arr[j][0],y2=arr[j][1];
                if((y2-y1)*(x1-x0)==(x2-x1)*(y1-y0))
                dead[j]++;
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