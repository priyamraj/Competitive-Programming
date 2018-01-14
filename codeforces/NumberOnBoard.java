import java.util.*;
import java.io.*;
import java.math.*;
public class NumberOnBoard{
    public static void main(String[] args) {
        MyScanner sc=new MyScanner();
        int k=sc.nextInt();
        String st=sc.next();
        int arr[]=new int[st.length()];
        for(int i=0;i<st.length();i++)
          arr[i]=st.charAt(i)-'0';
        Arrays.sort(arr);
        int ans=0,s=0;
        for(Integer x:arr)
          s+=x;
        if(s>=k){
          System.out.println(0);
          System.exit(0);
        }
        for(int i=0;i<arr.length;i++){
          int t=arr[i];
          arr[i]=0;
          arr[i]=Math.min(9,t+k-s);
          ans++;
          s=s-t+arr[i];
          if(s>=k)break;
        }
        System.out.println(ans);
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