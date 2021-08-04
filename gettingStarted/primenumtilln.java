import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        // we hav to print the prime number between a range from low to high
        int low = scn.nextInt();
        int high = scn.nextInt();
        // here i will start from low and continue till high
        for(int i=low ;i<=high;i++){
            int count =0;
            for(int div =2;div*div<=i;div++){
                if(i%div==0){
                    count++;
                }
            }
            // if count ==0 then they will be prime number so print those
            if(count==0){
                System.out.println(i);
            }
        }
    }
}