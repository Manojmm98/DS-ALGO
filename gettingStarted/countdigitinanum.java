import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
    // write your code here 
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    // we have to count the number of digit of number so if num will be 234
    // then numbers are 234/10=23 and count become +1,then 23/10=2 ,count==2 so on
    int digit=0;
    while(n>0){
        n=n/10;
        digit++;
    }
        System.out.println(digit);
   }
  }
