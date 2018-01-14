import java.io.*;
import java.util.*;
public class KeyRaces{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        int v1=sc.nextInt();
        int v2=sc.nextInt();
        int t1=sc.nextInt();
        int t2=sc.nextInt();
        int p1=0,p2=0;
        p1=t1+s*v1+t1;
        p2=t2+s*v2+t2;
        // System.out.println("p1: "+p1+"  p2:"+p2);
        if(p1==p2) System.out.println("Friendship");
        else if(p1<p2) System.out.println("First");
        else System.out.println("Second");
    }
}