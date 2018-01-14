import java.util.*;
import java.io.*;
public class MaxEvenLength{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String[] arr=str.split(" ");
        String ans="";
        boolean b=false;
        for(String x:arr){
            if(x.length()%2==0 && x.length()>ans.length()){
                ans=x;
                b=true;
            }
        }
        if(!b)
        System.out.println("00");
        else
        System.out.println(ans);
    }
}