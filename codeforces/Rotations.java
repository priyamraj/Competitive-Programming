import java.util.*;
import java.io.*;
import java.math.*;
public class Rotations{
    private static class Pair{
        int x,y;
        Pair(int X,int Y){
            x=X;y=Y;
        }
    }
    private static class Pt{
        int x,a;
        int y,b;
        Pt(int X,int Y,int A,int B){
            x=X;y=Y;
            a=A;b=B;
        }
    }
    static ArrayList<Pair> set1=new ArrayList<>();
    static ArrayList<Pair> set2=new ArrayList<>();
    static ArrayList<Pair> set3=new ArrayList<>();
    static ArrayList<Pair> set4=new ArrayList<>();
    public static void fillRotation1(Pt p){
        set1.clear();
        int X=p.x,Y=p.y,A=p.a,B=p.b;
        int tx=X,ty=Y;
        for(int i=0;i<4;i++){
            set1.add(new Pair(tx,ty));
            int _tx=A+B-ty;
            int _ty=B-A+tx;
            tx=_tx;
            ty=_ty;
        } 
    }
    public static void fillRotation2(Pt p){
        set2.clear();
        int X=p.x,Y=p.y,A=p.a,B=p.b;
        int tx=X,ty=Y;
        for(int i=0;i<4;i++){
            set2.add(new Pair(tx,ty));
            int _tx=A+B-ty;
            int _ty=B-A+tx;
            tx=_tx;
            ty=_ty;
        } 
    }
    public static void fillRotation3(Pt p){
        set3.clear();
        int X=p.x,Y=p.y,A=p.a,B=p.b;
        int tx=X,ty=Y;
        for(int i=0;i<4;i++){
            set3.add(new Pair(tx,ty));
            int _tx=A+B-ty;
            int _ty=B-A+tx;
            tx=_tx;
            ty=_ty;
        } 
    }
    public static void fillRotation4(Pt p){
        set4.clear();
        int X=p.x,Y=p.y,A=p.a,B=p.b;
        int tx=X,ty=Y;
        for(int i=0;i<4;i++){
            set4.add(new Pair(tx,ty));
            int _tx=A+B-ty;
            int _ty=B-A+tx;
            tx=_tx;
            ty=_ty;
        } 
    }
    public static int distSq(Pair p, Pair q)
    {
        return (p.x - q.x)*(p.x - q.x) +
               (p.y - q.y)*(p.y - q.y);
    }
    public static boolean isSquare(Pair p1, Pair p2, Pair p3, Pair p4)
    {
        if(p1.x==p2.x && p1.y==p2.y)
          return false;
        if(p2.x==p3.x && p2.y==p3.y)
          return false;
        if(p3.x==p4.x && p3.y==p4.y)
          return false;
        if(p2.x==p4.x && p2.y==p4.y)
          return false;
        if(p1.x==p4.x && p1.y==p4.y)
          return false;
        if(p1.x==p3.x && p1.y==p3.y)
          return false;
        int d2 = distSq(p1, p2);  // from p1 to p2
        int d3 = distSq(p1, p3);  // from p1 to p3
        int d4 = distSq(p1, p4);  // from p1 to p4
        if (d2 == d3 && 2*d2 == d4)
        {
            int d = distSq(p2, p4);
            return (d == distSq(p3, p4) && d == d2);
        }
        if (d3 == d4 && 2*d3 == d2)
        {
            int d = distSq(p2, p3);
            return (d == distSq(p2, p4) && d == d3);
        }
        if (d2 == d4 && 2*d2 == d3)
        {
            int d = distSq(p2, p3);
            return (d == distSq(p3, p4) && d == d2);
        }
        return false;
    }    
    public static int checkCost(Pt p1,Pt p2,Pt p3,Pt p4){
        fillRotation1(p1);
        fillRotation2(p2);
        fillRotation3(p3);
        fillRotation4(p4);
        int cost=Integer.MAX_VALUE;
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                for(int k=0;k<4;k++){
                    for(int l=0;l<4;l++){
                        if(isSquare(set1.get(i), set2.get(j), set3.get(k), set4.get(l)))
                          cost=Math.min(cost,i+j+k+l);
                    }//end of l
                }
            }
        }//end of i
        if(cost==Integer.MAX_VALUE) cost=-1;
        return cost;
    }
    public static void main(String[] args) {
        MyScanner sc=new MyScanner();
        int n=sc.nextInt();
        Pt arr[]=new Pt[4*n];
        for(int i=0;i<4*n;i++){
            int x=sc.nextInt();int y=sc.nextInt();
            int a=sc.nextInt();int b=sc.nextInt();
            arr[i]=new Pt(x,y,a,b);
        }
        for(int i=0;i<4*n;i+=4){
            int c=checkCost(arr[i], arr[i+1], arr[i+2], arr[i+3]);
            System.out.println(c);
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