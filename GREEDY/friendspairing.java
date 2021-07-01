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
        for(int i=3;i<=n;i++){
            dp[i]=dp[i-1]+dp[i-2]*(i-1);
        }
        System.out.println(dp[n]);
    }

}