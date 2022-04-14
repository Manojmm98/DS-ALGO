import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int b = scn.nextInt();
      int dn = getValueInBase(n, b);
      System.out.println(dn);
   }
  
   public static int getValueInBase(int n, int b){
       // write code here
     int rem =0;
     
     int pow=1;


    while(n>0){
       int digit = n%b ;

       n = n/b;
        
       //rem = rem + digit*pow;
        rem += digit * pow;

       
       pow = pow * 10;

    }

      return rem;
   }
  }