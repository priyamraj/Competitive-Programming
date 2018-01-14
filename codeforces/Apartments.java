import java.util.*;
import java.io.*;
public class Apartments{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int mx,mn;
        if(k!=0 && k<n) mn=1;
        else mn=0;

        if(k==n || k==0)mx=0;
        else mx=n-k;
        System.out.println(mn+" "+mx);
    }
}