import java.util.*;
public class Rainbow{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int tc=sc.nextInt();
        while(tc-->0){
            int n=sc.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++)
              arr[i]=sc.nextInt();
            int c[]=new int[8];
            boolean b=true;
            for(Integer x:arr) {
                if(x>=8)
                  {b=false;}
                else
                  c[x]++;
            }
            
            if(b){      
            for(int i=1;i<=7;i++){
                if(c[i]==0){b=false;break;}
                else if(c[i]%2==1 && i!=7){b=false;break;}
                else continue;
              }
            }
           for(int i=1;i<arr.length;i++){
            if(arr[i]==7)
                 break;   
            if(arr[i]<arr[i-1])
                 b=false;
           }
            for(int i=arr.length-2;i>=0;i--){
            if(arr[i]==7)
                 break;   
            if(arr[i]<arr[i+1])
                 b=false;
           }
            if(b)
            System.out.println("Yes");
            else
            System.out.println("No");
            
        }
    }
}