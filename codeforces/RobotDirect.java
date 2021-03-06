import java.util.*;
import java.io.*;
import java.math.*;
public class RobotDirect{
    static int[] dr = new int[]{-1, 1, 0, 0};
    static int[] dc = new int[]{0, 0, -1, 1};
    public static int rec(int[] meaning, boolean[] used, String cmds, int height, int width, String[] field, int sr, int sc, int at) {
      if (at == 4) {
        if (valid(meaning, cmds, height, width, field, sr, sc)) return 1;
        else return 0;
      }
      int res = 0;
      for (int i = 0; i < 4; ++i)
        if (!used[i]) {
          meaning[at] = i;
          used[i] = true;
          res += rec(meaning, used, cmds, height, width, field, sr, sc, at + 1);
          used[i] = false;
        }
      return res;
  }

    public static boolean valid(int[] meaning, String cmds, int height, int width, String[] field, int sr, int sc) {
      for (char ch : cmds.toCharArray()) {
        int what = meaning[ch - '0'];
        sr += dr[what];
        sc += dc[what];
        if (sr < 0 || sr >= height || sc < 0 || sc >= width || field[sr].charAt(sc) == '#') return false;
        if (field[sr].charAt(sc) == 'E') return true;
      }
      return false;
  }

    public static void main(String[] args) {
      MyScanner in=new MyScanner();
      int height = in.nextInt();
      int width = in.nextInt();
      String[] field = new String[height];
      for (int row = 0; row < height; ++row) {
          field[row] = in.next();
      }
      int sr = -1;
      int sc = -1;
      for (int r = 0; r < height; ++r) {
          for (int c = 0; c < width; ++c) {
              if (field[r].charAt(c) == 'S') {
                  sr = r;
                  sc = c;
              }
          }
      }
      String cmds = in.next();
      boolean[] used = new boolean[4];
      int[] meaning = new int[4];
      System.out.println(rec(meaning, used, cmds, height, width, field, sr, sc, 0));
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