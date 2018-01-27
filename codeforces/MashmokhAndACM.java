import java.util.*;
import java.io.*;
import java.math.*;
public class MashmokhAndACM{
    static long res[][];
    static int m,len;
    // step btata hai string ki konsi position pe hai ham
    // num btata hai us position pe konsa char(1..9..) present hai
    public static long calc(int step,int num){
        // already calculate kr lia hai ye agar (dp)
        if(res[step][num]!=-1) return res[step][num];
        // base case hai..bottom up bna rhe string..so last char phle bnega..uski length 1 hogi and 
        // har 1 length wali string program me given condition satisfy kregi
        if(step==len) return res[step][num]=1;
        res[step][num]=0;
        // num ke saare multiples ke liye 
        for(int i=num;i<=m;i+=num)
            res[step][num]+=calc(step+1,i); // iss position ke aage wali position pe 
            // multiple set krre num ke
        return res[step][num]%=(int)(1e9+7);
    }

    public static void main(String[] args) {
        MyScanner sc=new MyScanner();
        m=sc.nextInt(); // max itne  nums ka use allowed hai 1..m
        len=sc.nextInt(); // max length 
        res=new long[len+1][m+1];
        for(int i=0;i<=len;i++) Arrays.fill(res[i],-1);
        System.out.println(calc(0,1));
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