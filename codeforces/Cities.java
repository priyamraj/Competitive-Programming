import java.util.*;
import java.io.*;
import java.math.*;
public class Cities{
    static HashSet<Integer> done=new HashSet<>();
    static HashMap<Integer,ArrayList<Integer>> adj=new HashMap<>(); 
    static long c;
    public static void reset(int n){
        done.clear();
        adj.clear();
        c=0;
        for(int i=1;i<=n;i++)
            adj.put(i,new ArrayList<Integer>());
    }
    public static void dfs(int x){
        c++;
        done.add(x);
        for(int i=0;i<adj.get(x).size();i++)
            if(!done.contains(adj.get(x).get(i)))
                dfs(adj.get(x).get(i));
    }
    public static void main(String[] args) {
        MyScanner sc=new MyScanner();
        int tc=sc.nextInt();
        while(tc-->0){
            int n=sc.nextInt();
            reset(n);
            int m=sc.nextInt();
            int clib=sc.nextInt();
            int croad=sc.nextInt();
            for(int i=1;i<=m;i++){
                int u=sc.nextInt();
                int v=sc.nextInt();
                adj.get(u).add(v);
                adj.get(v).add(u);
            }
            long ans=0;
            for(int i=1;i<=n;i++){
                if(!done.contains(i)){
                    c=0;
                    dfs(i);
                    ans+=Math.min(clib+(c-1)*croad,c*clib);
                }
            }
            System.out.println(ans);
        }//end of tc
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