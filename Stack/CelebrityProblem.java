import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][n];

        for (int j = 0; j < n; j++) {
            String line = br.readLine();
            for (int k = 0; k < n; k++) {
                arr[j][k] = line.charAt(k) - '0';
            }
        }

        findCelebrity(arr);

    }

    public static void findCelebrity(int[][] arr) {
        // if a celebrity is there print it's index (not position), if there is not then
        // print "none"
        
        // create a stack
        
        Stack <Integer> st = new Stack<>();
        // push all the indeces of the array
        for(int i=0;i<arr.length;i++){
            st.push(i);
        }
      
        
        // till the stack size is not 1 do below opertaion
        while(st.size()>1){
              
        // start popping out elements 1 & 2
        
        int p1= st.pop();
        int p2= st.pop();
            
        // if p1==true then he will not be celebrity
        if(arr[p1][p2]==1){
            // p2 will be a celebrity push it to stack
            st.push(p2);
        }
        else{
            // p1 will be celebrity
            st.push(p1);
        }
      }
      
      // possible celebrity is on the top of stack
      int possiblecelebrity=st.pop();
      
      // check if the posscelebrity have any 0 in his coloum or 1 in his rows or not i
      
      // check for rows
      // for a celebrity there will be no 1's in every coloum of that element if 1 present then it will not acelebrity
      
      for(int c=0;c<arr.length;c++){
          if(arr[possiblecelebrity][c]==1){
              
              System.out.println("none");
              return;
          }
      }   
       
       // for coloum
       
       // there will be no 0 on every coloum of that element and coloum not equal to index of possiblecelebrity
       for(int r=0;r<arr.length;r++){
          if(arr[r][possiblecelebrity]==0&& r!=possiblecelebrity){
              
              System.out.println("none");
              return;
          }
      }  
      
      // if two condition false then we found our celebrity
      System.out.println(possiblecelebrity);
      
    }

}