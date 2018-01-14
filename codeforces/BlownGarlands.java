import java.util.*;
import java.io.*;
import java.math.*;
public class BlownGarlands{
    public static int modVal(String s,char c){
        for(int i=1;i<=s.length();i++){
            if(s.charAt(i-1)==c)
            return i%4;
        }
        return -1;
    }
    public static void main(String[] args) {
        MyScanner sc=new MyScanner();
        String s=sc.next();
        int rpos=modVal(s,'R');
        int bpos=modVal(s,'B');
        int gpos=modVal(s,'G');
        int ypos=modVal(s,'Y');
        int r=0,b=0,g=0,y=0;
        for(int i=1;i<=s.length();i++){
            char ch=s.charAt(i-1);
            if(ch=='!'){
                if(i%4==rpos)r++;
                else if(i%4==bpos)b++;
                else if(i%4==gpos)g++;
                else y++;
            }
        }
        System.out.println(r+" "+b+" "+y+" "+g);
    }
    public static int gcd(int a,int b){
        if(a==1||b==1)return 1;
        if(a%b==0)return b;
        return gcd(b,a%b);
    }
    public static int[] intArrayUtil(int n){
        int arr[]=new int[n];
        MyScanner sc=new MyScanner();
        for(int i=0;i<n;i++) arr[i]=sc.nextInt();
        return arr;
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