import java.util.*;
import java.io.*;
import java.math.*;
public class Winner{
    public static void main(String[] args) {
        MyScanner sc=new MyScanner();
        int n=sc.nextInt();
        HashMap<String,Integer> scores=new HashMap<>();
        HashMap<String,Integer> last=new HashMap<>();
        ArrayList<String> keys=new ArrayList<>();
        int k=0;
        while(k<n){
            String st=sc.next();
            int v=sc.nextInt();
            if(scores.containsKey(st)){
                scores.put(st,scores.get(st)+v);
                last.put(st,k);
            }
            else{
                scores.put(st,v);
                last.put(st,k);
                keys.add(st);
            }
            k++;
        }
        int best=Integer.MIN_VALUE,bestlast=Integer.MAX_VALUE;
        String ans="";
        for(int i=0;i<keys.size();i++){
            String curr=keys.get(i);
            int curr_score=scores.get(curr);
            int curr_last=last.get(curr);
            System.out.println(curr+" | "+curr_score+" | "+curr_last);
            if(curr_score>best){best=curr_score;bestlast=curr_last;ans=curr;}
            else if(curr_score==best && curr_last<bestlast){best=curr_score;bestlast=curr_last;ans=curr;}
        }
        System.out.println(ans);
    }//end of main


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