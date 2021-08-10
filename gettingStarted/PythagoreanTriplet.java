import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    //pythagoren triplet is a^2+b^2=c^2 or b^2+c^2=a^2 or c^2+a^2=b^2
    // we will check if any condiction will be true then it will be true otherwise false
    int a = scn.nextInt();
    int b = scn.nextInt();
    int c = scn.nextInt();
    
    boolean isPT=false;
    if(a*a+b*b==c*c){
        isPT=true;
    }
    else if(b*b+c*c==a*a){
        isPT=true;
    }
    else if(c*c+a*a==b*b){
        isPT=true;
    }
    else{
        isPT=false;
    }
    System.out.println(isPT);
    
   }
  }
