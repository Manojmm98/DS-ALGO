import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        
        Scanner scn = new Scanner(System.in);
        String exp = scn.nextLine();
        
        System.out.println(isBalanced(exp));
        

    }
    
    public static boolean isBalanced(String exp){
        Stack<Character> st = new Stack<>();
        
        // find out all character
        
        for(int i=0;i<exp.length();i++){
            char ch = exp.charAt(i);
            
            // if the charcters are opeing bracket then push all the character
            
            if(ch=='{'||ch=='('||ch=='['){
                st.push(ch);  
            }
            
            // if charcters are closing bracket 
            
            else if(ch=='}'||ch==')'||ch==']'){
                
                // if --->  closing bracket > opening bracket
                
                if(st.size()==0){
                    return false;
                }
                
                
                // if bracket are in misodered or not in correct format
                
                // means if closing bracket came and there is no opeining bracket on the top of stack then it will be not balanced
                
                if( (ch==')' && st.peek()!='(') || (ch=='}' && st.peek() != '{') || (ch==']' && st.peek() !='[') ){
                    
                    return false;
                }
                else{
                    st.pop();
                }
                
            }
            
        }
        
        // if ---> opening bracket > closing bracket
                
                if(st.size()>0){
                    return false;
                }
                
       return true;
        
    }
    


}