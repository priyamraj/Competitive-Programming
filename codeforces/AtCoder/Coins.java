import java.util.*;
import java.io.*;
class Coins{
    static long countWays(int S[], int W[], int m, int n)
    {
        long[] table = new long[n+1];
         Arrays.fill(table, 0);  
        table[0] = 1;
        for (int i=0; i<m; i++)
            for(int w=1;w<=W[i];w++)
            for (int j=S[i]; j<=n; j++)
                if(j-w*S[i] >=0)
                table[j] += table[j-w*S[i]];
 
        return table[n];
    }
 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int x=sc.nextInt();
        int S[]={500,100,50};
        int W[]={a,b,c};
        System.out.println(countWays(S, W, S.length, x));
    }
}