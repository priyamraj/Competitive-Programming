import java.util.*;
import  java.io.*;
public class DivPairs{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int cnt[]=new int[5];
        int n=sc.nextInt();
        int m=sc.nextInt();
        for(int i=1;i<=n;i++)
          cnt[i%5]++;
        long ans=0;
        for(int i=1;i<=m;i++){
            int have=i%5;
            int needed=5-have;
            if(needed==5) needed=0;
            ans+=cnt[needed];
        }
        System.out.println(ans);
    }
}