import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // write ur code here
        
        int n = scn.nextInt();

        // we have to show number in icreasing order so declare a count value to 1
        
        int count=1;
        
        // continue two loop 1st for outer loop and 2nd for the inner loop
        // we have to go till the end of the loop and inner loop is deppend on outer loop so start the loop from i=1 and till the i=equal to that number
        for(int i=1;i<=n;i++){
        
        for(int j=1;j<=i;j++){
            
            // on every iteration print the value of count and increase the count
            System.out.print(count+"\t");
            count++;
            
        }
        System.out.println();
        }

    }
}