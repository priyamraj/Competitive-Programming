import java.util.*;
import java.io.*;
import java.math.*;
public class Unimodal{
    public static void main(String[] args) {
        MyScanner sc=new MyScanner();
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++) arr[i]=sc.nextInt();
        int p1=0,p2=n-1;
        for(int i=0;i<n-1;i++){
            if(arr[i]>=arr[i+1]) break;
            p1++;
        }
        for(int i=n-1;i>0;i--){
            if(arr[i]>=arr[i-1]) break;
            p2--;
        }
        // System.out.println(p1+" "+p2);
        // int k=0;
        HashSet<Integer> hs=new HashSet<>();
        for(int i=p1;i<=p2;i++) hs.add(arr[i]);
        if(hs.size()!=1) System.out.println("NO");
        else System.out.println("YES");
            
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