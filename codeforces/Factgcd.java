import java.util.*;
import java.io.*;
public class Factgcd{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int minn=Math.min(a,b);
        long ans=1;
        for(int i=1;i<=minn;i++)
           ans*=i;
        System.out.println(ans);
    }
}