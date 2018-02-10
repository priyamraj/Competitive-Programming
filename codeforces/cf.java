import java.util.*;
import java.io.*;
import java.math.*;
public class cf{
    public static void main(String[] args) {
        MyScanner sc=new MyScanner();
        int x=sc.nextInt();
        int y=sc.nextInt();
        int steps=y-1;
        if(y==0 && x0=0){System.out.println("Yes");System.exit(0);}
        if(y==1 && x!=0){System.out.println("No");System.exit(0);}
        if(x==steps) System.out.println("Yes");
        else if(steps>x) System.out.println("No");
        else if((steps%2==0 && x%2==0) || (steps%2==1 && x%2==1)) System.out.println("Yes");
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
