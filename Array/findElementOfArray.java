import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scn = new Scanner(System.in);
    
    //take input of integer n
    int n = scn.nextInt();
    
    // create a new array
    int arr[]= new int[n];
    
    // take input of array
    for(int i=0;i<arr.length;i++){
        arr[i]=scn.nextInt();
    }
    // take input element of d 
    int d = scn.nextInt();
    
    // itreate through the array and if the the element d equals the array of element
    for(int i=0;i<arr.length;i++){
        if(arr[i]==d){
            // print the index
            System.out.println(i);
            return;
        }
       
    }
    // if the index not found then print -1
    System.out.println(-1);
    
 }

}