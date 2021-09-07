import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // write ur code here
        
         int n = scn.nextInt();
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        //write ur code here

        // here we have to print the star in the place of 1 in row 1 and 2 in row 2 and 3 in row 3 and so on
        // so if we will make two loop then then when i and j values becomes same then we have to print star 
        // in row 0 i and j are same at 0th position and in  row 2 i and j are same at 1th position and so on

     int n = scn.nextInt(); 
      for(int i=0;i<n;i++){
          for(int j=0;j<n;j++){
              if(i==j){
                  System.out.print("*\t");
              }
              else{
                  System.out.println("\t");
              }
          }
          System.out.println();
      }
    }
 }

