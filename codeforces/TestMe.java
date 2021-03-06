import java.util.*;
import java.io.*;
import java.math.*;
public class TestMe{
    static int n,m,ans=0;
    static ArrayList<Integer> vals=new ArrayList<>();
    static HashMap<Integer,HashSet<Integer>> hs=new HashMap<>();
    static HashSet<Integer> unmarked=new HashSet<>();
    
    public static void bfs(int v){
      if(!unmarked.contains(v)) return;
      ArrayDeque<Integer> q=new ArrayDeque<>();
      q.addLast(v);

      while(!q.isEmpty()){
        int f=q.pollFirst();
        if(!unmarked.contains(f)){
          continue;
        }
        unmarked.remove(f);
        ans++;
        ArrayList<Integer> temp=new ArrayList<>();
        Iterator<Integer> it=unmarked.iterator();
        while(it.hasNext()){
          int k=it.next();
          if(!(hs.get(f).contains(k)))
            {q.addLast(k);temp.add(k);}
        }//iterator
      for(Integer x:temp)
        unmarked.remove(x);
      }


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
          bfs(i);
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