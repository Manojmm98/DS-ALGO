import java.io.*;
import java.util.*;

public class Main{
  public static void display(int[] a){
    StringBuilder sb = new StringBuilder();

    for(int val: a){
      sb.append(val + " ");
    }
    System.out.println(sb);
  }

  public static void rotate(int[] a, int k){
   
  // if the k value is greater than the length then modulus of kwith length will be the result for k
  
  k = k%a.length;
  
  // if the k is -ve number then add length with k
  if(k<0){
      k=k+a.length;
  }
  // rotate the wholw array
  reverse(a,0,a.length-1);
  // rotate the  part from 0 to k-1
  reverse(a,0,k-1);
  // rotate from k to length of array
  reverse(a,k,a.length-1);
  }
  public static void reverse(int a[],int fi,int li){
      
    // rotate the array
      while(fi<li){
          int temp = a[fi];
          a[fi]=a[li];
          a[li]=temp;
          fi++;
          li--;
      }
      
  }

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    int[] a = new int[n];
    for(int i = 0; i < n; i++){
       a[i] = Integer.parseInt(br.readLine());
    }
    int k = Integer.parseInt(br.readLine());

    rotate(a, k);
    display(a);
 }

}