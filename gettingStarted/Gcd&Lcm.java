import java.util.*;
    
    public class Main{
    
    public static void main(String[] args) {
      // write your code here  
      Scanner scn = new Scanner(System.in);
      // take input of two numbers
      int n1 = scn.nextInt();
      int n2= scn.nextInt();
      // now store these two number with variable a & b
      int a = n1;
      int b = n2;
      // 
      while(a%b!=0){
          int rem = a%b;
          a=b;
          b=rem;
      }
      int gcd = b;
      int lcm = (n1*n2)/gcd;
      System.out.println(gcd);
      System.out.println(lcm);
     }
    }
