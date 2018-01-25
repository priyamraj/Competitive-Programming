import java.util.*;
import java.io.*;
import java.math.*;
public class Maze{
    static int x[]={-1,0,0,1};
    static int y[]={0,1,-1,0};
    static char arr[][];
    static int con;
    public static void dfs(int a,int b,int n,int m){
        if(con<=0 || arr[a][b]=='#' || arr[a][b]=='$') return;
        con--;
        // System.out.println("Test:"+a+" "+b+" con:"+con);
        arr[a][b]='$';
        for(int d=0;d<4;d++){
            int A=a+x[d];
            int B=b+y[d];
            if(A>=0&&A<n&&B>=0&&B<m)
                dfs(A,B,n,m);
        }
    }
    public static void main(String[] args) {
        MyScanner sc=new MyScanner();
        int n=sc.nextInt();
        int m=sc.nextInt();
        int k=sc.nextInt();
        arr=new char[n][m];
        for(int i=0;i<n;i++)
            arr[i]=(sc.next()).toCharArray();
        int a=-1,b=-1,s=0;
        for(int i=0;i<n;i++)
            for(int j=0;j<m;j++){
                if(a==-1 && b==-1 && arr[i][j]=='.'){a=i;b=j;}
                if(arr[i][j]=='.') s++;
            }
        con=s-k;
        // System.out.println("Cons:"+con);
        dfs(a,b,n,m);
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(arr[i][j]=='$') System.out.print(".");
                else if(arr[i][j]=='.') System.out.print("X");
                else System.out.print("#");
            }
            System.out.println();
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