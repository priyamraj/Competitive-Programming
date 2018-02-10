import java.util.*;
public class Sieve{
	static int max=5000007;
	public static void main(String[] args) {
		int s[]=new int[max];
		for(int i=3;i<max;i++) s[i]=1;
		s[2]=1;
	    for(int i=3;i*i<max;i+=2){
	    	for(int j=i*i;j<max;j+=i)
	    		s[j]=0;
	    }
	    
	    int n=sc.nextInt();
	    if(s[n]==1) System.out.println("prime");
	    else System.out.println("not prime");
	}
}