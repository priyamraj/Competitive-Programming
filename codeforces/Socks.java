import java.util.*;
import java.io.*;
public class Socks{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int mx=0;
        HashSet<Integer> hs=new HashSet<>();
        for(int i=0;i<2*n;i++){
            int k=sc.nextInt();
            if(hs.contains(k))
              hs.remove(k);
            else
              hs.add(k);
            mx=Math.max(mx,hs.size());
        }
        System.out.println(mx);
    }
}