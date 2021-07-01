import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        // we take input of number of house and colors n=house c=colors
        int n = scn.nextInt();
        int c= scn.nextInt();
        // we created 2d array and take input from that
        int[][] arr = new int[n][c];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                arr[i][j]=scn.nextInt();
            }
        }
        // 1st we celare one least value and another secondleast value
        int least=Integer.MAX_VALUE;
        int secondleast=Integer.MAX_VALUE;
        // we created a new array which is of row and coloum length
        int dp[][]= new int[arr.length][arr[0].length];
        // loop will continue till all the colums
        for(int j=0;j<arr[0].length;j++){
            // for 1st row the values of all colum are given so we just take the value as as oth row jth colum  arr[0][j]
            dp[0][j]=arr[0][j];
            // if the value in that coloum is less than the least value then we update least= secondleast and the value in that collum as least value
            if(arr[0][j]<=least){
                secondleast=least;
                least=arr[0][j];
            }
            // otherwise if the the value at that colum is less than the secondleast value so secondleast value is equal to the value at that coloum
            else if(arr[0][j]<=secondleast){
                secondleast=arr[0][j];
            }
        }
        // now the work from 1st row is done means the value of 1st row is given to us we took input from that row
        // now here we start the loop from i=1 to the length of that array we created ==dp[][] and coloum from 1st rows coloum to end
    for(int i=1;i<dp.length;i++){
        // here we also declare newleast and newsecondleast
         int newleast=Integer.MAX_VALUE;
        int newsecondleast=Integer.MAX_VALUE;
         for(int j=0;j<arr[0].length;j++){
            if(least==dp[i-1][j]){
                // now the value at current i&j isless than the previous rows value   then dp[i][j] means value at the current box will be equal to 
                // sum of secondleast+value at that box
               dp[i][j]=secondleast+arr[i][j];
            }
            else{
                // otherwise the value at current i&j is equal to the sum of laest and arr[i][j]
                dp[i][j]=least+arr[i][j];
            }
    if(dp[i][j]<=newleast){
        // if the value we got is less than the newleast then newsecondlist become newleast and newleast become the value at that box ot that i and j
        newsecondleast=newleast;
        newleast=dp[i][j];
    }
    // otherwise the value at that box is equal to newsecondleast
    else if(dp[i][j]<=newsecondleast){
        newsecondleast=dp[i][j];
    }
         }
         // lastly update the newleast as the oveallleast and newsecondleast as the newsecondleast
    least=newleast;
    secondleast=newsecondleast;
    }
    //lastly we have to find the minimum value so we print the least value
    System.out.println(least);
}
}

