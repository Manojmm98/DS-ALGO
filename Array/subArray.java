import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
    
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int arr[] = new int [n];
    
    for(int i=0;i<n;i++){
        arr[i]=scn.nextInt();
    }
    
    // we have to print all subarrys so subarrys will be
    
//     ABCD --->
//     A,   
//     AB,  B,                  TOTAL NUMBER--> n(n+1)/2 --> n=4 -->4*3/2=12/2=6
//     ABC, BC, C
//     ABCD BCD CD, D
//  

    // continue a for loop for index 0 to the length of array
    // the inner for loop is runs for n number of times and starting from i
    
    // outer for loop
    for(int i=0;i<n;i++){
    // inner for loop
    for(int j=i;j<n;j++){
        
        // now print all the value from i to j
        // start the loop from i to j
        // here we are going till jth index and we have to print jth index also so go till k<=j 
        for(int k=i;k<=j;k++){
        
        System.out.print(arr[k]+"\t");
        }
    // move to next line
    System.out.println();
    } 
    
    }
    
}

}