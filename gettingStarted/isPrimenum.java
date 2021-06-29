import java.io.*;
imort java.util.*;

Class Main{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        // we are given there are t number of element which is the count of number which will be tested so we take the input of t and go through each element
        int t = scn.nextInt();
        for (int i = 0; i <t;i++){
            // n is the number which will be tested and it is t number of times means if t is 10 then we take input of n from 1,2,3...10
            int n = scn.nextInt();
            // we hav eto find prime number we know if the modulus is 0 then it is not a prime number so to count number we 1st create avariable count and set it to 0
            int count=0;
            // we start the div from 2 because 1 id divisible by all and to maintain the time compexity
            // we go till the rott over of the give number means if  number is 4 then we will search till rootover of 4 that is 2 and for 49 we go till 7 so on
            for(int div=2;div*div<=n;div++){
                if(n%div==0){
                    count++;
                }
               if(count==0){
                   System.out.println("prime");
               }
               else{
                   System.out.println("not prime");
               }
            }
        }
    }
}