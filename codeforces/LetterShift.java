import java.util.*;
import java.io.*;
import java.math.*;
public class LetterShift{
    public static void main(String[] args) {
        MyScanner sc=new MyScanner();
        char arr[]=(sc.next()).toCharArray();
        int L=arr.length;
        int i=0;
        StringBuilder str=new StringBuilder();
        boolean b=false;
        while(i<L){
            if(arr[i]=='a'){i++;str.append('a');continue;}
            if(b){str.append(arr[i]);i++;continue;}
            while(i<L && arr[i]!='a'){
                char prev=(char)(arr[i]-1);
                str.append(prev);
                i++;
                b=true;
            } // end of inner while
        } // end of outer while
        if(b) System.out.println(str);
        else{
            String s=str.substring(0,str.length()-1)+"z";
            System.out.println(s);
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