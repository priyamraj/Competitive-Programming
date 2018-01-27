import java.util.*;
import java.io.*;
import java.math.*;
public class Triangle{
    public static boolean isTri(int x,int y,int z){
        if(x+y>z && y+z>x && x+z>y)
            return true;
        return false;
    }
    public static boolean isSeg(int x,int y,int z){
        if(x+y==z || y+z==x || x+z==y)
            return true;
        return false;
    }
    public static void main(String[] args) {
        MyScanner sc=new MyScanner();
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int d=sc.nextInt();
        boolean seg=false,tri=false;
        if(isTri(a,b,c)) tri=true;
        if(isTri(a,b,d)) tri=true;
        if(isTri(d,b,c)) tri=true;
        if(isTri(a,d,c)) tri=true;
        if(isSeg(a,b,c)) seg=true;
        if(isSeg(a,b,d)) seg=true;
        if(isSeg(d,b,c)) seg=true;
        if(isSeg(a,d,c)) seg=true;
        if(tri) System.out.println("TRIANGLE");
        else if(seg) System.out.println("SEGMENT");
        else System.out.println("IMPOSSIBLE");
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