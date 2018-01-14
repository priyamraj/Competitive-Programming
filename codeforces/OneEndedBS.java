import java.util.*;
public class OneEndedBS{
    public int bsearch(int arr[],int L,int H,int key){
        int mid=L+(H-L)/2;
        if(arr[mid]==key)
        return mid;
        else if(arr[mid]>key)
        return bsearch(arr, L, mid-1, key);
        else
        return bsearch(arr, L=mid+1, H, key);
    }
    public  void index(int arr[],int key){
        int L=0,H=1;
        int val=arr[H];
        while(key>val){
            L=H;
            H*=2;
            val=arr[H];
        }
        int ind=bsearch(arr,L,H,key);
        System.out.println("def:"+Arrays.binarySearch(arr, L, H+1, key));
        System.out.println(ind);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[5000000];
        for(int i=0;i<arr.length;i++)
        arr[i]=i;
        System.out.println("Enter the no. of test cases");
        int tc=sc.nextInt();
        while(tc-->0){
            int key=sc.nextInt();
            (new OneEndedBS()).index(arr, key);
        }
    }
}