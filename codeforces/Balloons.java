import java.util.*;
import java.io.*;
public class Balloons{
    static int count[]=new int[26];
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        String s=sc.next();
        for(int i=0;i<s.length();i++)
          count[s.charAt(i)-'a']++;
        for(int i=0;i<26;i++){
            if(count[i]<=k) continue;
            else{
                System.out.println("NO");
                System.exit(0);
            }
        }
        System.out.println("YES");
    }
}