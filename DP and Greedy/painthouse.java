import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn= new Scanner(System.in);
        int n = scn.nextInt();
        // we created a 2d matrix to store the number of house and color to be printed here n==houseno  3=colors(red,blue,green)
        int mat[][]=new int[n][3];
        // we start from oth house and take input of oth ,1st,2nd coloum where red,blue,green are lying
        for(int i=0;i<n;i++){
            mat[i][0]=scn.nextInt();
            mat[i][1]=scn.nextInt();
            mat[i][2]=scn.nextInt();
        }
        // we intialize the cost for paint all colors to 0
        int costofRed=0,costofBlue=0,costofGreen=0;
        // if we are in 1st row means i==0 then the cost of all colors are the value lying on it which is given we set it to cost of them
        for(int i=0;i<n;i++){
            if(i==0){
            costofRed=mat[i][0];
            costofBlue=mat[i][1];
            costofGreen=mat[i][2];
            }else{
                // now on 2nd 3rd,.. row the costs are the value of that coloum and we can not paint same color in that colum so minimum of the two alternate colors
                
                int red=Math.min(costofBlue,costofGreen)+mat[i][0];
                int blue=Math.min(costofRed,costofGreen)+mat[i][1];
                int green=Math.min(costofBlue,costofRed)+mat[i][2];
                // the new updated cost will be updtaed so that the next row will fetch the dta from it and will find the cost
                costofRed=red;
                costofBlue=blue;
                costofGreen=green;
            }
                
        }
        // at last the answer will be the minimum of last row means min(costofred,costofblue,costofgreen)
        int mincost=Math.min(costofRed,Math.min(costofBlue,costofGreen));
        System.out.println(mincost);
    }
}