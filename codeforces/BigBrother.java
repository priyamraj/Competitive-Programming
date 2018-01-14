import java.util.*;
import java.io.*;
public class BigBrother{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int ans=1;
        while(!(a>b)){
            a*=3;
            b*=2;
            ans++;
        }
        ans-=1;
        System.out.print(ans);
    }
}