import java.util.*;
import java.io.*;
public class MinDifficulty{
  public static int difficult(int arr[],int k){
    int max=Integer.MIN_VALUE;
    int prev=k-1;
    for(int i=0;i<arr.length-1;i++){
      if(i==k)
      continue;
      else if(i==prev)
      max=Math.max(max,arr[k+1]-arr[k-1]);
      else
      max=Math.max(max,arr[i+1]-arr[i]);
    }
    return max;
  }
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++)
    arr[i]=sc.nextInt();
    int min=Integer.MAX_VALUE;
    for(int i=1;i<arr.length-1;i++){
      min=Math.min(min,difficult(arr,i));
    }
    System.out.println(min);
  }
}
