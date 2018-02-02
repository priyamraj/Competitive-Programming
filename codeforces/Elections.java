import java.util.*;
import java.io.*;
import java.math.*;
public class Elections{
    public static void main(String[] args) {
        MyScanner sc=new MyScanner();
        int n=sc.nextInt();
        ArrayList<Integer> arr=new ArrayList<>();
        int g=sc.nextInt();
        int ans=0;
        for(int i=1;i<n;i++) arr.add(sc.nextInt());
        arr.sort(null);
        while(g<=arr.get(arr.size()-1)){
          ans++;
          g++;
          int v=arr.remove(arr.size()-1);
          arr.add(v-1);
          arr.sort(null);
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