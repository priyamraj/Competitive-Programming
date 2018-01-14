import java.util.*;
import java.io.*;
public class StringsLove{
    private static class Pair implements Comparable<Pair>{
        char c;
        int wt;
        Pair(char ch,int w){c=ch;wt=w;}
        public int compareTo(Pair P){
            if(this.wt>P.wt) return 1;
            else return -1;
        }
    }
        public static int weight(String s,TreeMap<Character,Integer> tmp){
            int ans=0;
            for(int i=0;i<s.length();i++)
              ans+=(i+1)*(tmp.get(s.charAt(i)));
            return ans;
        }
        static TreeMap<Character,Integer> tmp=new TreeMap<>();
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            StringBuilder str=new StringBuilder(sc.next());
            int k=sc.nextInt();
            Pair pp[]=new Pair[26];
            for(int i='a';i<='z';i++){
                int v=sc.nextInt();
                tmp.put((char)i,v);
                pp[i-'a']=new Pair((char)i,v);
            }
            Arrays.sort(pp);
            char ch=pp[25].c;
            while(k-->0) str.append(ch);
            // System.out.println(str);
            System.out.println(weight(str.toString(),tmp));
    }
}
