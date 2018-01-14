import java.util.*;
import java.io.*;
public class Boredom{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int mx=0;
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            mx=Math.max(mx,arr[i]);
        }
        int cnt[]=new int[mx+1];
        for(Integer x:arr)
          cnt[x]++;
        long fn[]=new long[mx+1];
        fn[0]=0;
        fn[1]=cnt[1];
        for(int i=2;i<cnt.length;i++){
            fn[i]=Math.max(fn[i-1],cnt[i]*i+fn[i-2]);
        }
        System.out.println(fn[mx]);
    }
}