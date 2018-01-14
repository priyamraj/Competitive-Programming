import java.util.*;
import java.io.*;
public class MakeLargest{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int tc=sc.nextInt();
        while(tc-->0){
        int n=sc.nextInt();
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=0;i<n;i++)
        arr.add(sc.nextInt());
        arr.sort(new Comparator<Integer>(){
            public int compare(Integer a,Integer b){
                String A=Integer.toString(a);
                String B=Integer.toString(b);
                int AB=Integer.parseInt((A+B));
                int BA=Integer.parseInt((B+A));
                if(AB>BA)
                return -1;
                else
                return 1;
            }
        });
        for(Integer x:arr)
        System.out.print(x);
        System.out.println();
        }
    }
}