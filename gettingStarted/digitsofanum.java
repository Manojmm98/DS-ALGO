import java.util.*;
    
    public class Main{
    
    public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int num = scn.nextInt();
      // when we are counting our number then our original number will be changed so we are stroing our original number in another var called num
      int n = num;
      int count=0;
      while(num>0){
          num=num/10;
          count++;
      }
      // we want to find our first digit so here diviser will be 10 to the power total no of digit-1
      // means if we have a number 348765 the 3 will find out by 10^6-1 i.e. 10^5 348765/1000000
      int div = (int)Math.pow(10,count-1);
      while(div!=0){
          // our quetioent will be our answer
         int que = n/div;
         System.out.println(que);
         // our number will be reminder after division
         n = n%div;
         // on every iteration our div will be changed means means from 10^5 to 10^4 and so on till 10
         div=div/10;
      }
      
      
     }
    }
    