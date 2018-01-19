import java.util.*;
import java.io.*;
import java.math.*;
public class QAQ{
    public static void main(String[] args) {
        MyScanner sc=new MyScanner();
        char arr[]=(sc.next()).toCharArray();
        int c=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]=='Q')
                for(int j=i+1;j<arr.length;j++){
                    if(arr[j]=='A')
                        for(int k=j+1;k<arr.length;k++)
                            if(arr[k]=='Q')
                                c++;
                }
        }
        System.out.println(c);
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