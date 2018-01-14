import java.util.*;
import java.io.*;
public class Robot{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++)
    arr[i]=sc.nextInt();
    int have=0,count=0,res=0;
    while(count!=n){
      for(int i=0;i<n;i++){
        if(arr[i]<=have && arr[i]>=0){have++;arr[i]=-1;count++;}
      }
      if(count==n)
      break;
      res++;
      for(int j=n-1;j>=0;j--){
        if(arr[j]<=have && arr[j]>=0){have++;arr[j]=-1;count++;}
      }
      if(count==n)
      break;
      res++;
    }
    System.out.println(res);
  }
}
