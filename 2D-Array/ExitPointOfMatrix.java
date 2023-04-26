import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int nr = scn.nextInt();
        int nc = scn.nextInt();

        int mat[][] = new int[nr][nc];
        for(int i=0;i<nr;i++){
            for(int j=0;j<nc;j++){
                mat[i][j] = scn.nextInt();
            }
        }

       exitPoint(mat) ;
    }

    public static void exitPoint(int mat[][]){

        int nr = mat.length-1;
        int nc = mat[0].length-1;

        int i=0,j=0; // entry point (0,0)
        int dir =0 // 0-> east ,1-> south , 2-> west ,3-> north

        while(true){

      dir =  (dir+mat[i][j]) % 4 ;


            if(dir==0){
                // move in east direction
                j++;
            }
            else if(dir==1){
                // north direction -->down
                i++;
            }
            else if(dir==2){
                // west direction
                j--;
            }
            else if(dir==3){
                // south direction
                i--;
            }



        // after finding the exit point we have to come out from the loop so we have to break the loop there
        if(j==nc){
            // exited through east wall in right direction here we do j++ 
            //so if number of coumun is equal of j then we are out of matrix so our 
            //exit point will be 1 cell before that
            j = nc-1;
            break;

        }
        else if( i == nr){
            // exited throuigh north wall using bottom direction
            i =  nr-1;
            break;
        }

        else if(j <0){
            // exited through west wall using left direction 
            // in west direction we are decreasing the value of j 
            //so at a point of time it will be less than 0 then the
            // exit point will be at oth position
           
            j==0;
            break;
        }
        else if(i<0){
            // exited through south wall using top direction
            i==0;
            break;
        }



        }
        System.out.println(i);
        System.out.println(j);

    }





}