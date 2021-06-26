import java.io.*;
import java.util.*;

public class Main {
    
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int nr = scn.nextInt();
        int nc = scn.nextInt();
        int cost[][]= new int[nr][nc];
        for(int i=0;i<nr;i++){
            for(int j=0;j<nc;j++){
                cost[i][j]=scn.nextInt();
            }
        }
        System.out.println(minPath(cost));
    }
    public static int minPath(int cost[][]){
        int nr = cost.length;
        int nc= cost[0].length;
        // here we use 2d array because here we used thr row and col for single time and no duplicacy we can not travel col and rows multiple times
        int dp[][]= new int[nr][nc];
        for(int row=nr-1;row>=0;row--){
            for(int col=nc-1;col>=0;col--){
                if(row==nr-1&&col==nc-1){
                    dp[row][col]=cost[row][col];
                }
                else{
                    if(row==nr-1){
                        // if we are in last row we can move to front or to upper that is col+1
                        dp[row][col]=cost[row][col]+dp[row][col+1];
                    }
                    else if(col==nc-1){
                        // if we are in last coloum we can move to down that is row+1 and to front 
                        dp[row][col]=cost[row][col]+dp[row+1][col];
                    }
                    else{
                        // if we are in middle then we can move to front upper and down  ... and we take minimu from upper and down move bcz we have to calculate min traversal
                        dp[row][col]=cost[row][col]+Math.min(dp[row][col+1],dp[row+1][col]);
                    }
                }
            }
        }
        // at last answer will be in 0th row and 0th column
        return dp[0][0];
    }

}