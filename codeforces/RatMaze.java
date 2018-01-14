import java.util.*;
import java.io.*;
import java.math.*;
public class RatMaze{
    private static class Pair{
        int r, c;
        Pair(int R,int C){r=R;c=C;}
    }
    static int dix[]={-1,0,0,1};
    static int diy[]={0,1,-1,0};
    static int arr[][];
    static boolean block[][];
    public static void printPath(Stack<Pair> st){
        while(!st.isEmpty()){
            Pair p=st.pop();
            System.out.println("["+p.r+","+p.c+"]");
        }
    }
    public static boolean findPath(){
        Stack<Pair> st=new Stack<>();
        st.push(new Pair(0,0));
        block[0][0]=true;
        int n=arr.length,m=arr[0].length;
        while(!st.isEmpty()){
            Pair p=st.peek();
            if(p.r==n-1 && p.c==m-1){
                break;
            }
            boolean can_set=false;
            for(int i=0;i<4;i++){
             int x=p.r+diy[i];
             int y=p.c+dix[i];
             //System.out.println("debug:"+x+" "+y);             
             if(x>=0&&x<n&&y>=0&&y<m&&arr[x][y]!=1&&!block[x][y]){
                 st.push(new Pair(x,y));
                 block[x][y]=true;
                 can_set=true;
                 break;
                }   
            } //end of i
            if(!can_set)
                st.pop();
        } //end of while
        if(st.isEmpty()) return false;
        printPath(st);
        return true;
    }
    public static void main(String[] args) {
        MyScanner sc=new MyScanner();
        int n=sc.nextInt();
        int m=sc.nextInt();
        arr=new int[n][m];
        block=new boolean[n][m];
        for(int i=0;i<n;i++)
            for(int j=0;j<m;j++)
                arr[i][j]=sc.nextInt();
        System.out.println(findPath());
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