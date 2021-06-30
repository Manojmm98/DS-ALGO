import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        // we are given to fill n*m height width of floor to fill with tiles
        int n = scn.nextInt();
        int m = scn.nextInt();
        // we created a array of n+! length
        int dp[]= new int[n+1];
        for(int i=0;i<=n;i++){
            // if i==0 means we are in 0th index then i can fill with 1 tiles
            if(i==0){
                dp[i]=1;
            }
            // when i which reprents the number of tiles is less than the width then we can fill it through one way and thst is horizontaly
            else if(i<m){
                dp[i]=1;
            }
            // if the tile length and and floor length equal then we can place it through horizentally or vertically means 2 ways
            else if(i==m){
                dp[i]=2;
            }
            // when the no of tiles is grater than then we can fill through below ways
            else{
                dp[i]=dp[i-m]+dp[i-1];
            }
        }
      System.out.println(dp[n]);
    }
}
