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

  public static void reverse(int[] a){
    // write your code here
    
    // store first and last index in two variable
    int fi = 0;
    int li= a.length-1;
    //  till we reaches the middle point change first index to last index and last to first
    while(fi<li){
        int temp = a[fi];
        a[fi]=a[li];
        a[li]=temp;
     
    // increase first index and decrease last index   
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

    reverse(a);
    display(a);
 }

}