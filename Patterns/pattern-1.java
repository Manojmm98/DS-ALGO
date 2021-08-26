import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
      // take input of the given number for formation of the pattern
      
      int n = scn.nextInt();
      // as we know the star count starts from 1 so we took it from 1
      
      // here in all the line the star count is keep increasing so 
      // create two loop one is for outer loop and another one is for inner loop 
      // every time increase the star count and continue the inner till star and outer loop for given numbers length
      
      int star =1;
      for(int i=0;i<n;i++){
          for(int j=0;j<star;j++){
              System.out.print("*\t");
          }
          System.out.println();
          star++;
      }
     
    }
}
