import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int coins[]= new int[n];
        for(int i=0;i<n;i++){
            coins[i]=scn.nextInt();
        }
        int tar= scn.nextInt();
     System.out.println(NumberCombination(coins,tar));
    }
    public static int NumberCombination(int coins[],int tar){
        int dp[]= new int[tar+1];
        dp[0]=1;
        for(int i=0;i<coins.length;i++){
            int coin = coins[i];
            for(int j=coin;j<=tar;j++){
                dp[j]+=dp[j-coin];
            }
        }
        return dp[tar];
    }
}