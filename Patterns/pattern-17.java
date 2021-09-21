import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        
        int n = scn.nextInt();
       
       // for 1st row star and space value is 1 and n/2(half of total row) 
        int space=n/2;
        int star=1;
        
        for(int i=0;i<n;i++){
            for(int sp =0;sp<space;sp++){
               
               // when our loop reaches middle point then print only star and all other position print space 
                if(i==n/2){
                    System.out.print("*\t");
                }
                else{
                System.out.print("\t");
                }
            }
            // for every row print star as per star count given
            for(int st=0;st<star;st++){
                
                System.out.print("*\t");
            }
            // fprom the 1st row to middle row the star count increases by one till middle row
            if(i<n/2){
                star++;
            }
            // when the i value or row value reaches middle the star value keep decreasing by one
            else{
                star--;
            }
            // move to next line
        System.out.println();
       
        }
        
        

    }
}