import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
      // write your code here
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      // fiboonaci seereise will be 0 1 1 2 3 5 ... == 0+1=1,1+1=2,2+1=3
      int a=0;
      int b=1;
      for(int i=0;i<=n;i++){
          int c=a+b;
          // here we are printing a because a will be 0 first then updated to 1 then updated to 2 ... so on
          System.out.println(a);
          a=b;
          b=c;
      }
      
   }
  }