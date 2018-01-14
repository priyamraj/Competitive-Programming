import java.util.*;
import java.io.*;
public class Polyhedrons{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        HashMap<String,Integer> hs=new HashMap<>();
        hs.put("Tetrahedron", 4);
        hs.put("Cube", 6);
        hs.put("Octahedron", 8);
        hs.put("Dodecahedron", 12);
        hs.put("Icosahedron", 20);
        int n=sc.nextInt();
        int ans=0;
        while(n-->0){
            String s=sc.next();
            ans+=hs.get(s);
        }
        System.out.println(ans);
        sc.close();
    }
}