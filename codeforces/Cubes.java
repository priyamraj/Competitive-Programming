import java.util.*;
import java.io.*;
public class Cubes{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
          arr[i]=sc.nextInt();
        if(n%2==1){
          for(int i=0;i<n;i++){
            if(i%2==0)
              System.out.print(arr[n-1-i]+" ");
            else
              System.out.print(arr[i]+" ");
           }
        }
        else{
            for(int i=0;i<n;i++){
            if(i%2==0 && i<n/2)
              System.out.print(arr[n-1-i]+" ");
            else if(i%2==1 && i<n/2)
              System.out.print(arr[i]+" ");
            else if(i%2==0 && i>=n/2)
              System.out.print(arr[i]+" ");
            else
              System.out.print(arr[n-1-i]+" ");
           }
        }
    }
}