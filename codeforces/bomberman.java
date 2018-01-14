import java.util.*;
import java.io.*;
public class bomberman{
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
  public static void plantAll(int arr[][]){
    for(int i=0;i<arr.length;i++)
    for(int j=0;j<arr[0].length;j++){
      if(arr[i][j]==-1)arr[i][j]=3;
    }
  }
  public static void detonate(int arr[][]){
    for(int i=0;i<arr.length;i++)
    for(int j=0;j<arr[0].length;j++){
      if(arr[i][j]==1){
        arr[i][j]=-1;
        if(i+1<arr.length)arr[i+1][j]=-1;
        if(j+1<arr[0].length)arr[i][j+1]=-1;
        if(i-1>=0)arr[i-1][j]=-1;
        if(j-1>=0)arr[i][j-1]=-1;
      }
    }
  }
  public static void update(int arr[][]){
    for(int i=0;i<arr.length;i++)
    for(int j=0;j<arr[0].length;j++){
      if(arr[i][j]==-1)
      continue;
      arr[i][j]-=1;
    }
  }
  public static void display(int arr[][]){
    for(int i=0;i<arr.length;i++){
      for(int j=0;j<arr[0].length;j++){
        if(arr[i][j]==-1)
        System.out.print(".");
        else
        System.out.print("O");
      }
      System.out.println();
    }
  }
  public static void main(String[] args) {
    MyScanner sc=new MyScanner();
    int r=sc.nextInt();
    int c=sc.nextInt();
    int arr[][]=new int[r][c];
    for(int i=0;i<r;i++)
    for(int j=0;j<c;j++){
    char tc=(sc.next()).charAt(O);
    if(tc=='O')
    arr[i][j]=3;
    else
    arr[i][j]=-1
  }
    long t=sc.nextLong();
    long tt=1;
    while(tt<=t){
      if(tt%3==1)
      update(arr);
      else if(tt%3==2){
        update();
        plantAll();
      }
      else{
      update();
      detonate();
      }
    }
    display(arr);
  }
}
