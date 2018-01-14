import java.util.*;
import java.io.*;
public class Football{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String arr[]=new String[n];
        for(int i=0;i<n;i++) arr[i]=sc.next();
        int c1=0,c2=0;
        for(String x:arr){
            if(x.equals(arr[0])) c1++;
            else c2++;
        }
        if(c1>c2) System.out.println(arr[0]);
        else{
            int x=0;
            while(arr[x].equals(arr[0]))x++;
            System.out.println(arr[x]);
        }
    }
}