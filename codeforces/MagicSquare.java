import java.util.*;
import java.io.*;
import java.math.*;
public class MagicSquare{
    public static boolean checkCol(int arr[][],int c,long s){
        long v=0;
        for(int i=1;i<arr.length;i++)
            v+=arr[i][c];
        if(v==s) return true;
        return false;
    }
    public static boolean checkRow(int arr[][],int r,long s){
        long v=0;
        for(int i=1;i<arr.length;i++)
            v+=arr[r][i];
        if(v==s) return true;
        return false;
    }
    public static boolean checkLeft(int arr[][],long s){
        long v=0;
        for(int i=1;i<arr.length;i++)
            v+=arr[i][i];
        if(v==s) return true;
        return false;
    }
    public static boolean checkRight(int arr[][],long s){
        long v=0;
        for(int i=1;i<arr.length;i++)
            v+=arr[i][arr.length-i];
        if(v==s) return true;
        return false;
    }
    public static void main(String[] args) {
        MyScanner sc=new MyScanner();
        int n = sc.nextInt();
        if (n == 1) {
            System.out.println(1);
            System.out.close();
            return;
        }
        long[][] data = new long[n][n];
        long[] row = new long[n];
        int xi = -1;
        int xj = -1;
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j) {
                data[i][j] = sc.nextInt();
                row[i] += data[i][j];
                if (data[i][j] == 0) {
                    xi = i;
                    xj = j;
                }
            }
        }
        long sum = (xi == 0) ? row[1] : row[0];
        long value = sum - row[xi];
        data[xi][xj] =  value;
        row = new long[n];
        long[] col = new long[n];
        long diag1 = 0, diag2 = 0;
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j) {
                row[i] += data[i][j];
                col[j] += data[i][j];
                if (i == j) {
                    diag1 += data[i][j];
                }
                if (i + j == n - 1) {
                    diag2 += data[i][j];
                }
            }
        }
        boolean ok = (diag1 == sum) && (diag2 == sum) && (value > 0);
        for (int i = 0; i < n; ++i) {
            ok &= (row[i] == sum) && (col[i] == sum);
        }
        if (ok) {
            System.out.println(value);
        } else {
            System.out.println(-1);
        }
    }


    private static class MyScanner {
      BufferedReader br;
      StringTokenizer st;

      public MyScanner() {
         br = new BufferedReader(new InputStreamReader(System.in));
      }

      String next() {
          while (st == null || !st.hasMoreElements()) {
              try {
                  st = new StringTokenizer(br.readLine());
              } catch (IOException e) {
                  e.printStackTrace();
              }
          }
          return st.nextToken();
      }

      int nextInt() {
          return Integer.parseInt(next());
      }

      long nextLong() {
          return Long.parseLong(next());
      }

      double nextDouble() {
          return Double.parseDouble(next());
      }

      String nextLine(){
          String str = "";
	  try {
	     str = br.readLine();
	  } catch (IOException e) {
	     e.printStackTrace();
	  }
	  return str;
      }
   }
}