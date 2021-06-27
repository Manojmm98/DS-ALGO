import java.io.*;
import java.util.*;

public class Main {

  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int coins[] = new int[n];
    for (int i = 0; i < n; i++) {
      coins[i] = scn.nextInt();
    }
    int tar = scn.nextInt();
    boolean res = tarsumsubset(coins, tar);
    System.out.println(res);
  }
  public static boolean tarsumsubset(int coins[], int tar) {
    int n = coins.length;
    boolean dp[][] = new boolean[n + 1][tar + 1];
    for (int i = 0; i <= n; i++) {
      for (int j = 0; j <= tar; j++) {
        if (i == 0 && j == 0) {
          dp[i][j] = true;
        }
        else {
          if (i == 0) {
            dp[i][j] = false;
          }
          else if (j == 0) {
            dp[i][j] = true;
          }
          else {
            int coin = coins[i - 1];
            boolean inc = dp[i - 1][j];
            boolean exc = (j - coin >= 0) ? dp[i - 1][j - coin] : false;
            dp[i][j] = inc || exc;
          }
        }
      }
    }
    return dp[n][tar];

  }
}