import java.util.*;
import java.io.*;
public class TripletSum{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
         arr[i]=sc.nextInt();
        Arrays.sort(arr);
        for(int i=0;i<n-2;i++){
            int left=i+1;
            int right=n-1;
            while(left<right){
                int sum=arr[i]+arr[left]+arr[right];
                if(sum==k){System.out.println(arr[i]+" "+arr[left]+" "+arr[right]);break;}
                if(sum<k)
                  left++;
                else
                  right--;
            }
        }
    }
}