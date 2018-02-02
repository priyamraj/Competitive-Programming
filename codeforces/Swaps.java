import java.util.*;
import java.io.*;
import java.math.*;
public class Swaps{
    public static void main(String[] args) {
        MyScanner sc=new MyScanner();
        int n=sc.nextInt();
        int arr[]=new int[n+1];
        for(int i=1;i<=n;i++)
          arr[i]=sc.nextInt();
        String s=sc.next();
        s="%"+s;
        int m[]=new int[n+1];
        if(s.charAt(0)=='1') m[1]=1;
        else m[1]=0;
        for(int i=1;i<n;i++){
          if(s.charAt(i)=='1') m[i]=m[i-1]+1;
          else m[i]=m[i-1];
        }
        m[n]=m[n-1];
        boolean b=true;
        for(int i=1;i<=n;i++){
          int drift=arr[i]-i;
          if(drift==0) continue;
          if(drift>0){
            int v=0;
            v=m[arr[i]]-m[i-1];
            // System.out.println(i+" "+v);
            if(v>=drift) continue;
            else {b=false;break;}
          }
          else if(drift<0){
            drift*=-1;
            int v=0;
            v=m[i]-m[arr[i]-1];
            if(i!=n && s.charAt(i)=='1')
              v-=1;
            if(v>=drift) continue;
            else {b=false;break;}
          }
        }//end of i for
        if(!b) System.out.println("NO");
        else System.out.println("YES");
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