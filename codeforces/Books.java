import java.util.*;
import java.io.*;
public class Books{
    static int answer=-1;
    public static void bsearch(int arr[],int pivot,int low,int high,int t){
        if(low<=high){
            int mid=low+(high-low)/2;
            int val=0;
            if(mid-1 >=0)
              val=arr[mid-1];
            if(arr[pivot]-val<=t){
                answer=pivot-mid+1;
                bsearch(arr, pivot, 0, mid-1,t);
            }
            else
              bsearch(arr, pivot, mid+1, high,t);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int t=sc.nextInt();
        int arr[]=new int[n];
        boolean ans_exists=false;
        for(int i=n-1;i>=0;i--){
            arr[i]=sc.nextInt();
            if(arr[i]<=t)
               ans_exists=true;
        }
        for(int i=0;i<n;i++){
            if(i>0)
              arr[i]=arr[i]+arr[i-1];
         }
        int ans=0;
        for(int i=1;i<n;i++){
            int pivot=i;
            int low=0, high=i-1;
            bsearch(arr, pivot, low, high, t);
            if(answer!=-1)
              ans=Math.max(ans, answer);
            answer=-1;
        }
        if(ans==0 && ans_exists)
          System.out.println(1);
        else
          System.out.println(ans);
    }
}