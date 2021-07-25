import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        // take input of integer n and array prices
        int n = scn.nextInt();
        int prices[] = new int[n];
        for (int i = 0; i < n; i++){
            prices[i] =scn.nextInt();
        }
        // at the first day our currentprofit and overallprofit is 0 and we are sarting from day 
        // the profit will be calculated by diffrentating the prices of current day that we are buying and the previous day 
        // here the profit will be calculated diffrentating by prices of that and the buyday that we have set
        int overallprofit=0,currentprofit=0,buyday=0;
        for (int day = 0; day<prices.length; day++){
            // if the prices of that day is less than the prices of the previous day that we have set as our buyday then here we can not buy
            // because we are facing loss here so update only the buyday 
            if(prices[day]<prices[buyday]){
                buyday=day;
            }
            // if the prices of current day is greater than the prices of the buyday then we will buy here profit will be 
            // prices of that day and prices of buyday
            else{
                currentprofit=prices[day]-prices[buyday];
            }
            // lastly update the overallprofit  if currentprofit is greater than the overallprofit and print overallprofit
            if(currentprofit>overallprofit){
                overallprofit=currentprofit;
            }
        }
        System.out.println(overallprofit);
    }
}