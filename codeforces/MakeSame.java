import java.util.*;
import java.io.*;
import java.math.*;
public class MakeSame{
    public static void main(String[] args) {
        MyScanner sc=new MyScanner();
        int n=sc.nextInt();
        int arr[]=new int[n];
        HashSet<Integer> hs=new HashSet<>();
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            hs.add(arr[i]);
        }
        if(hs.size()>3) System.out.print("NO");
        else{
            if(hs.size()<=2) {System.out.print("YES");System.exit(0);}
            Object[] t=hs.toArray();
            Arrays.sort(t);
            int tt[]=new int[3];
            for(int i=0;i<3;i++) tt[i]=Integer.parseInt(t[i].toString());
            int v1=tt[1]-tt[0];
            int v2=tt[2]-tt[1];
            if(v1==v2) System.out.print("YES");
            else System.out.print("NO");
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