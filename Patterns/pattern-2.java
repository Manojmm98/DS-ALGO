import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        
        // here star counts start from 5 so travel a loop  from length n because the star is started from the given length of n 
        //and then keep decreasing so continue two loop one for outer and another for star count
        int star = n;
        
        for(int i=0;i<n;i++){
            for(int j=0;j<star;j++){
                System.out.print("*\t");
            }
            System.out.println();
            star--;
        }
        

    }
}
