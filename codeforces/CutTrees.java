import java.util.*;
import java.io.*;
public class CutTrees{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int x[]=new int[n+1];
        int h[]=new int[n+1];
        int fell[]=new int[n+1];
        for(int i=0;i<n;i++){
            x[i]=sc.nextInt();
            h[i]=sc.nextInt();
        }
        //1 for left, 2 for right
        x[n]=Integer.MAX_VALUE;
        fell[0]=1;
        int ans=1;
        for(int i=1;i<n;i++){
            if(fell[i-1]==2 && h[i-1]+h[i]<x[i]-x[i-1]){fell[i]=1;ans++;}
            else if(fell[i-1]!=2 && x[i]-h[i]>x[i-1]){fell[i]=1;ans++;}
            else if(x[i]+h[i]<x[i+1]){fell[i]=2;ans++;}
            else continue;
        }
        System.out.println(ans);
    }
}