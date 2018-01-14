import java.util.*;
import java.io.*;
public class Fractions{
    public static int hcf(int a,int b){
        if(a==1 || b==1)
          return 1;
        else if(a%b==0)
          return b;
        else return hcf(b,a%b);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        int mid=s/2;
        int num=0,den=0;
        for(int i=1;i<=mid;i++){
            if(hcf(i,s-i)==1){num=i;den=s-i;}
        }
        System.out.println(num+" "+den);
    }
}