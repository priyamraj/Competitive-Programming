import java.util.*;
import java.io.*;
import java.math.*;
public class Mex{
    public static void main(String[] args) {
        MyScanner sc=new MyScanner();
        int tc=sc.nextInt();
        while(tc-->0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            int arr[]=new int[n];
            HashSet<Integer> hs=new HashSet<>();
            for(int i=0;i<n;i++){
                hs.add(sc.nextInt());
            }
            int ans=-1;
            for(int i=0;;i++){
                if(hs.contains(i)) continue;
                else if(!hs.contains(i) && k>0){k--;}
                else{ans=i;break;}
            }
            System.out.println(ans);
        }
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