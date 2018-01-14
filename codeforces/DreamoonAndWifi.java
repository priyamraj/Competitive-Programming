import java.io.*;
import java.util.*;
public class DreamoonAndWifi{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String real=sc.next();
        String edited=sc.next();
        int p=0;
        for(int i=0;i<real.length();i++){
            if(real.charAt(i)=='+')
                p++;
            else
                p--;
        }
        int q=0,c=0;
        for(int i=0;i<edited.length();i++){
            if(edited.charAt(i)=='?'){
                c++;
                continue;
            }
            else if(edited.charAt(i)=='+')
                q++;
            else
                q--;
        }
        if(p==q && c==0){
            System.out.println("1.00000000");
            System.exit(0);
        }
        if(p!=q && c==0){
            System.out.println("0.00000000");
            System.exit(0);
        }
        int count=0;
        int start=0,end=(int)Math.pow(2,c)-1;
        for(int i=start;i<=end;i++){
            String s=Integer.toBinaryString(i);
            if(s.length()!=c){
                while(s.length()!=c)
                    s='0'+s;
            }
            //System.out.println("mask: "+s);
            int t=0;
            for(int j=0;j<s.length();j++){
                if(s.charAt(j)=='1')
                    t++;
                else
                    t--;
            }
            if(q+t == p)
                count++;
        }//end of for
        //System.out.println("count="+count);
        double result=(double) count/Math.pow(2,c);
        System.out.println(result);
    }
}
