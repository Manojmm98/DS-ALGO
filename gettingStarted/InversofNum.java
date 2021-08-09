import java.util.*;

public class Main{

public static void main(String[] args) {
  // we have to calculate inverse of a number  eg- if given number is 35142 then inverse will be 
  /*
  the face value of the given number is indexing from left to right
  1-->2                                          2-->1
  2-->4          inverse of this will be         4-->2        the result will be 
  3-->1          opposite of the face value      1-->3 
  4-->5                                          5-->4
  5-->3                                          3-->5
  
  
  */ 
  Scanner scn = new Scanner(System.in);
  int n = scn.nextInt();
  int res=0;
  int count=1;
  while(n!=0){
      int digit = n%10;
      n=n/10;
      res=res+count*(int)Math.pow(10,digit-1);
      count++;
  }
  System.out.println(res);
 }
}
