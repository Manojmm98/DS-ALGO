import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
    
    Scanner scn  = new Scanner(System.in);
    int n = scn.nextInt();
    int arr [] = new int[n];
    
    for(int i=0;i<n;i++){
        arr[i]=scn.nextInt();
    }
    
    // we have to find the subset of an array
    
    //if there is 3 element then the number of subset will be 3^2 = 9
    
    // if there is an arry [10,20] then we will find the number of subset and here subset is 4
    // first we will find the binary of 0 to 4 and in case of 0's we will print _ and in case of 1 we will print the number
    
    // the first loop will travel till the limit that is 2^2=4 and inner loop will print the binary value of all digit
    
    // we have to start the inner loop from backward because we have to print the digit from 0th index to last index
    
    // find the square of length of given array
    
    int limit = (int)Math.pow(2,n);
    
    // outer loop till limit
    
    for(int i=0;i<limit;i++){
        
        // store i value in temp
        int temp = i;
        
        // create a result string
        
        String res = "";
        
       // inner loop will start from last and move to first index
       for(int j=n-1;j>=0;j--){
           // find the binary of the digit at i
           
           // binary will be the reminder
           
           int r =temp%2;
           
           // decrease the value by 2 
           
           temp=temp/2;
           
           // if reminder is 0 then print dash or if reminder is 1 then print the value at that index with space separated
           
           if(r==0){
               res="-\t"+res;
           }
           else{
               res= arr[j]+"\t"+res;
           }
       }
       System.out.println(res);
    }
    
 }

}