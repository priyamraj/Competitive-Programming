import java.util.*;
import java.io.*;
public class King{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String source=sc.next();
        String dest=sc.next();
        int sx=source.charAt(0)-'a',sy=source.charAt(1)-'1';
        int dx=dest.charAt(0)-'a',dy=dest.charAt(1)-'1';
        int moves=0;
        ArrayList<String> mv=new ArrayList<>();
        while(sx!=dx || sy!=dy){
            if(sy==dy && sx<dx){mv.add("R");moves++;sx++;}
            else if(sy==dy && sx>dx){mv.add("L");moves++;sx--;}
            else if(sx==dx && dy>sy){mv.add("U");moves++;sy++;}
            else if(sx==dx && dy<sy){mv.add("D");moves++;sy--;}
            else if(sx<dx && sy<dy){mv.add("RU");moves++;sx++;sy++;}
            else if(sx>dx && sy>dy){mv.add("LD");moves++;sx--;sy--;}
            else if(sx>dx && sy<dy){mv.add("LU");moves++;sx--;sy++;}
            else if(sx<dx && sy>dy){mv.add("RD");moves++;sx++;sy--;}
        }
        System.out.println(moves);
        for(String x:mv)
          System.out.println(x);
    }
}