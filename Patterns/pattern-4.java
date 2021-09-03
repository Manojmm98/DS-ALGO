import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n =scn.nextInt();
        
        // here star number is equal to n and space is 0  from starting 
        // star is keep decreasing and space is keep increasing 
        int star = n;
        int space=0;
        
        // here the total no of line is equal to n so it is the outer loop
        for(int i=0;i<n;i++){
          
         // here space is first so first print space   
        // for space print space
            
        for(int sp=0;sp<space;sp++){
            System.out.print("\t");
           
        }
        // for star print star
        for(int st =0;st<star;st++){
            System.out.print("*\t");
        }
        // increase space and decrease star and move to next line
            star--;
            space++;
        System.out.println();
        }

    }
}