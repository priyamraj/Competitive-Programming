import java.util.*;
import java.io.*;
import java.math.*;
public class IceSkating{
    private static class P{
        int a,b;
        public P(int a,int b){
            this.a=a;
            this.b=b;
        }
    }
    public static void dfs(int at,P arr[],boolean mark[]){
        if(mark[at]) return;
        mark[at]=true;
        for(int i=0;i<arr.length;i++){
            if(arr[at].a==arr[i].a||arr[at].b==arr[i].b)
                dfs(i,arr,mark);
        }
    }
    public static void main(String[] args) {
        MyScanner sc=new MyScanner();
        int n=sc.nextInt();
        P arr[]=new P[n];
        for(int i=0;i<n;i++){
            int v1=sc.nextInt();
            int v2=sc.nextInt();
            arr[i]=new P(v1,v2);
        }
        int ans=-1;
        boolean mark[]=new boolean[n];
        for(int i=0;i<n;i++){
            if(!mark[i]){
                ans++;
                dfs(i,arr,mark);
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