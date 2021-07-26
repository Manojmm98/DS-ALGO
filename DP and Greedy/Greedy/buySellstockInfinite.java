import java.io.*;
import java.util.*;

public class Main {

  public static void main(String[] args) throws Exception {
    
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int [] prices = new int[n];
    for (int i = 0; i < prices.length; i++) {
      prices[i] = scn.nextInt();
    }
    // intially buyingpoint sellpoint and profit is 0
    // we will start from day 1 as the profit of 0th day is 0
    // when the stock increasing we have to only move our selling point and on peek we will calculated our profit where the sp is less than the buying point 
    // when the stock is decreasing the sp is always less than the buying point so profit is 0 all time so here just update buyingpoint and sellpoint as with day value
    // for every time we also have to add our profit the total profit will be addition of all phase
    int profit = 0, sp = 0, bp = 0;
    for (int day = 1; day < prices.length; day++) {
      if (prices[day] >= prices[day - 1]) {
        sp = day;
      }
      else {
        profit += prices[sp] - prices[bp];
        sp=day;
        bp=day;
      }
    }
    // here there will be an edge cases when at the last we have to calculate our profit and that will be our overallprofit
    profit += prices[sp] - prices[bp];

    System.out.println(profit);
  }

}
