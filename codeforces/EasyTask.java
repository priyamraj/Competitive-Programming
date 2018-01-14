import java.util.*;
import java.io.*;
public class EasyTask{
    static int X[]={-1,1,0,0};
    static int Y[]={0,0,-1,1};
    public static boolean isValid(char arr[][],int r,int c){
        int count=0;
        for(int i=0;i<4;i++){
            if(r+X[i]<arr.length && r+X[i]>=0 && c+Y[i]<arr.length && c+Y[i]>=0)
            if(arr[r+X[i]][c+Y[i]]=='o')
            count++;
        }
        if(count%2==0)
        return true;
        return false;
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        char arr[][]=new char[n][n];
        for(int i=0;i<n;i++)
          arr[i]=(sc.next()).toCharArray();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(!isValid(arr, i, j)){
                    System.out.println("NO");
                    System.exit(0);
                }
            }
        }
        System.out.println("YES");
    }
}