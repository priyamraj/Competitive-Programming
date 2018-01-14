import java.util.*;
import java.io.*;
import java.math.*;
public class Ktree{
    static final int mod=1000000007 ;
    public static void main(String[] args) {
        MyScanner sc=new MyScanner();
        int n=sc.nextInt();
        int k=sc.nextInt();
        int d=sc.nextInt();
        int arr[][]=new int[n+1][2];
        arr[0][0]=1;// #paths of length 0 without having any edge wt >=d
        arr[0][1]=0;// #paths of length 0 having any edge wt >=d 
        for(int i=1;i<=n;i++){
            for(int j=1;j<=k;j++){
                if(i-j < 0) break;  //exceeds path length
                if(j<d){
                    //no path of wt atleast d, can only rely on previous atleast d paths
                    arr[i][0]=(arr[i][0]%mod + arr[i-j][0]%mod)%mod;
                    arr[i][1]=(arr[i][1]%mod + arr[i-j][1]%mod)%mod;
                }
                else{
                    //have atleast one path of  wt atleast d, thus can use all paths
                    arr[i][1]=(arr[i][1]%mod + arr[i-j][0]%mod)%mod;
                    arr[i][1]=(arr[i][1]%mod + arr[i-j][1]%mod)%mod;
                }
            }
        }
        System.out.println(arr[n][1]);
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