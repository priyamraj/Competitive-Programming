import java.util.*;
public class Circles{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int r=sc.nextInt();
    int x1=sc.nextInt();
    int y1=sc.nextInt();
    int x2=sc.nextInt();
    int y2=sc.nextInt();
    double d=Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
    double val=d/(r*2);
    int res=(int)Math.ceil(val);
    System.out.println(res);
  }
}
