import java.util.*;
import java.io.*;
public class JonSnow{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        int mx=Integer.MIN_VALUE;
        int mn=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            mx=Math.max(mx,arr[i]);
            mn=Math.min(mn,arr[i]);
        }
        int ans=0;
        for(int i=0;i<n;i++){
            if(arr[i]>mn && arr[i]<mx)
            ans++;
        }
        System.out.println(ans);
    }
}