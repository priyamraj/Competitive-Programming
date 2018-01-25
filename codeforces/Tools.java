import java.util.*;
import java.io.*;
import java.math.*;
public class Tools{
    static final int MAX=5007;
    static final int MOD=1000000007;
    static int ncr[][]=new int[MAX][MAX];
    static int fact[]=new int[MAX];
    private static class P implements Comparable<P>{
        int x,y;
        public P(int x,int y){
            this.x=x;
            this.y=y;
        }
        public int compareTo(P p){
            if(x<p.x) return -1;
            else return 1;
        }
    }
    public static boolean isPrime(int n){
        BigInteger b=new BigInteger(Integer.toString(n));
        return b.isProbablePrime(10);
    }
    public static void makeFact(){
        fact[0]=1;
        for(int i=1;i<MAX;i++){
            fact[i]=(i%MOD *fact[i-1]%MOD)%MOD;
        }
    }
    public static void makeNcr(){
        ncr[0][0]=1;
        for(int i=1;i<MAX;i++){
            ncr[i][0]=1;
            for(int j=1;j<=i;j++){
                ncr[i][j]=(ncr[i-1][j-1]%MOD +ncr[i-1][j]%MOD) % MOD;
            }
        }
    }
    public static long gcd(long a,long b){
        if(a==1||b==1) return 1;
        if(a%b==0) return b;
        return gcd(b,a%b);
    }
    public static void fillRotation1(Pt p){
        set1.clear();
        int X=p.x,Y=p.y,A=p.a,B=p.b;
        int tx=X,ty=Y;
        for(int i=0;i<4;i++){
            set1.add(new Pair(tx,ty));
            int _tx=A+B-ty;
            int _ty=B-A+tx;
            tx=_tx;
            ty=_ty;
        } 
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        makeFact();
        makeNcr();
    }
} 