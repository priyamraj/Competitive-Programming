import java.util.*;
import java.io.*;
public class Lucky{
    public static boolean countLuck(int n,int k){
        int v=0;
        while(n>0){
            int d=n%10;
            if(d==4 || d==7) v++;
            n/=10;
            if(v>k) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++) arr[i]=sc.nextInt();
        int ans=0;
        for(Integer x:arr){
            if(countLuck(x,k))ans++;
        }
        System.out.println(ans);
    }
}