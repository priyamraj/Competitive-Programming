import java.util.*;
import java.io.*;
import java.math.*;
public class Arrangement{
    public static int count(char arr[][]){
        int ans=0;
        for(int i=0;i<arr.length;i++)
            for(int j=0;j<arr[0].length;j++)
                if(arr[i][j]=='.')
                     ans++;
        return ans;
    }
    public static int rowSeats(char arr[],int k){
        int maxendinghere=0;
        int ans=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]=='.') maxendinghere++;
            else{
                if(maxendinghere>=k){ans+=maxendinghere-k+1;}
                maxendinghere=0;
            }
        }
        if(maxendinghere!=0 && maxendinghere>=k)
            ans+=maxendinghere-k+1;
        return ans;
    }
    public static void main(String[] args) {
        MyScanner sc=new MyScanner();
        int n=sc.nextInt();
        int m=sc.nextInt();
        int k=sc.nextInt();
        char arr[][]=new char[n][m];
        for(int i=0;i<n;i++)
            arr[i]=(sc.next()).toCharArray();
        //special case
        if(k==1){
            System.out.println(count(arr));
            System.exit(0);
        }
        long ans=0;
        for(int i=0;i<n;i++)
            ans+=rowSeats(arr[i],k);
        char t[]=new char[n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++) t[j]=arr[j][i];
            ans+=rowSeats(t,k);
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