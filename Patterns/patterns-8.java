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

        // here we have to print the star in the place of 5 in row 5 and 3 in row 3 and 2 in row 2 and so on
        // so if we will make two loop then then when the sum of i and j values equal to n+1 then print star
        // in all row add the rows 1+n =1+5=6 , 2+4=6 , 3+3=6  then star will be at tht place when i+j==n+1

     int n = scn.nextInt(); 
      for(int i=1;i<=n;i++){
          for(int j=1;j<=n;j++){
              if(i+j==n+1){
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

