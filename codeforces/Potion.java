import java.util.*;
import java.io.*;
public class Potion{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int l=sc.nextInt();
        int x=sc.nextInt();
        int y=sc.nextInt();
        double k=sc.nextDouble();
        for(int i=x;i<=y;i++){
            double v=i*k;
            int v1=(int)Math.ceil(v);
            int v2=(int)Math.floor(v);
            if(v1==v2 && (v1>=r && v1<=l)){System.out.println("YES");System.exit(0);}
        }
        System.out.println("NO");
    }
}