import java.util.*;
import java.io.*;
import java.math.*;
public class Equidistant{
    public static void main(String[] args) {
        MyScanner sc=new MyScanner();
        String s1=sc.next();
        String s2=sc.next();
        int ham=0;
        int n=s1.length();
        ArrayList<Integer> pos=new ArrayList<>();
        for(int i=0;i<n;i++)
        if(s1.charAt(i)!=s2.charAt(i)){
        ham++;
        pos.add(i);
    }
        if(ham%2==1){
            System.out.println("Impossible");
            System.exit(0);
        }
        char arr[]=new char[n];
        for(int i=0;i<n;i++)
        if(s1.charAt(i)==s2.charAt(i))
        arr[i]=s1.charAt(i);

        for(int i=0;i<pos.size()/2;i++)
        arr[pos.get(i)]=s1.charAt(pos.get(i));
        for(int i=pos.size()/2;i<pos.size();i++)
        arr[pos.get(i)]=s2.charAt(pos.get(i));
        System.out.println(new String(arr));
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