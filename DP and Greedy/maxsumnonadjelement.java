import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[]= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        
        // 1st we declare inculde and exclude at 0
        int inc=0,exc=0;
        // here we start index from 0 and till n 
        for(int i=0;i<n;i++){
            // for index=0, the exclude=0,include=the value at 0th index ---> if the value at 1st index is 5 then if we include 5 then --->arr[0]=5 
            // if we exclude then 5 which is at 0th index that means if 5 will not come then ----> exclude=0
            if(i==0){
                exc=0;
                inc=arr[0];
            }
            else{
                // on the next index then exclude will be the maximum of exc,inc  
                int newexc=Math.max(inc,exc);
                // on the next index then the new include will be exclude of previous and the value at the index of array
                int newinc=exc+arr[i];
                
                // the include is now updated to newinclude and exclude will be the newexclude 
                inc=newinc;
                exc=newexc;
            }
        }
        // lastly the answer will be the maximum from include and exclude
        int msum=Math.max(inc,exc);
        System.out.println(msum);      
    }
}