import java.io.*;
import java.util.*;

public class Main {
   public static void main(String[] args) throws Exception {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

      int m = Integer.parseInt(br.readLine());
      int n = Integer.parseInt(br.readLine());
      int[][] arr = new int[m][n];

      for (int i = 0; i < arr.length; i++) {
         String parts = br.readLine();
         for (int j = 0; j < arr[0].length; j++) {
            arr[i][j] = Integer.parseInt(parts.split(" ")[j]);
         }
      }
      
      int island = noOfIsland(arr);
      System.out.println(island);
   }

      // define island function to identify no of island
      
      public static int noOfIsland(int arr[][]){
          
          // find out no of rows and no of coloum
          int count=0;
          int nr=arr.length;
          int nc = arr[0].length;
          // create a boolean array of length row & coloum
          boolean visited[][]= new boolean[nr][nc];
          //travel through the array
          for(int i=0;i<nr;i++){
              for(int j=0;j<nc;j++){
                  // call the gcc function if there is 0 and if that block is not visited
                  if(arr[i][j]==0 && visited[i][j]==false){
                  
                  gcc(arr,visited,i,j);
                  count++;
                  }
              }
          }
          return count;
      }
      
      public static void gcc(int arr[][],boolean visited[][],int r,int c){
          
          // we will return if row & coloum is less than 0 or if we go out of borad means row or coloum length greater than the length of array or if visited[r][c]==true or if there will be 1 in the block
          if(r<0||c<0||r>=arr.length||c>=arr[0].length||visited[r][c]==true||arr[r][c]==1){
              return;
          }
          
          // mark visited array as true
          visited[r][c]=true;
          
          // travel to east
          gcc(arr,visited,r,c+1);
          // travel to west
          gcc(arr,visited,r,c-1);
          // travel to north
          gcc(arr,visited,r-1,c);
          // travel to south
          gcc(arr,visited,r+1,c);
      }
      
   }

