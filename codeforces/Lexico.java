import java.io.*;
import java.util.*;
public class Lexico{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        char arr[]=s.toCharArray();
        int last=-1;
        for(int i=122;i>=97;i--){
            for(int j=0;j<arr.length;j++){
                if(arr[j]==(char)i && j>last){System.out.print((char)i);arr[j]='#';last=j;}
            }
        }  // end of i loop
    }
}