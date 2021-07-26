import java.io.*;
import java.util.*;

public class Main {

  public static void main(String[] args) throws Exception {
    // here we have given a number n and prices array also a tFee is also given
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int [] prices = new int[n];
    for (int i = 0; i < prices.length; i++) {
      prices[i] = scn.nextInt();
    }
    int tFee = scn.nextInt();
    // at the first stage the intial buying stock price is 0 and selling stock price is also 0
    int obsp=0,ossp=0;
    for(int day=0;day<prices.length;day++){
        // in day 0 we have to buy stock by taking loan of prices value of at index 0 to buy that stock let in oth index prices = 10 so our buyingstockprice=-10
        if(day==0){
            obsp=-prices[0];
        }
        else{
            // when we will start from day 1 we have to find our obsp prices by comparing with obsp price
            int nbsp = Math.max(obsp,ossp-prices[day]);
            // when we will sell our stock our nssp will be maximum of old ossp and prices of that day - transaction fee + old buying stock price 
            int nssp = Math.max(ossp,prices[day]-tFee+obsp);
            // now for continue of our program set oldbuingprice as new buying price same for sell
            obsp=nbsp;
            ossp=nssp;
        }
    }
    // lastly our ossp is our answer
    System.out.println(ossp);
  }

}
