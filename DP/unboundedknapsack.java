import java.io.*;
import java.util.*;

public class Main {

  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int value[] = new int[n];
    for (int i = 0; i < n; i++) {
      value[i] = scn.nextInt();
    }
    int weight[] = new int[n];
    for (int i = 0; i < n; i++) {
      weight[i] = scn.nextInt();
    }
    int cap = scn.nextInt();

    int dp[] = new int[cap + 1];
    // if capacity is 0 so we can put 0 weight object
    dp[0] = 0;
    // so we start from i=1 to the capacity of bag  
    for (int bagc = 1; bagc <= cap; bagc++) {
        // we have to calculate maximum so we declare maximum as 0
      int max = 0;
      // we started from putting the element from 0th index to nth index
      for (int i = 0; i < n; i++) {
          // we will check the object if it is weight is less than capacity of bag
        if (weight[i] <= bagc) {
            // the remaining bag capacity after puuting the object
          int rbagc = bagc - weight[i];
          // the value will be in the index of that
          int rbagv = dp[rbagc];
          // total bag value will be remaning bag value plus weight of i
          int totalbagv = rbagv + value[i];
// if totalbagv is greater then max then we update max as totalbagv
          if (totalbagv > max) {
            max = totalbagv;
          }
        }
      }
      // now maximum will be the last capacity of bag or max capacity
      dp[bagc] = max;
    }
    // here we print the capacity of table dp
    System.out.println(dp[cap]);
  }

}