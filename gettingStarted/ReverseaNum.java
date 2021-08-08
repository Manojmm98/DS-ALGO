import java.util.*;
   
   public class Main{
   
   public static void main(String[] args) {
     
     Scanner scn = new Scanner(System.in);
     int n = scn.nextInt();
     // if we divide a number by 10 then reminder are came , are reverse of given number type
     while(n>0){
         int ans = n%10;
         n=n/10;
         System.out.println(ans);
     }
    }
   }