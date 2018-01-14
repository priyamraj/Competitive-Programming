import java.util.*;
import java.io.*;
public class Movie{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int x=sc.nextInt();
    int min=0,prev=0;
    for(int i=1;i<n;i++){
      int l=sc.nextInt();
      int r=sc.nextInt();
      if(i==0){
        min+=(r-l+1);
        prev=r;
      }
      else{
        if(prev==l)
        {min+=(r-l);prev=r;}
        else{
          int skip=(l-prev)/x;
          int skip=skip*x;
          min+=(r-prev-skip+1);
          prev=r;
        }
      }
    }
    System.out.println(min);
  }
}
