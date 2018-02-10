import java.util.*;
import java.io.*;
import java.math.*;
import java.awt.geom.Point2D;
import java.awt.geom.Line2D;
public class Pawn{
    
    private static class Pair{
      int f,s;
      public Pair(int f,int s){
        this.f=f;
        this.s=s;
      }
    }

    static int incr[]={1,2,2,1};
    static int incc[]={-2,-1,1,2};   
    static ArrayList<Pair> others=new ArrayList<>();
    static ArrayList<Pair> whites=new ArrayList<>();
    static HashSet<Character> wh=new HashSet<>();

    static boolean isClear(int wpr,int wpc,int bkr,int bkc){
      for(int i=0;i<others.size();i++){
        Pair p=others.get(i);
        int pr=p.f;
        int pc=p.s;
        if(wpr==pr && wpc==pc) continue;
        double ext=0.0;
        Point2D pt1=new Point2D.Double(); pt1.setLocation(wpr,wpc);
        Point2D pt2=new Point2D.Double(); pt2.setLocation(bkr,bkc);
        Line2D lnseg=new Line2D.Double();
        lnseg.setLine(pt1,pt2);
        Point2D pt3=new Point2D.Double(); pt3.setLocation(pr,pc);
        double dist=lnseg.ptSegDist(pt3);
        if(dist==ext) return false;
      }
      return true;
    }

    static boolean checkQueen(int wpr,int wpc,int bkr,int bkc){
      boolean b=false;
      if(wpr==bkr) b=true;
      else if(wpc==bkc) b=true;
      else if(wpr+wpc == bkr+bkc) b=true;
      else if(wpr-wpc == bkr-bkc) b=true;
      if(!b) return b;
      if(b && isClear(wpr,wpc,bkr,bkc)) return true;
      return false;
    }

    static boolean checkBishop(int wpr,int wpc,int bkr,int bkc){
      boolean b=false;
      if(wpr+wpc == bkr+bkc) b=true;
      else if(wpr-wpc == bkr-bkc) b=true;
      if(!b) return b;
      if(b && isClear(wpr,wpc,bkr,bkc)) return true;
      return false;
    }

    static boolean checkRook(int wpr,int wpc,int bkr,int bkc){
      boolean b=false;
      if(wpr==bkr) b=true;
      else if(wpc==bkc) b=true;
      if(!b) return b;
      if(b && isClear(wpr,wpc,bkr,bkc)) return true;
      return false;
    }

    static boolean checkKnight(int wpr,int wpc,int bkr,int bkc){
      boolean b=false;
      for(int i=0;i<4;i++){
        int r=wpr+incr[i];
        int c=wpc+incc[i];
        if(r>=0 && r<8 && c>=0 && c<8){
          if(bkr==r && bkc==c)
            b=true;
        }
      }
      return b;
    }
    
    public static void main(String[] args) {
        MyScanner sc=new MyScanner();
        wh.add('Q');wh.add('B');wh.add('R');
        int tc=sc.nextInt();
        while(tc-->0){
          char[][] arr=new char[8][8];
          for(int i=0;i<8;i++)
              arr[i]=(sc.next()).toCharArray();
          int wpr=1,wpc=-1;
          for(int i=0;i<8;i++)
            if(arr[1][i]=='P')
              wpc=i;
          
          int bkr=-1,bkc=-1;
          
          for(int i=0;i<8;i++)
            for(int j=0;j<8;j++){
              if(arr[i][j]=='k'){
                bkr=i;
                bkc=j;
              }
            }
         
          for(int i=0;i<8;i++)
            for(int j=0;j<8;j++){
                if(i==wpr && j==wpc) continue;
                if(i==bkr && j==bkc) continue;
                if(arr[i][j]!='#')
                    others.add(new Pair(i,j));
                if(wh.contains(arr[i][j]))
                  whites.add(new Pair(i,j));
            }
          //move forward
          wpr--;
          arr[wpr][wpc]='P';
          arr[wpr+1][wpc]='#';

          //System.out.println("debug:"+others.size());
          int ans=0;
          if(checkQueen(wpr,wpc,bkr,bkc)) ans++;
          if(checkKnight(wpr,wpc,bkr,bkc)) ans++;
          if(checkRook(wpr,wpc,bkr,bkc)) ans++;
          if(checkBishop(wpr,wpc,bkr,bkc)) ans++;
           
       //    System.out.println("debug:"+whites.size());
         //  for(Pair x:whites)
           //    System.out.println("pair:"+x.f+" "+x.s+" "+arr[x.f][x.s]);
           
          int dis=0;
          for(int i=0;i<whites.size();i++){
            int wr=whites.get(i).f;
            int wc=whites.get(i).s;
            char type=arr[wr][wc];
          //  System.out.println("line "+i+" "+wr+" "+wc+" "+type);
             if(type=='B'){
              if(checkBishop(wr,wc,bkr,bkc)) {dis++;/*System.out.println(i+" dis b "+wr+":"+wc);*/}
            }
            else if(type=='R'){
              if(checkRook(wr,wc,bkr,bkc)) {dis++;/*System.out.println(i+" dis r "+wr+":"+wc);*/}
            }
            else if(type=='Q'){
              if(checkQueen(wr,wc,bkr,bkc)) {dis++;/*System.out.println(i+" dis q "+wr+":"+wc);*/}
            }
          }//end of discovered checks
       
            //   for(int i=0;i<8;i++){for(int j=0;j<8;j++)System.out.print(arr[i][j]);System.out.println();} 
           
          //System.out.println(ans);
          //System.out.println(dis);
          if(dis!=0) System.out.println(4);
          else System.out.println(ans);
          others.clear();
          whites.clear();
        }//end of while tc
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