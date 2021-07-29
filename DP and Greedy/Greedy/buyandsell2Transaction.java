import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        /
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int prices[]= new int[n];
        for(int i=0;i<n;i++){
            prices[i]=scn.nextInt();
        }
        // the maximum profit if it is sold today is 0 intially and we have to compare with the oth index value always 
        // here we aretraversing from left to right so our leastsofar always the index at 0th index
        int mpst=0;
        // we declare our 1st minimum value as the oth index value
        int leastsofar=prices[0];
        // we have to compare the maximu profit till so we are creating an array which is of size equal to the length of array
        int dpl[]= new int[prices.length];
        // we are starting from 1st index as in 0th index our profit is always 0
        for(int i=1;i<prices.length;i++){
            // if the value at the index is less then the minimum value then update it
            if(prices[i]<leastsofar){
                //we have to compare with the least value always so if the value at the index is less than the least value then update it
             leastsofar=prices[i];   
            }
            // now the maximum profit will be calculated by diffrentiating the value at that index with the lowest value
            mpst=prices[i]-leastsofar;
            // we have calculated the ,maximu profit till now so we have to check if the mpst is greater than the previous index or not if yest then 
            // update the dp[i] with the maximum profit value
            if(mpst>dpl[i-1]){
                dpl[i]=mpst;
            }
            // if the mpst is less then previous index of dp then update dp[i]=dpl[i-1]
            else{
                dpl[i]=dpl[i-1];
            }
        }
        // here the maximum buying profit is 0 at the begning
        // here we are checking the maximum value at the right because we are traversing from right to left
        int mpbt=0;
        // our 1st maximum value is the value at the last index 
        int maxatright=prices[prices.length-1];
        int dpr[]=new int[prices.length];

        for(int i=prices.length-2;i>=0;i--){
            // if we found  a value at the index is greater than the maximum value on right the update maximu value at right as index of i
           if(prices[i]>maxatright) {
               maxatright=prices[i];
           }
           //the maximum profit by buying will be the difference between maxbuyvalue at right and the value at that index
           mpbt=maxatright-prices[i];
           // we have to find the maximum buy value till noe we always have to compare with the next value so it will be dp[i+1]
           if(mpbt>dpr[i+1]){
               dpr[i]=mpbt;
           }
           else{
               dpr[i]=dpr[i+1];
           }
        }
        int op=0;
        // at last the result will be the sum of dp of left and right
        for(int i=0;i<prices.length;i++){
            if(dpl[i]+dpr[i]>op){
                op=dpl[i]+dpr[i];
            }
        }
        System.out.println(op);
    }

}
