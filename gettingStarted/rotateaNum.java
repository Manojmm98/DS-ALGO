import java.util.*;
   
   public class Main{
   
   public static void main(String[] args) {
     Scanner scn = new Scanner(System.in);
     int n = scn.nextInt();
     int k = scn.nextInt();
     // calculate no of digit
     int num =n;
     int count=0;
     while(num!=0){
         num=num/10;
         count++;
     }
     // if k is larger than given length let k is given 44 then k==44%count => 44%6=2
     // the rotation of 44 times is equal to rotaion of 2
     k=k%count;
     // if k is a -ve number
     if(k<0){
        k=k+count; 
     }
     //intialize div and mul with 1 because it will be multiply by 10 latter if we declare it 0 then overall will be 0
     int div=1;
     int mul=1;
     // continue a loop till no of digits if a number given 23867 then if given to rotate by 2 then ans will be 86723 so we have to bring 23 to 
     //last so divide the number with k*100 and add it with 867*100 ==> 867+23=86723
     for(int i=0;i<count;i++){
         if(i<k){
             div = div*10; 
         }
         else{
              mul = mul*10;
         }
     }
     int que = n/div;
     int rem = n%div;
     
     int res = rem*mul+que;
     System.out.println(res);
    }
   }
