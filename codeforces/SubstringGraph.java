import java.util.*;
import java.io.*;
import java.math.*;
public class SubstringGraph{
    static HashMap<Integer, ArrayList<Integer>> adj=new HashMap<>();
    static ArrayList<Integer> topo=new ArrayList<>();
    static int dp[][];
    static int mark[];
    public static boolean cycle(int v){
        if(mark[v]==2) return false;
        if(mark[v]==1) return true;
        mark[v]=1;
        for(int i=0;i<adj.get(v).size();i++){
            if(cycle(adj.get(v).get(i)))
                return true;
        }
        mark[v]=2;
        topo.add(v);
        return false;
    }
    public static void main(String[] args) {
        MyScanner sc=new MyScanner();
        int n=sc.nextInt();
        int m=sc.nextInt();
        String s=sc.next();
        s="%"+s;
        mark=new int[n+7];
        for(int i=1;i<=n;i++) adj.put(i,new ArrayList<Integer>());
        for(int i=0;i<m;i++){
            int v1=sc.nextInt();
            int v2=sc.nextInt();
            adj.get(v1).add(v2);
        }
        //cycle detection
        for(int i=1;i<=n;i++){
            if(cycle(i)){System.out.println(-1);System.exit(0);}
        }
        //topo check
        // for(Integer x:topo)
        //     System.out.println("topo:"+x);

        int answer=0;
        dp=new int[26][n+7];
        for(int i='a';i<='z';i++){
            for(int j=0;j<topo.size();j++){
                int v=topo.get(j);
                int val=0;
                if(s.charAt(v)==(char)i)
                    val=1;
                dp[i-'a'][v]=val;
                for(int k=0;k<adj.get(v).size();k++){
                    int neigh=adj.get(v).get(k);
                    dp[i-'a'][v]=Math.max(dp[i-'a'][v],dp[i-'a'][neigh]+val);
                } // end of k
                answer=Math.max(answer,dp[i-'a'][v]);
            }
        }
        System.out.println(answer);
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