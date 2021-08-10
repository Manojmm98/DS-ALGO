import java.util.*;

public class Main{

public static void main(String[] args) {
  // write your code here 
  Scanner scn = new Scanner(System.in);
  int num = scn.nextInt();
  // we have to calculate prime factor so take divisor as 2 from start
  int div=2;
  // we have to calculate only prime factor so 1 will not be included
  while(num!=1){
      //  there will be two possibilities number will be divisible by divisor  or not
      // if number is not divisible then increase the divisor
      if(num%div==0){
          System.out.print(div+" ");
          num=num/div;
      }
      else{
          div++;
      }
  }
 }
}

