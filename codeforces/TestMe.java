import java.util.*;
public class TestMe{
    public static int hcf(int a,int b){
        if(a==1 || b==1)
         return 1;
        else if(a%b==0)
          return b;
        return hcf(b,a%b);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=0;
        for(int i=1;i<=6;i++){
            if(i>=a && i>=b)
              c++;
        }
        int num=c/hcf(c,6);
        int den=6/hcf(c,6);
        if(c==0)
         System.out.println("0/1");
        else
         System.out.println(num+"/"+den);
   }
}