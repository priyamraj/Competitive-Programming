import java.util.*;
public class Stringy{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String s=sc.next();
    String t=sc.next();
    int k=sc.nextInt();
    int identical=0;
    for(int i=0;i<Math.min(s.length(),t.length());i++){
      if(s.charAt(i)==t.charAt(i))
      identical++;
    }
    if((k<(s.length()+t.length()-2*identical)))
    System.out.println("No");
    else if((s.length()+t.length()-2*identical)%2==k%2)
    System.out.println("Yes");
    else if(s.length()+t.length()<k)
    System.out.println("Yes");
    else
    System.out.println("No");
  }
}
