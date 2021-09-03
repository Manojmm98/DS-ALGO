import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // write ur code here
        int n =scn.nextInt();
        
        // here space is half of the given number here n=5 space =2 --> space=n/2
        // star =1
        int space=n/2;
        int star=1;
        for(int i=0;i<n;i++)
        
    {
        for(int sp=0;sp<space;sp++){
            System.out.print("\t");
        }
        for(int st=0;st<star;st++){
            System.out.print("*\t");
        }
        System.out.println();
        // till the middle of the loop(means n<2) the star is increasing by 2 and space is decreasing by 1
        if(i<n/2){
            space--;
            star=star+2;
        }
        // after the middle means when (n>2)  then 
        else{
        star=star-2;
        space++;
        }
                
    }
    
    
    }
}