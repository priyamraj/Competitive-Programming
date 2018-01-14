import java.util.*;
public class KefaCompany{
    private static class pair implements Comparable<pair>{
        long money;
        long fr;
        public int compareTo(pair P){
            if(this.money>P.money)
                return 1;
            else if(this.money==P.money){
                if(this.fr>P.fr)
                    return 1;
                else
                    return -1;
            }
            else
                return -1;
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        long d=sc.nextLong();
        pair arr[]=new pair[(int)n];
        for(int i=0;i<n;i++){
            arr[i]=new pair();
            arr[i].money=sc.nextLong();
            arr[i].fr=sc.nextLong();
        }
        Arrays.sort(arr);
//        for(pair x:arr)
//            System.out.println(x.money+" "+x.fr);
        int L=0,R=0;
        long ans=0,total=0;
        for(R=0;R<arr.length;R++){
            total+=arr[R].fr;
            while(arr[R].money-arr[L].money >= d){
                total-=arr[L].fr;
                L++;
            }
            ans=Math.max(ans,total);
        }
        System.out.println(ans);
    }
}