import java.io.*;
import java.util.*;
public class DivByEight{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String num=sc.next();
        char n[]=num.toCharArray();
        int arr[]=new int[n.length];
        for(int i=0;i<n.length;i++)
          arr[i]=n[i]-'0';
        HashSet<Integer> hs=new HashSet<>();
        for(int i=8;i<100;i+=8)
          hs.add(i);
        int len=arr.length;
        for(int i=0;i<len;i++){
            if(arr[i]==8){
                System.out.println("YES");
                System.out.println(8);
                System.exit(0);
            }
            else if(arr[i]==0){
                System.out.println("YES");
                System.out.println(0);
                System.exit(0);
            }
        }
        if(len<3 && hs.contains(Integer.parseInt(num))){
            System.out.println("YES");
            System.out.println(num);
            System.exit(0);
        }
        if(len<3 && !hs.contains(Integer.parseInt(num))){
            System.out.println("NO");
            System.exit(0);
        }
        for(int i=0;i<len-2;i++){
             if(arr[i]==0){
                System.out.println("YES");
                System.out.println(0);
                System.exit(0);
                }
            if(arr[i]==0)
            continue;
            if(arr[i]==8){
                System.out.println("YES");
                System.out.println(8);
                System.exit(0);
                }
            for(int j=i+1;j<len-1;j++){
                if(arr[j]==0){
                System.out.println("YES");
                System.out.println(0);
                System.exit(0);
                }
                for(int k=j+1;k<len;k++){
                    if(arr[k]==0){
                      System.out.println("YES");
                      System.out.println(0);
                      System.exit(0);
                     }
                    int v1=arr[i]*100+arr[j]*10+arr[k];
                    if(v1%8==0){
                        System.out.println("YES");
                        System.out.println(v1);
                        System.exit(0);
                    }
                    int v2=arr[i]*10+arr[j];
                    if(v2%8==0){
                        System.out.println("YES");
                        System.out.println(v2);
                        System.exit(0);
                    }
                    int v3=arr[j]*10+arr[k];
                    if(v3%8==0){
                        System.out.println("YES");
                        System.out.println(v3);
                        System.exit(0);
                    }
                    if(arr[i]==8||arr[j]==8||arr[k]==8){
                        System.out.println("YES");
                        System.out.println(8);
                        System.exit(0);
                    }
                    int v4=arr[i]*10+arr[k];
                    if(v4%8==0){
                        System.out.println("YES");
                        System.out.println(v4);
                        System.exit(0);
                    }
                    if(arr[i]==8||arr[j]==8||arr[k]==8){
                        System.out.println("YES");
                        System.out.println(8);
                        System.exit(0);
                    }
                }//end of k
                if(arr[i]==8||arr[j]==8){
                        System.out.println("YES");
                        System.out.println(8);
                        System.exit(0);
                    }
            }//end of  j
        }//end of i
        System.out.println("NO");
    }
}