import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
    // the ball will on at the last is the ball which are having perfect square means if no given 
    // 24 then then the ball will be on after perfect square which are less than the given number 
    // 1->1*1 4->2*2 9->3*3 16->4*4 25->5*5 
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    //contiue the loop till the square of i where i*i less than the number n
    for(int i=1;i*i<=n;i++){
        System.out.println(i*i);
    }
    
    
   }
  }