// Codeforces 466C Number Of Ways
// Double ptr and dp usage, important and interesting
import java.util.*;
import java.io.*;
public class NumberOfWays{
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
    int n=sc.nextInt();
    int arr[]=new int[n];
    long s=0;
    for(int i=0;i<n;i++)
    {arr[i]=sc.nextInt();s+=arr[i];}
    int cnt[]=new int[n];
    long ss=0;
    if(s%3!=0){
      System.out.println(0);
      System.exit(0);
    }
    s/=3;
    for(int i=n-1;i>=0;i--){
      ss+=arr[i];
      if(ss==s)
        cnt[i]=1;
    }
    for(int i=n-2;i>=0;i--)
    cnt[i]+=cnt[i+1];
    ss=0;
    long ans=0;
    for(int i=0;i<n-2;i++){
      ss+=arr[i];
      if(ss==s)
      ans+=cnt[i+2];
    }
    System.out.println(ans);
  }
}
