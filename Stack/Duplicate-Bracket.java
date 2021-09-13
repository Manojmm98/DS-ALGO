import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        
        Scanner scn = new Scanner(System.in);
        
        String str = scn.nextLine();
        
        
        System.out.println(isDuplicate(str));

    }
    
    public static boolean isDuplicate( String str){
        Stack <Character> st = new Stack<>();
        
        for(int i=0;i<str.length();i++){
            // find out the character from string
          char ch = str.charAt(i);
          
         // check if the character is a closing bracket or not if character is not a closing bracket then simply push the character into stack  
            if(ch==')'){
                
                // check if there opening bracket present at the top or not
                // if the character is a closing bracket then there duplicate bracket present
                if(st.peek()=='('){
                    return true;
                }
                else{
                // if the opening bracket not present at the top then find it till it appears and pop the elemnts till opening bracket lastly also pop the opening bracket
                
                while(st.peek()!='('){
                    st.pop();
                }
                st.pop();
                }
                
            }
            else{
                st.push(ch);
            }
        }
        
        // if no duplicate bracket found then simply return false
         
         return false;
    }

}