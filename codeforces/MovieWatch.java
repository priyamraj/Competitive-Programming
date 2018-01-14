import java.util.*;
import java.io.*;
public class MovieWatch{
    public static class Pair{
        int start,end;
        Pair(int s,int e){start=s;end=e;}
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int moments=sc.nextInt();
        int skip=sc.nextInt();
        int last=0;
        Pair[] arr=new Pair[moments];
        for(int i=0;i<moments;i++){
            int L=sc.nextInt();
            int R=sc.nextInt();
            last=Math.max(last,R);
            arr[i]=new Pair(L,R);
        }
        int watch=0;
        int curr=1,pointer=0;
        while(curr<=last){
            int skipTo=curr+skip;
            int L=arr[pointer].start;
            int R=arr[pointer].end;
            if(skipTo>L){
                watch++;
                curr++;
                if(curr>R) pointer++;
                continue;
            }
            else{
                curr=skipTo;
                continue;
            }
        }
        System.out.println(watch);
    }
}