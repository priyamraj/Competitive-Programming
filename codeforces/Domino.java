import java.util.*;
import java.io.*;
import java.math.*;
public class Domino{
    public static void main(String[] args) {
        MyScanner sc=new MyScanner();
        int n=sc.nextInt();
        int st=0,sb=0;
        int tops[]=new int[n];
        int bottoms[]=new int[n];
        for(int i=0;i<n;i++){
            tops[i]=sc.nextInt();
            st+=tops[i];
            bottoms[i]=sc.nextInt();
            sb+=bottoms[i];
        }
        if((st&1)==0 && (sb&1)==0){System.out.println("0");System.exit(0);}
        if((st&1)==1 && (sb&1)==0){System.out.println("-1");System.exit(0);}
        if((st&1)==0 && (sb&1)==1){System.out.println("-1");System.exit(0);}
        boolean b=false;
        for(int i=0;i<n;i++){
            if((tops[i]&1)==0 && (bottoms[i]&1)==1){b=true;break;}
            if((tops[i]&1)==1 && (bottoms[i]&1)==0){b=true;break;}            
        }
        if(b) System.out.print("1");
        else System.out.print("-1");
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