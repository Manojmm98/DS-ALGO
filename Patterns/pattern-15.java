import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // it is similar to star print prblm count star and space
        
        int n = scn.nextInt();
        
        int star = 1;
        int space = n/2;
        int var = 1;
        
        for(int i=0;i<n;i++){
            
            // for space
            for(int sp=0;sp<space;sp++){
                
                System.out.print("\t");
                
            }
            
            // our value will be decressed or increase so store var in another variable
            int val=var;

            //for stars
            for(int st =0;st<star;st++){
                System.out.print(val+"\t");
                
                // if star coloum less the middle point then increment value else decrease
                if(st<star/2){
                    val++;
                }
                else{
                    val--;
                }
            }


// for number of rows till middle point value is increasing,star inCREASING BY 2 AND SPACE DECREASING by one every time
            if(i<n/2){
                var++;
                star=star+2;
                space--;
            }
            else{
                var--;
                star=star-2;
                space++;
            }
                    System.out.println();

        }
    

    }
}
















