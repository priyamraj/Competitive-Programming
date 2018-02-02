import java.util.*;
import java.io.*;
import java.math.*;
public class Tea{
    private static class pair{
      int f,s,tm,in;
      public pair(int f,int s,int tm,int in){
        this.f=f;
        this.s=s;
        this.tm=tm;
        this.in=in;
      }
    }
    public static void main(String[] args) {
        MyScanner sc=new MyScanner();
        int tc=sc.nextInt();
        while(tc-->0){
          int n=sc.nextInt();
          HashMap<Integer,Integer> ans=new HashMap<>();
          ArrayDeque<pair> q=new ArrayDeque<>();
          for(int i=0;i<n;i++){q.addLast(new pair(sc.nextInt(),sc.nextInt(),0,i));}
          int time=1;
          while(!q.isEmpty()){
            if(q.peekFirst().f > time){time++;continue;}
            pair p=q.removeFirst();
            if(p.s < time){ans.put(p.in,0);continue;}
            else{ans.put(p.in,time);}
            time++;
          }
          System.out.println("ANS");
          for(int i=0;i<n;i++)
            System.out.print(ans.get(i)+" ");
          System.out.println();
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