import java.util.*;
import java.io.*;
import java.math.*;
public class Cards{
    public static void main(String[] args) {
        MyScanner sc=new MyScanner();
        int zeroes=sc.nextInt();
        int ones=sc.nextInt();
        if(zeroes==ones){
            while(ones-->0)
                {System.out.print("10");}
            System.exit(0);
        }
        int z=zeroes,on=ones;
        boolean f=true;
        StringBuilder str=new StringBuilder();
        while(ones>0){
            if(ones>=2){str.append("11");ones-=2;}
            else{str.append("1");ones-=1;}
            if(zeroes>0){str.append("0");zeroes-=1;}
            else{
                if(ones>0){f=false;}
            }
            if(zeroes==ones){
                while(zeroes-->0) {str.append("10");ones--;}
            }
        }
        // System.out.println(ones+" "+zeroes);
        if(ones>0||zeroes>0 || !f) f=false;
        boolean f1=true;
        StringBuilder str1=new StringBuilder();
        while(z>0){
            str1.append("0");
            z--;
            if(on>=2){str1.append("11");on-=2;}
            else if(on==1){str1.append("1");on--;}
            else{
                if(z>0){f1=false;}
            }
            if(z==on){
                while(on-->0) {str1.append("01");z--;}
            }
        }
        // System.out.println(on+" "+z);
        if(z>0 || on>0 || !f1) f1=false;
        if(f) System.out.println(str);
        else if(f1){System.out.println(str1);}
        else System.out.println(-1);

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