import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int d = scn.nextInt();
        int f = getDigitFrequency(n, d);
        System.out.println(f);
    }

    public static int getDigitFrequency(int n, int d) {
        // we have to compare the digit which is extracted and if our digit matches with the given digit then we will increase count otherwise we will not increase count
        
        // create a count variable to find out the number of occurance
        int count =0;
        // till the number is greater than find out all digit one y one by taking modulus
        while(n>0){
        int digit = n%10;
        n=n/10;
        // if given digit is matches with our digit then increase the count 
        if(d==digit){
            count++;
        }
    }
       // at last return the count value 
        return count;
        
    }
}