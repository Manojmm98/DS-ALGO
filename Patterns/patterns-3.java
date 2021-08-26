
import java.util.*;



public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // we have to print star from thr right side so we will print it in space and star format
        int n = scn.nextInt();
        //star count will be 1 and space count will be n-1
        int space=n-1;
        int star=1;
        // continue the outer loop till the length of n given
        for(int i=0;i<n;i++){
            // 1st space and then star so 1st print the space
            for(int sp=0;sp<space;sp++){
                System.out.print("\t");
            }
            for(int st=0;st<star;st++){
                    System.out.print("*\t");
                }
                // the space count is keep decreasing and the star count is increasing
             //     *
            //    * *
            //  * * *
            //* * * * 
            star++;
            space--;
            System.out.println();
        }

    }
}
   





