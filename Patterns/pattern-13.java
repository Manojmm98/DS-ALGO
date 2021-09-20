import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        //here the next column value depends upon the previous column value for eg --> if 1st value is c(n,0) then the 2nd value will be c(n,1)

        // similarly if we take value of 1st coloum is c(n,r) then the 2nd value will be c(n,r+1)
        
        // c(n,r).f = c(n,r+1)  find the value of f ?

        // the value of f will be (i-j)/(j+1)

        int n = scn.nextInt();
        for(int i=0;i<n;i++){
           int val =1;

            for(int j=0;j<=i;j++){
                
             //  at first coloum the value is 1 so we have to print value at first value and after that the value is updated as per coloum

               System.out.print(val+"\t");

               val = val*(i-j)/(j+1);

            }
           System.out.println();

        }

      
    }
}