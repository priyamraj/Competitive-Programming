import java.util.*;
import java.io.*;
public class TrickySum{
  public static class MyScanner {
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
public static void main(String[] args) {
MyScanner sc=new MyScanner();
  int q=sc.nextInt();
  while(q-->0){
    long end=sc.nextLong();
    long sum=0L;
    if((end&1)==0){
        sum=end/2;
        sum=sum*(end+1);
    }
    else{
        sum=(end+1)/2;
        sum=sum*end;
    }
    long n=(long)(Math.log(end)/Math.log(2))+1L;
    long gp=2*((long)(Math.pow(2,n))-1);
    sum-=gp;
    System.out.println(sum);
  }
 }
}
