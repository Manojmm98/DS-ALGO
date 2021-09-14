import java.util.*;

public class Main{

public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);

     // write ur code here
     int n = scn.nextInt();
     
    // here ourterspace is  2 and inner sapce 0(we take it -1 bcz it is incresing by 2 every times)
   int outspace= n/2;
   int inspace= -1;
   
   for(int i=0;i<n;i++){
       
       // for outer space
       for(int sp=0;sp<outspace;sp++){
           System.out.print("\t");
       }
       // for star
       System.out.print("*\t");
       // for inner space
       for(int sp=0;sp<inspace;sp++){
           System.out.print("\t");
       }
       
       // for 2nd star we will print it in 1st row and in last row
       if(i>0&&i<n-1){
           System.out.print("*\t");
       }
       
       
       // before middle point outerspace is decreasing and innerspace is increasing by 2
       if(i<n/2){
           outspace--;
           inspace+=2;
           
       }
       // after middle point outerspace is increasing and outerspace is decreasing by 2
       else{
           outspace++;
           inspace-=2;
       }
       System.out.println();
       
   }
}
   
}