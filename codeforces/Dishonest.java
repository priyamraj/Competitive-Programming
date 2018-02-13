import java.util.*;
import java.io.*;
import java.math.*;
public class Dishonest{
    private static class Tri implements Comparable<Tri>{
        int after,now,profit;
        public Tri(int after,int now,int profit){
            this.after=after;
            this.now=now;
            this.profit=profit;
        }
        public int compareTo(Tri T){
            return T.profit-this.profit;
        }
    }
    public static void main(String[] args) {
        MyScanner sc=new MyScanner();
        int n=sc.nextInt();
        int k=sc.nextInt();
        int t[]=new int[n];
        Tri arr[]=new Tri[n];
        for(int i=0;i<n;i++) t[i]=sc.nextInt(); // right now
        for(int i=0;i<n;i++){
            int v=sc.nextInt(); // after discount
            int p=v-t[i];
            arr[i]=new Tri(v,t[i],p);
        }
        Arrays.sort(arr);
        HashSet<Integer> mark=new HashSet<>();
        long ans=0;
        int temp=0;
        for(int i=0;i<n;i++){
            if(arr[i].profit<0 && temp>=k) break;
            ans+=arr[i].now;
            mark.add(i);
            temp++;
        }
        for(int i=0;i<n;i++){
            if(!mark.contains(i))
                ans+=arr[i].after;
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