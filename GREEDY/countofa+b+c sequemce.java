import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn=new Scanner(System.in);
        String str=scn.nextLine();
        
        // at first if there is no letter then all count are 0
        
        int countofa=0;
        int countofab=0;
        int countofabc=0;
        // we start the loop for the given string frm index 0
        for(int i=0;i<str.length();i++){
            // we find out the character at ith index and the cheks if it is a or b or c and put the formulla accordingly 
            char ch = str.charAt(i);
            if(ch=='a'){
                countofa=(2*countofa)+1;
            }
            else if(ch=='b'){
                countofab=(2*countofab)+countofa;
            }
            else if(ch=='c'){
                countofabc=(2*countofabc)+countofab;
            }
        }
        
        System.out.println(countofabc);

    }
}