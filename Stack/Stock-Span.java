
// it is also call NEXT GREATER ELEMENT ON LEFT

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

    int[] span = solve(a);
    display(span);
 }

 public static int[] solve(int[] arr){
   // solve
   
   // find out the length
   int n = arr.length;
   
   int[] span = new int [n];
   
   // place 1 on the span of oth index
   span[0] = 1;
   //create a stack and push the 0th index into stack
   Stack<Integer> st = new Stack<>();
   
   st.push(0);

    // start a loop from 1th index to the length of array  
   for(int i=1;i<arr.length;i++){
       int val = arr[i];
       
       // till the value at the index of array is greater than the index at the top of the stack pop the elements
       while(st.size()>0 && val> arr[st.peek()]){
           st.pop();
       }
       
       // when the size of stack become zero then place i+1 in the span arry's index
       if(st.size()==0){
           span[i]=i+1;
       }
       // if the size is not zero then then the index in the ith index of span is equal to i - st.peek()
       else{
           span[i]= i-st.peek();
       }
      // on every time push the value of i to stack 
       st.push(i);
   }

   return span;
   
 }
 
}