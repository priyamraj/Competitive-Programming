import java.util.*;
import java.io.*;
public class Chessboard{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        char arr[][]=new char[100][100];
        for(int i=0;i<100;i++){
            char f,s;
            if(i%2==0){f='B';s='W';}
            else{f='W';s='B';}
            for(int j=0;j<100;j++){
               if(j%2==0) arr[i][j]=f;
               else arr[i][j]=s;
            }
        }
        char inp[][]=new char[n][m];
        for(int i=0;i<n;i++)
          inp[i]=(sc.next()).toCharArray();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(inp[i][j]!='-')
                  System.out.print(arr[i][j]);
                else
                  System.out.print(inp[i][j]);
            }
            System.out.println();
        }
    }
}