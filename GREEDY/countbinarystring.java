import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    // we just take two variable at index 1 and at index 2 and set them to 1
    int countat0=1;
    int countat1=1;
    // as we put in 0th and 1th index 1 so we will start the loop from i=2 and we will move till n
    for(int i=2;i<=n;i++){
        // we created two temp variable tmp0 and tmp1 
        // we set the tmp0=countat1 and temp1= countat0+countat1 because we know the sereis 1 1 2 3 5 8 13 21----------> 1+2=3,2+3=5,5+8=13 
        int tmp0=countat1;
        int tmp1=countat0+countat1;
    // after 1 itration the value at index 0 become the stting of 2nd and addition of two become second for eg---> 1,1 next will be 1+1=2 
    // if we look on the series 1,1,2,3,5   2nd index become 1st of next and addition of 1st+2nd become 2nd index 
    countat0=tmp0;
    countat1=tmp1;
    
 }
 System.out.println(countat0+countat1);
}
}



//------------------------ approch-2 through 2d matrix-----------------//


import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
   int dp[][]= new int[2][n+1];
   for(int length=1;length<=n;length++){
       if(length==1){
           dp[0][1]=1;
           dp[1][1]=1;
       }
       else{
           // the 0th row's index  value always equal to the 1st row's indexvalue-1
           dp[0][length]=dp[1][length-1];
           // the 1th row's index value always equal to the 0th rowindexvalue-1 + 1'st rowindexvalue-1
           dp[1][length]=dp[1][length-1]+dp[0][length-1];
       }
   }
   System.out.println(dp[0][n]+dp[1][n]);
}
}

















