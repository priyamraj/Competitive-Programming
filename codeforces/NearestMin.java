import java.util.*;
import java.io.*;
import java.math.*;
public class NearestMin{
    public static void main(String[] args) {
        MyScanner sc=new MyScanner();
        int n=sc.nextInt();
        int m=Integer.MAX_VALUE;
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
          arr[i]=sc.nextInt();
          m=Math.min(m,arr[i]);
        }
        ArrayList<Integer> pos=new ArrayList<>();
        for(int i=0;i<n;i++){
          if(arr[i]==m)
            pos.add(i);
        }
        int ans=Integer.MAX_VALUE;
        for(int i=1;i<pos.size();i++){
          ans=Math.min(ans,pos.get(i)-pos.get(i-1));
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