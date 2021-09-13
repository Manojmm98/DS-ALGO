import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // write ur code here
        
        int n = scn.nextInt();

        // here we have to print the star in a cross pattern and it is the combination of stars when i==j and i+j==n+1 so make condition 
        
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){

                // if any condition is satisfied then we will print star
                if(i+j==n+1||i==j){
                    System.out.print("*\t");
                }
                
                else{
                    System.out.print("\t");
                }
            }
            
            System.out.println();
        }

    }
}