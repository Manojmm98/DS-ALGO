import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scn=new Scanner(System.in);
    int n = scn.nextInt();
    
    int arr[]=new int[n];
    
    // span = max value-min value
    
    // take input of array
    
    for(int i=0;i<arr.length;i++){
        arr[i]=scn.nextInt();
    }
    
    // find the maximumm value in the array
    
    int max = arr[0];
    for(int i=1;i<arr.length;i++){
        if(arr[i]>max){
            max=arr[i];
        }
    }
    
    // find the minimum element of the array
    
    int min = arr[0];
    
    for(int i=1;i<arr.length;i++){
        if(arr[i]<min){
           min=arr[i]; 
        }
    }
    
    // find the span of array
    
    // span = max-min
    
    int span = max-min;
    System.out.println(span);
  
}
}



//  with  the help of functions


public static void main(String[] args) {
    // write your code here
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int arr[]= new int[n];
    for(int i=0;i<n;i++){
        arr[i]= scn.nextInt();
    }

    span(arr);
 }

 public static void span(int []arr){
    int max = Integer.MIN_VALUE;
    int min = Integer.MAX_VALUE;

// for (int i = 0; i < arr.length; i++) {

//        if(arr[i]>max){
//            max = arr[i];
//        }
//        if(arr[i]<min){
//            min = arr[i];
//        }

//            }

   for(int val : arr){
       max = Math.max(max,val);
       min = Math.min(min,val);
   }
  int diff = max-min;
  System.out.println(diff);
}
}