import java.util.*;
import java.io.*;
import java.math.*;
public class Chocolates{
    public static void main(String[] args) {
        MyScanner sc=new MyScanner();
        int arr[]=intArrayUtil();
        ArrayList<Integer> pos=new ArrayList<>();
        long ans=1;
        for(int i=0;i<arr.length;i++)
        if(arr[i]==1)
        pos.add(i);
        if(pos.size()==0){System.out.println(0);System.exit(0);}
        if(pos.size()==1){System.out.println(1);System.exit(0);}
        for(int i=1;i<pos.size();i++)
        ans*=(pos.get(i)-pos.get(i-1));
        System.out.println(ans);
    }
    public static int gcd(int a,int b){
        if(a==1||b==1)return 1;
        if(a%b==0)return b;
        return gcd(b,a%b);
    }
    public static int[] intArrayUtil(){
        MyScanner sc=new MyScanner();
        int n=sc.nextInt();
        int arr[]=new int[n];
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