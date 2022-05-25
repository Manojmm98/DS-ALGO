import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int b = scn.nextInt();
      int d = getValueIndecimal(n, b);
      System.out.println(d);
   }
  
   public static int getValueIndecimal(int n, int b){
      // write your code here
      int sum =0;
      int power=1;
      while(n>0){
         // find out the reminder
         int digit = n%10;
         // every time number reduced by 10
         n = n/10;

         // the overall sum will be required digit multiply digit with power 1*8^5-1 + 2*8^4-1 + ......
         sum = sum+digit*power;
         power = power * b; // here b is base 
      }
      return sum;
   }
  }