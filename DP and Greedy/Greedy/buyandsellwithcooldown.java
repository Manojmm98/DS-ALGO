import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int prices[]=new int[n];
        for(int i =0;i<prices.length;i++){
            prices[i]=scn.nextInt();
        }
        int obsp=0,ossp=0,ocsp=0;
        for(int day=0;day<prices.length;day++ ){
            if(day==0){
                // in the intial stste we have to take loan of the ammount that we have to buy so the buying prices will be negative of the index at 0th state
                obsp=-prices[0];
            }
            else{
                // we will buy stock first so new buying prices wil maximum of obsp and diffrent between cooldownprice and currentprice
                int nbsp=Math.max(obsp,ocsp-prices[day]);
                // after we brought we will sell is with maximum profit so selling price will be maximum oldssp and prices of day and our buying prices
                int nssp=Math.max(ossp,prices[day]+obsp);
                // the cool down will occur after one day of sell so cool down is the previous sell price
                int ncsp=ossp;


                obsp=nbsp;
                ossp=nssp;
                ocsp=ncsp;
            }
        }
        // at the the maximu sell price is our profit
        System.out.println(ossp);
    }

}
