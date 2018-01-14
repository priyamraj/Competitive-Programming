import java.util.*;
import java.io.*;
public class Digits{
    public static void printArr(int arr[]){
        for(Integer x:arr)
         System.out.print(x+" ");
        System.out.println();
    }
    public static long sum(int arr[]){
        long s=0;
        for(Integer x:arr)
          s+=x;
        return s;
    }
    public static void printLine(int arr[]){
        int n=arr.length;
        StringBuilder str=new StringBuilder();
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0 && i<n-1)
              {System.out.print(str.toString()+arr[i]+"+");str.setLength(0);}
            else if(arr[i]!=0 && i==n-1)
              {System.out.print(str.toString()+arr[i]);str.setLength(0);}
            if(arr[i]==0)
                str.append('0');
        }
        if(str.length()!=0){System.out.print(str);str.setLength(0);}
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s=sc.next();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
          arr[i]=s.charAt(i)-'0';
        // printArr(arr);
        long temp=sum(arr);
        //one step
        if(temp<10){
            printLine(arr);
            System.out.println(temp);
            System.out.println(temp);
            System.exit(0);
        }
        //two step
        else if(temp>=10 && temp<=99){
            printLine(arr);
            long d1=temp/10;
            long d2=temp%10;
            System.out.println(d1+"+"+d2);
            long d3=d1+d2;
            if(d3<10) System.out.println(d3);
            else System.out.println((d3/10)+"+"+(d3%10));
            System.exit(0);
        }
        else{
            printLine(arr);
            String st=Long.toString(temp);
            int digs[]=new int[st.length()];
            for(int i=0;i<digs.length;i++)
              digs[i]=st.charAt(i)-'0';
            printLine(digs);
            long sum1=sum(digs);
            if(sum1<10) System.out.println(sum1);
            else System.out.println((sum1/10)+"+"+(sum1%10));
            System.exit(0);
        }
        sc.close();
    }
}