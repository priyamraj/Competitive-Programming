import java.util.*;
import java.io.*;
import java.math.*;
class Chefgp{
    public static void main(String[] args) {
        MyScanner sc=new MyScanner();
        int tc=sc.nextInt();
        while(tc-->0){
            String s=sc.next();
            int x=sc.nextInt();
            int y=sc.nextInt();
            int ca=0,cb=0;
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)=='a')ca++;
                else cb++;
            }
            int seta=(int)Math.ceil((double)ca/x);
            int setb=(int)Math.ceil((double)cb/y);
            if(ca==cb){
                while(ca-->0)System.out.print("ab");
            }
            else if(seta==setb){
                int L=seta;
                for(int i=0;i<L;i++){
                    int pa=Math.min(x,ca);
                    int pb=Math.min(y,cb);
                    for(int ii=0;ii<pa;ii++)System.out.print("a");
                    for(int ii=0;ii<pb;ii++)System.out.print("b");
                    ca-=pa;
                    cb-=pb;
                }
            }
            else if(seta>setb){
                int L=seta;
                for(int i=0;i<L;i++){
                    int pa=Math.min(x,ca);
                    int pb=Math.min(y,cb);
                    for(int ii=0;ii<pa;ii++)System.out.print("a");
                    if(pb!=0)
                    for(int ii=0;ii<pb;ii++)System.out.print("b");
                    else if(i!=L-1)
                    System.out.print("*");
                    ca-=pa;
                    cb-=pb;                    
                }
            }
                else{
                    int L=setb;
                    for(int i=0;i<L;i++){
                        int pa=Math.min(x,ca);
                        int pb=Math.min(y,cb);
                        for(int ii=0;ii<pb;ii++)System.out.print("b");
                        if(pa!=0)
                        for(int ii=0;ii<pa;ii++)System.out.print("a");
                        else if(i!=L-1)
                        System.out.print("*");
                        ca-=pa;
                        cb-=pb;             
                }
            }
            System.out.println();
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