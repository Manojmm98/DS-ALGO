import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int sb = scn.nextInt();
     int  db= scn.nextInt();
     int res = anyBaseToAnyBase(n,sb,db);
     System.out.println(res);
   } 

   public static int anyBaseToAnyBase(int n , int b1,int b2){
       
       int res1 = anyBasetoDecimal(n,b1);
       int res2 = decimalToanyBase(res1,b2);
       return res2;

   }
  
 
  public static int decimalToanyBase(int n , int b1){
    int sum =0;
    int power = 1;
    while(n>0){
      int digit = n%b1;
       n = n/b1;
      sum = sum + digit * power;
      power = power * 10;
    }
    return sum;
  }

  public static int anyBasetoDecimal(int n , int b2){
         int sum =0;
         int power = 1;
         while(n>0){
           int digit = n%10;
           n =n/10;
           sum = sum + digit * power;
           power = power * b2; 
         }
         return sum;
  }


  }