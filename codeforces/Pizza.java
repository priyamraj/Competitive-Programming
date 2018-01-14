import java.util.*;
import java.io.*;
public class Pizza{
    public static double distance(int x,int y,int a,int b){
        double d=Math.sqrt((x-a)*(x-a)+(y-b)*(y-b));
        return d;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int R=sc.nextInt();
        int D=sc.nextInt();
        int sausage=sc.nextInt();
        int ans=0;
        while(sausage-->0){
            int x=sc.nextInt();
            int y=sc.nextInt();
            int r=sc.nextInt();
            double d=distance(0, 0, x, y);
            double up=d+r;
            double down=R-D+r;
            if(d>=down && d+r<=R)
              ans++;
        }
            System.out.println(ans);
    }
}