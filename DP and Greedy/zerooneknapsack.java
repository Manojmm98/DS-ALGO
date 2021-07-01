import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        // we took input as n from user and we filled the array for values and weight which is of n length
        int n= scn.nextInt();
        int value[]= new int[n];
        for(int i=0;i<n;i++){
            value[i]=scn.nextInt();
        }
        int weight[]= new int[n];
        for(int i=0;i<n;i++){
            weight[i]=scn.nextInt();
        }
      int cap= scn.nextInt();
      System.out.println(zeroOneknapsack(value,weight,cap));
    }
    public static int zeroOneknapsack (int value[],int weight[],int cap){
        // we created atable of length weight+1 and capacity+1 bcz we start it from 0th row and coloum
        int dp[][]= new int[weight.length+1][cap+1];
        // in 0th row and col there will be 0 so we will start it from index 1 and goes till length of weight array 
        for(int i=1;i<=weight.length;i++){
        // here we find the value and weight from weight and value array as we start the loop from 1th index so weight and values will be corresponds to 1 idex previous   
        int wts=weight[i-1];
        int val= value[i-1];
        // we move from j=1 to capacity that given
        for(int j=1;j<=cap;j++){
            // if we exclude then then value will not added only the previous rows value is updated and if we include the value then 1st we check if the value at that index is greater than the weight or not means if we have capacity of 1 but weight is 2 then we add value and value after contribution of weight 
           int exc = dp[i-1][j];
           int inc = (j-wts>=0)?(val+dp[i-1][j-wts]):0;
           // final result will be maximum between exc and inc
           dp[i][j]=Math.max(exc,inc);
        }
        
        }
        // lastly our answer is at last coloum so we return it we start from 0 and we created the dp as wt+1 and cap+1 so ans is on cap and weigthth index
    return dp[weight.length][cap];
    }
}
