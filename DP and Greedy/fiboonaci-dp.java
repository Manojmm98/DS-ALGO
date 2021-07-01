import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    System.out.println(fibT(n));
 }
 public static int fibT(int n){
     // created qb as table of n+1 length
     int qb[]= new int[n+1];
     // we have to travel all values of n so we start from 0 to n
    for(int i=0;i<=n;i++){
        // in the 0th column we put 0 and in 1 we put 1 as base case
        if(i==0){
            qb[i]=0;
        }
        else if(i==1){
            qb[i]=1;
        }
        // fibbonaci is the sum of prvs two means 1 2 then 3(1+2) will come  will come so we (1==3-2,,2==3-1) so we did i-1 and i-2
        else{
            qb[i]=qb[i-1]+qb[i-2];
        }
    }
    return qb[n];
 }
}