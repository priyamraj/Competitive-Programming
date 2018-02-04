import java.util.*;
import java.io.*;
import java.math.*;
public class Connected{
    static int n,m,ans=0;
    static ArrayList<Integer> vals=new ArrayList<>();
    static HashMap<Integer,HashSet<Integer>> hs=new HashMap<>();
    static HashSet<Integer> unmarked=new HashSet<>();
    public static void dfs(int v){
      if(!unmarked.contains(v)) return;
      unmarked.remove(v);
      ans++;

      Object arr[]=unmarked.toArray();
      for(Object x:arr){
        int el=(Integer) x;
        if(!(hs.get(v).contains(el)))
          dfs(el);
      }
      // Iterator<Integer> it=unmarked.iterator();
      // while(it.hasNext()){
      //   int el=it.next();
      //   if(!(hs.get(v).contains(el)))
      //     dfs(el);
      // }
    }

    public static void main(String[] args) {
        MyScanner sc=new MyScanner();
        n=sc.nextInt();
        m=sc.nextInt();
        for(int i=1;i<=n;i++){
          hs.put(i,new HashSet<Integer>());
          unmarked.add(i);
        }
        for(int i=0;i<m;i++){
          int v1=sc.nextInt();
          int v2=sc.nextInt();
          hs.get(v1).add(v2);
          hs.get(v2).add(v1);
        }
        int cons=0;
        for(int i=1;i<=n;i++){
          if(!unmarked.contains(i)) continue;
          dfs(i);
          cons++;
          vals.add(ans);
          ans=0;
        }
        System.out.println(cons);
        vals.sort(null);
        for(Integer x:vals)
          System.out.print(x+" ");
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