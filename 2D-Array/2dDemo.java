import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
    // write your code here  
    Scanner scn = new Scanner (System.in);
    // Take row and coloums lengths inputs
    int n = scn.nextInt();
    int m = scn.nextInt();
    
    int arr[][] = new int[n][m];
// take all rows and columns inputs
    for(int i=0;i<n;i++){
      for(int j=0;j<m;j++){
        arr[i][j]= scn.nextInt();
      }
    }
// print all the rows and coloums
// here arr.length = rows and arr[i].length = colums
// we can take arr[0],arr[1] or arr[2] for column length
    for(int i=0;i<arr.length;i++){
      for (int j = 0; j < arr[i].length; j++) {
         System.out.print(arr[i][j] + " ");
      }
   System.out.println();
    }

   }
  }