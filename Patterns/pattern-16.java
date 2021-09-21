import java.util.*;

public class Main{

public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n= scn.nextInt();
    
    // the number of star is 1 and the number of space is 2*(n-3) for starting row so let's start with it
    
    int star =1;
    int space = 2*n-3;
    
    for(int i=0;i<n;i++){
       
       // create a value and start it from 1 because at 1st row we have to print 1 first and have to go till the number of stars present in that row so continue a for loop
       
       // for star
       int val =1;
       for(int st=0;st<star;st++){
       System.out.print(val+"\t");
       // the value of star is incresing after every iteration but 1st prvious value and then next value so increase the val after printing it
       val++;
       
       }
       
       // for space
       
       for(int sp = 0;sp<space;sp++){
           System.out.print("\t");
       }
              
       // but in last row the number of stars is become 1 extra if we do like this so decrease one star when i reaches last row
       // we start the loop from 0 so we take i==n-1 instead if i==n
       if(i==n-1){
           star--;
           val--;

       }
       
       // again for 2nd star
       
       for(int st =0;st<star;st++){
           // before printing 2nd star decrease the value because it is increased while printing 1st stars if we will not decrease then it will print that increased value
           val--;
           System.out.print(val+"\t");
       }

       
       // aftwr printing 2nd star for every itreation the star value is incresing by 1 and space value is decreasing by 2 then move to next line
       star++;
       space=space-2;
       // go to next line
       System.out.println();
        
    }
   
     


 }
} 