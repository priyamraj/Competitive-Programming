import java.util.*;
import java.io.*;
import java.math.*;
public class HungrySequence{
    static int max=10000007;
    public static void main(String[] args) {
        MyScanner sc=new MyScanner();
        int n=sc.nextInt();
        ArrayList<Integer> arr=new ArrayList<>();
        int s[]=new int[max];
        for(int i=2;i*i<=max;i++){
            if(s[i]==0){
                arr.add(i);
                for(int j=i*2;j*j<=max;j+=i)
                    s[j]=1;
            }
        }//end of i
        for(int i=0;i<n;i++)
            System.out.print(arr.get(i)+" ");
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