import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn=new Scanner(System.in);
        int n = scn.nextInt();
        int dp[]= new int[n+1];
        // we created a dp matrix of n+1 index and in 0th index and in 1st index we put 0 and 1 
        // dp[0] =1 beacuse for reaching 0th position we took one path at least and in 0th position we return 1
        // in dp[1]=1 in 1st place we fill up in 1 way either verticaly or horizontaly
        dp[0]=1;
        dp[1] =1;
        // or we can also write
        
        

        // dp[1] =1;
        // dp[2] =2;



        // after 0 and 1 index we can put the tiles in the sum of i-1 and i-2 ways 
        // let here i=2 so dp[2-1]=dp[1]=1,dp[0]=1,-------> dp[i]=1+1=2 and so on
        for(int i=2;i<=n;i++){
            
           dp[i]=dp[i-1]+dp[i-2];
        }
        // at last the answer will be in the nth position 
        System.out.println(dp[n]);

    }
}
