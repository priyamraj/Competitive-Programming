import java.util.*;
import java.io.*;
public class Sales{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int tv=sc.nextInt();
        int m=sc.nextInt();
        int ans=0;
        int arr[]=new int[tv];
        for(int i=0;i<tv;i++)
          arr[i]=sc.nextInt();
        Arrays.sort(arr);
        int v=0;
        for(int i=0;i<m;i++){
            v-=arr[i];
            ans=Math.max(ans,v);
        }
        System.out.println(ans);
    }
}