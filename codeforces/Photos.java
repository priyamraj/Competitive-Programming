import java.util.*;
import java.io.*;
public class Photos{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String s=sc.next();
    HashSet<String> hs=new HashSet<>();
    for(int i=0;i<=s.length();i++){
      for(int j='a';j<='z';j++){
        char c=(char)j;
        hs.add(s.substring(0,i)+c+s.substring(i));
      }
    }
    System.out.println(hs.size());
  }
}
