import java.util.*;
import java.io.*;
public class AryaBran{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int arr[]=new int[n];
        int carry=0;
        for(int i=0;i<n;i++){
            int t=sc.nextInt();
            int c=t+carry;
            if(c>=8){
                arr[i]=8;
                carry=c-8;
            }
            else{
                arr[i]=c;
                carry=0;
            }
        }
        int ans=0;
        int s=0;
        for(int i=0;i<n;i++){
            s+=arr[i];
            if(s>=k)
            {ans=i+1;break;}
        }
        if(ans==0)
        System.out.println(-1);
        else
        System.out.println(ans);

        // for(Integer x:arr)
        //    System.out.println("debug:"+x);
        // System.out.println("debug:"+carry);
    }
}