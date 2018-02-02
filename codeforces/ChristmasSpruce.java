import java.util.*;
import java.io.*;
import java.math.*;
public class ChristmasSpruce{
    public static void main(String[] args) {
        MyScanner sc=new MyScanner();
        int n=sc.nextInt();
        HashMap<Integer, ArrayList<Integer>> adj=new HashMap<>();
        for(int i=1;i<=n;i++)
          adj.put(i,new ArrayList<Integer>());
        for(int i=2;i<=n;i++){
          int p=sc.nextInt();
          adj.get(p).add(i);
        }
        HashSet<Integer> leaf=new HashSet<>();
        ArrayList<Integer> nonleaf=new ArrayList<>();
        for(int i=1;i<=n;i++){
          if(adj.get(i).size()==0)
            leaf.add(i);
        }
        for(int i=1;i<=n;i++)
          if(!leaf.contains(i))
            nonleaf.add(i);
        boolean s=true;
        for(Integer x: nonleaf){
          int c=0;
          ArrayList<Integer> children=adj.get(x);
          for(Integer ch :children)
            if(leaf.contains(ch))
              c++;
          if(c<3){s=false;break;}
        } // end of x loop
        if(s) System.out.println("Yes");
        else System.out.println("No");
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