import java.util.*;
import java.io.*;
import java.math.*;
public class Face{
    public static void main(String[] args) {
        MyScanner sc=new MyScanner();
        int x=sc.nextInt();
        int y=sc.nextInt();
        char arr[][]=new char[x][y];
        for(int i=0;i<x;i++)
          arr[i]=(sc.next()).toCharArray();
        int faces=0;
        char ref[]={'a','c','e','f'};
        for(int i=0;i<x-1;i++){
            for(int j=0;j<y-1;j++){
                char t[]=new char[4];
                t[0]=arr[i][j];
                t[1]=arr[i+1][j+1];
                t[2]=arr[i+1][j];
                t[3]=arr[i][j+1];
                Arrays.sort(t);
                if(Arrays.equals(t,ref)) faces++;
            }
        }
        System.out.println(faces);
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