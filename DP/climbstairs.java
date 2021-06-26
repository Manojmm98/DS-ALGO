import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        System.out.println(stairspath(n));
    }
    public static int stairspath(int n){
        int qb[]= new int[n+1];
        for(int i=0;i<=n;i++){
            // for oth stair i can climb through 1 step 
            if(i==0){
                qb[i]=1;
            }
            // for 1 stair i can jum through 1 step
            else if(i==1){
                qb[i]=1;
            }
            // for 2 stair i can jump through 1 1 twice or 2 step directly
            else if(i==2){
                qb[i]=qb[i-1]+qb[i-2];
            }
            // for more stair i can jump through 1 step or 2 steps or 3 step directly bcz i can jump directly to 3 steps at a time
            else{
                qb[i]=qb[i-1]+qb[i-2]+qb[i-3];
            }
        }
        // the answer will be  in the given n position
        return qb[n];
    }

}