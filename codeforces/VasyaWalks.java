import java.util.*;
import java.io.*;
public class VasyaWalks{
    public static int moveDown(int curr,int n){
        curr--;
        if(curr<1)
        curr=n;
        return curr;
    }
    public static int moveUp(int curr,int n){
        curr++;
        if(curr>n)
        curr=1;
        return curr;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=sc.nextInt();
        int b=sc.nextInt();
        if(b<0){
            b=Math.abs(b);
            while(b-->0){
                a=moveDown(a, n);
                // System.out.println("pos:"+a);
            }
            System.out.println(a);
            System.exit(0);
        }
        else{
            while(b-->0){
                a=moveUp(a, n);
                // System.out.println("pos:"+a);
            }
            System.out.println(a);
            System.exit(0);
        }
        sc.close();
    }
}