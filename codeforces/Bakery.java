import java.util.*;
import java.io.*;
import java.math.*;
public class Bakery{
    public static void main(String[] args) {
        MyScanner sc=new MyScanner();
        int n=sc.nextInt();
        int m=sc.nextInt();
        int k=sc.nextInt();
        int graph[][]=new int[m][3];//u v l
        for(int i=0;i<m;i++){
            graph[i][0]=sc.nextInt();
            graph[i][1]=sc.nextInt();
            graph[i][2]=sc.nextInt();
        }
        if(k==0){System.out.println(-1);System.exit(0);}
        int ans=Integer.MAX_VALUE;
        HashSet<Integer> store=new HashSet<>();
        for(int i=0;i<k;i++) store.add(sc.nextInt());
        for(int i=0;i<m;i++){
            if(store.contains(graph[i][1]) && !store.contains(graph[i][0]))
            ans=Math.min(ans,graph[i][2]);
            else if(store.contains(graph[i][0]) && !store.contains(graph[i][1]))
            ans=Math.min(ans,graph[i][2]);
        }
        if(ans==Integer.MAX_VALUE)System.out.println(-1);
        else System.out.println(ans);
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