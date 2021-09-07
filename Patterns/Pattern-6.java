import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // take input of n
        // here the number of star from 1st line is n/2+1 because let we have no of star is 3 and space is 1
        // then start is 4/2+1 ans space is 1
        int n = scn.nextInt();
        int star=n/2+1;
        int space=1;
        // continue a outer loop till the length of n
        for(int i=0;i<n;i++){
            for(int st=0;st<star;st++){
                System.out.print("*\t");
            }
            for(int sp=0;sp<space;sp++){
                System.out.print("\t");
            }
            // we have extra no of star after star and space so print star itself
            for(int st=0;st<star;st++){
                System.out.print("*\t");
            }
            
            // till the length of the loop is less than n/2 then increse space count by 2 and decrease the
            // space by 1
            if(i<n/2){
                star--;
                space=space+2;
            }
            else {
                star++;
                space=space-2;
            }
            System.out.println();
        }
    }
}