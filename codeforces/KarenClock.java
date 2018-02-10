import java.util.*;
import java.io.*;
import java.math.*;
public class KarenClock{
    public static void main(String[] args) {
        MyScanner sc=new MyScanner();
        int arr[]=new int[4];
        String s=sc.next();
        arr[0]=s.charAt(0)-'0';arr[1]=s.charAt(1)-'0';
        arr[2]=s.charAt(3)-'0';arr[3]=s.charAt(4)-'0';
        int ans=0;
        while(true){
          if(arr[0]==arr[3] && arr[1]==arr[2]){
            // for(Integer x:arr)
            //   System.out.print(x+" ");
            break;
          }
          int min=arr[2]*10+arr[3];
          int hr=arr[0]*10+arr[1];
          min++;
          if(min<60){
            arr[2]=min/10;
            arr[3]=min%10;
          }
          else{
            hr++;
            arr[2]=0;arr[3]=0;
            if(hr<24){arr[0]=hr/10;arr[1]=hr%10;}
            else{arr[0]=0;arr[1]=0;}
          }
          ans++;
        }//end of while
        System.out.println(ans);
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