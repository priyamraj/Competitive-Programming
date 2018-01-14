import java.util.*;
import java.io.*;
import java.math.*;
public class Crab{
    public static void main(String[] args) {
        MyScanner sc=new MyScanner();
        int n=sc.nextInt();
        int k=sc.nextInt();
        int a[]=new int[n];
        ArrayList<Integer> b=new ArrayList<>();
        for(int i=0;i<n;i++)a[i]=sc.nextInt();
        for(int i=0;i<k;i++)b.add(sc.nextInt());
        ArrayList<Integer> zeros=new ArrayList<>();
        for(int i=0;i<n;i++)
        if(a[i]==0)zeros.add(i);
        if(zeros.size()!=k){System.out.println("No");System.exit(0);}
        Comparator cmp=Collections.reverseOrder();
        Collections.sort(b,cmp);
        int v=0;
        for(Integer x:zeros){
            a[x]=b.get(v);
            v++;
        }
        HashSet<Integer> h=new HashSet<>();
        for(Integer x:a){
            if(h.contains(a)){System.out.println("No");System.exit(0);}
            h.add(x);
        } 
        int arr[]=a.clone();
        Arrays.sort(arr);
        if(!Arrays.equals(arr,a))
        System.out.println("Yes");
        else System.out.println("No");
    }
    public static int gcd(int a,int b){
        if(a==1||b==1)return 1;
        if(a%b==0)return b;
        return gcd(b,a%b);
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