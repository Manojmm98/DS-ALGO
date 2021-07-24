import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        
        Scanner scn=new Scanner(System.in);
        int n = scn.nextInt();
        // we created a dp of n+1 length
        int dp[]= new int[n+1];
        // if there are 1 people then he can make only one pair but if there are two people then he can make two pair
        dp[1]=1;
        dp[2] =2;
        // we start the loop when there are 3 people and lastly the answer is at nth position
        // if the 1st person dont want to go then there will be n-1 pair,and if the person will go then he will make 2 pair so dp[n-2] and the 
        //the person will make pair in n-1 ways means if there are 3 friends then if 1 wil live alone then dp[n-1] pair and if he will go then he 
        // will go then he will go with 2 and 3 respectively so total will be 3-1*dp[3-2]  means
        // dp[n]=dp[n-1]+(n-1)*dp[n-2]
        for(int i=3;i<=n;i++){
            dp[i]=dp[i-1]+dp[i-2]*(i-1);
        }
        System.out.println(dp[n]);
    }

}