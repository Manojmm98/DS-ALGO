import java.io.*;
import java.util.*;

public class Main{
  public static void display(int[] a){
    StringBuilder sb = new StringBuilder();

    for(int val: a){
      sb.append(val + "\n");
    }
    System.out.println(sb);
  }

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    int[] a = new int[n];
    for(int i = 0; i < n; i++){
       a[i] = Integer.parseInt(br.readLine());
    }

    int[] nge = solve(a);
    display(nge);
 }

 public static int[] solve(int[] arr){
     
   //calculate length of array--> will be length og given array

   int n = arr.length;

   // create newarray to store our answer

   int newArray[]= new int[n];
   
   // place -1 in the last index of newArray
   
    newArray[n-1]=-1;
    
    // create a stack and push the last element of the array into the stack
    
    Stack<Integer> st = new Stack<>();
    st.push(arr[n-1]);
    
    // continue a loop from 2nd last index to 0th index and find value at each index
    
    for(int i=n-2;i>=0;i--){
        
        int value = arr[i];

       // pooping out all the element from the stack till the value of given array is greater than the value at the top of stack 

        while(st.size() > 0 && value >= st.peek() ){
            st.pop();
        }
        
        // if stack size beccomes zero then we did not find any greater element the place -1 in the place of newarray

        if(st.size()==0){
            newArray[i]=-1;
        }
        // if the size is not zero then we find larget element and place it into newArray
        else{
            newArray[i]=st.peek();
        }
        
        // but every time we have to push the value at every index  to the stack
        
        st.push(value);
    }
    
    
   // return the newarray as our answer
   
   return newArray;
   
   
   
 }

}