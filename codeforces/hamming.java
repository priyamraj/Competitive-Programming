import java.util.*;
import java.io.*;
public class hamming{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int tc=sc.nextInt();
    while(tc-->0){
      String s=sc.next();
      int ham=sc.nextInt();
      char c[]=s.toCharArray();
      int end=s.length()-1;
      int L=s.length();
      for(int i=0;i<L;i++){
        if(ham==0)
        break;
        if(c[i]!='a'){ham--;c[i]='a';}
      }
      if(ham==0){
        System.out.println(new String(c));
        continue;
      }
      else{
        for(int i=end;i>=0;i--){
          if(ham==0)
          break;
          if(c[i]=='a'){ham--;c[i]=='b';}
        }
        System.out.println(new String(c));
      }
    }
  }
}
