import java.util.*;
import java.io.*;
public class Courtesy{
    public static int fora(int a){
        int ans=(int)(Math.sqrt(a));
        return ans;
    }
    public static int forb(int b){
        int v=fora(b);
        if(v*(v+1)>b) return v-1;
        else return v;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int v1=fora(a);
        int v2=forb(b);
        if(v1>v2) System.out.println("Valera");
        else System.out.println("Vladik");
    }
}