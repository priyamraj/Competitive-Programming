import java.util.*;
import java.io.*;
import java.math.*;
public class FairGame{
    public static void main(String[] args) {
        MyScanner sc=new MyScanner();
        int n=sc.nextInt();
        int arr[]=new int[101];
        HashSet<Integer> d=new HashSet<>();
        for(int i=0;i<n;i++){
            int v=sc.nextInt();
            arr[v]++;
            d.add(v);
        }
        // boolean x=true;
        // for(int i=5;i<=100;i++){
        //     if(arr[i]>0) x=false; 
        // }
        // if(arr[1]!=1 || arr[2]!=1 || arr[3]!=1 || arr[4]!=1) x=false;
        // if(n==4 && x){
        //     System.out.println("NO");
        //     System.exit(0);
        // }
        if(d.size()%2==1) System.out.println("NO");
        else{
            int L=0,R=0,p=-1;
            boolean b=false;
            for(int i=1;i<=100;i++){
                L+=arr[i];
                R=n-L;
                if(L==R){b=true;p=i;break;}
            }
            if(b){
                System.out.println("YES");
                ArrayList<Integer> p1=new ArrayList<>();
                ArrayList<Integer> p2=new ArrayList<>();
                for(int j=1;j<=p;j++)
                    if(arr[j]!=0) p1.add(j);
                for(int j=p+1;j<=100;j++)
                    if(arr[j]!=0) p2.add(j);
                for(int i=0;i<p1.size();i++)
                    System.out.println(p1.get(i)+" "+p2.get(i));
            }
            else System.out.println("NO");
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