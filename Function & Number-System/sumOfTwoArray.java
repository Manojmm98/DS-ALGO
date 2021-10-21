import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
    
    Scanner scn = new Scanner(System.in);
    
    // read array1
    int n1 = scn.nextInt();
    
    int arr1[]= new int[n1];
    
    for(int i=0;i<n1;i++){
        arr1[i]=scn.nextInt();
    }
    
    // read array2
    
    int n2 = scn.nextInt();
    
    int arr2[]= new int[n2];
    
    for(int i=0;i<n2;i++){
        arr2[i]=scn.nextInt();
    }
    
    int ans[]= sum(arr1,arr2);
    
    for(int val : ans){
        System.out.println(val);
    }
    
 }
 
 public static int[] sum(int arr1[],int arr2[]){
    
    // find length of all array 
     int n1 = arr1.length;
     int n2 = arr2.length;
     // size of resultant array will be maxium among two array
     int n3 = Math.max(n1,n2);
     
     // create resultant array
     
     int res[] = new int[n3];
     
     // as  we are adding from right(last index) to left(first) so first find out the index of element at right of the array
     
     int i = n1-1;
     
     int j = n2-1;
     
     int k= n3-1;
     
     // create a value for carry with 0 value
     
     int carry =0;
     
     // add the elemnt till index of i and j value is greater than 0 or equal to zero
     
     while(i>=0||j>=0){
         
         // find out the value at that index of i and j or if there is nothing then put 0
         
         int val1 = (i>=0)? arr1[i] : 0;
         
         int val2 = (j>=0)? arr2[j]:  0;
         
         // sum out all the value with the carry (intially carry is 0)
         
        int sum = val1+val2+carry; 
        
        // find the digit which will be our result
        
        int digit = sum%10;
        
        // update the carry value which will be carried
        
        carry = sum/10;
        
        // place our digit in res array"s kth index(righten index)
        
        res[k]=digit;
        
        // as we are comming from right(last index) decrease the size of all i,j,k
        
        i--;
        j--;
        k--;
        
     }
     
     // if carry is 0 then return our res array
     
     if(carry==0){
         return res;
     }
     else{
         // create a new array with size 1 greater than the resultant array and place carry in 0th position of it
         
         int nres[]= new int[res.length+1];
         
         nres[carry]=0;
         
         // copy the elment from the result array to new result array
         
         // as we place carry in 0th index so in 1th index of new result array 0th element of res array will be place ,, in 2th of nres 1th of res and so on nres[idx]=res[idx-1];
         
         for(int idx=1;idx<nres.length;idx++){
             
             nres[idx] = res[idx-1];
         }
         
         return nres;
         
     }
     
 }

}