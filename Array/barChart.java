import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code her
    
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int arr[]= new int[n];
    for(int i=0;i<n;i++){
      arr[i]=scn.nextInt();   
    }
    
    // assume that it a building so we have to find out floor which have maximum height
    
    // find out the maximum floor 
    
    int max =arr[0];
    for(int i=1;i<arr.length;i++){
        if(arr[i]>max){
            max=arr[i];
        }
    }
    
    // now start the loop from maxium floor and go till 1st floor 
    // if it is 1th floor then there will be 1 building then if it is 2 then will be 2 bulding ,for 3 floor 3 building and so on 
    // if there will be bulding then print star otherwise print space
   
    for(int floor=max;floor>=1;floor--){
        for(int building=0;building<arr.length;building++){
            
            // if the building length is greater than or equal to floor then there will be star
            if(arr[building]>=floor){
                System.out.print("*\t");
            }
            else{
              System.out.print("\t");
  
            }
        }
        System.out.println();
    }
    
 }

}