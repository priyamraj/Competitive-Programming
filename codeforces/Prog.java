import java.util.*;
import java.io.*;
public class Prog{
    public static void main(String[] args)throws Exception {
        Scanner sc=new Scanner(System.in);
        String begin=sc.next();
        begin=begin.substring(0,begin.length()-1);
        String end=sc.next();
        System.out.println(begin+" "+end);
    }
}