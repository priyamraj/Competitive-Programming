import java.util.*;
import java.io.*;
import java.math.*;
public class Crossword{
    public static void main(String[] args) {
        MyScanner sc=new MyScanner();
        int lens=sc.nextInt();
        int lent=sc.nextInt();
        char s[]=(sc.next()).toCharArray();
        char t[]=(sc.next()).toCharArray();
        ArrayList<Integer> ans=new ArrayList<>();
        int changes=Integer.MAX_VALUE;
        for(int i=0;i<lent-lens+1;i++){
          int c=0;
          ArrayList<Integer> pos=new ArrayList<>();
          for(int j=0;j<lens;j++){
            if(t[i+j]!=s[j]){c++;pos.add(j+1);}
          }
          if(c<changes){
            changes=c;
            ans.clear();
            ans=pos;
          }
        } //end of i
        System.out.println(changes);
        for(Integer x:ans) System.out.print(x+" ");
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