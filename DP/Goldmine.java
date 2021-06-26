import java.io.*;
import java.util.*;

public class Main {

  public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scn = new Scanner(System.in);
    int nr = scn.nextInt();
    int nc = scn.nextInt();
    int mine[][] = new int[nr][nc];
    for (int i = 0; i < nr; i++) {
      for (int j = 0; j < nc; j++) {
        mine[i][j] = scn.nextInt();
      }
    }
    System.out.println(Goldmine(mine));
  }
  public static int Goldmine(int mine[][]) {
    int nr = mine.length;
    int nc = mine[0].length;
    int dp[][] = new int[nr][nc];
    for (int col = nc - 1; col >= 0; col--) {
      for (int row = 0; row < nr; row++) {
        if (col == nc - 1) {
          dp[row][col] = mine[row][col];
        }
        else {
          if (row == 0) {
            dp[row][col] = Math.max(dp[row][col + 1], dp[row + 1][col + 1]) + mine[row][col];
          }
          else if (row == nr - 1) {
            dp[row][col] = Math.max(dp[row][col + 1], dp[row - 1][col + 1]) + mine[row][col];
          }
          else {
              int du = (row-1>=0)?dp[row-1][col+1]:0;
              int dd = (row+1<nr)?dp[row+1][col+1]:0;

            dp[row][col] = Math.max((dp[row][col + 1]),Math.max(dd,du)) + mine[row][col];
          }
        }
      }
    }
      int max = Integer.MIN_VALUE;
      for (int i = 0; i < nr; i++) {
        max = Math.max(max, dp[i][0]);
      }
      return max;
    }
  }