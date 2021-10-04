import java.util.*;

public class Main{

public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);

     // write ur code here
     int n =scn.nextInt();
     
     // here 7 star which is equal to n  in 1st row and o space 
     int star=n;
     int space=0;
     
     for(int i=0;i<n;i++){
        for(int sp=0;sp<space;sp++){
            System.out.print("\t");
        } 
        
        for(int st=0;st<star;st++){
            
            // we have to print space in 1st row's coloum position 2,3,4 and 3rd row coloum position 4th
            // means when i > 0 and i<n/2 and when coloum value is greater than 0 and less than the maximum coloum
            
            if(i>0&&i<=n/2-1 && st>0 && st<star-1){
                System.out.print("\t");
            }
            else{
             
            System.out.print("*\t");
            }
        }
        // before middle point star decrease by 2 and space increment by 1
        if(i<n/2){
            star-=2;
            space++;
        }
        // after middle half star increasing by 2 and space decrease by 1
        else{
            star+=2;
            space--;
        }
        
        System.out.println();
     }

 }
}