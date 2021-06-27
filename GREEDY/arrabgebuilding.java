 import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    long n = scn.nextInt();
    // we can arrange bulding and space on both sides so the result will be onside*twoside mens if we have 5 building in one side we can nake 25 types in both sides 5*5
   // we put 1 on both 0 and 1 for building and oldspace
    long  oldbuilding =1;
    long oldspace =1;
    for(int i=2;i<=n;i++){
        long newbuilding=oldspace;
        long newspace=oldbuilding+ oldspace;
    
    oldbuilding=newbuilding;
    oldspace=newspace;
    
 }
 System.out.println((oldbuilding+oldspace)*(oldbuilding+oldspace));
}
}
