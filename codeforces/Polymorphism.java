import java.util.*;
import java.io.*;
public class Polymorphism{
    public static void test(int a,int b){
        System.out.println("int,int");
    }
    public static void test(int a,long b){
        System.out.println("int,long");
    }
    public static void test(int a,float b){
        System.out.println("int,float");
    }
    public static void test(int a,double b){
        System.out.println("int,double");
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        test(1,1);
        test(1,1.3F);
        test(1,4L);
    }
}