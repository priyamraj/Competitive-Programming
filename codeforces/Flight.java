import java.util.*;
import java.io.*;
public class Flight{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=sc.nextInt();
        int b=sc.nextInt();
        String s=sc.next();
        if(s.charAt(a-1)==s.charAt(b-1)) System.out.print(0);
        else System.out.print(1);
    }
}