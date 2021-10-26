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

  public static int[] inverse(int[] a){
    // write your code here

    // here index and value have to be swapped if on 5th index val is 1 then in 1st index val will be 5

    // create an inverse array  which is equal to length of given array to store
    int []inv = new int[a.length];

    for(int i=0;i<a.length;i++){
        // store all the element at all index of array int variable
        int v = a[i];
        // put the value in the index of 
        inv[v]=i;
    }
    return inv;
  }

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    int[] a = new int[n];
    for(int i = 0; i < n; i++){
       a[i] = Integer.parseInt(br.readLine());
    }

    int[] inv = inverse(a);
    display(inv);
 }

}