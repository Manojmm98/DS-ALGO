
import java.io.*;
import java.util.*;

public class Main{
  

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String exp = br.readLine();
    System.out.println(evaluate( exp));
}

// create two stacks for opreands and opreator

public static int evaluate(String exp){
    
    Stack<Integer> opreands= new Stack<>();
    Stack<Character> opreator = new Stack<>();
    
    // find out character from given expression(String)
    
    for(int i=0;i<exp.length();i++){
        char ch = exp.charAt(i);
        
        // if chracter is opening bracket
        if(ch=='('){
            opreator.push(ch);
        }
        //if character is an opreator
        
        else if(ch=='+'||ch=='-'||ch=='*'||ch=='/'){
            
            while(opreator.size()>0 && opreator.peek()!='(' && precedence(opreator.peek())>=precedence(ch)){
                char op = opreator.pop();
                int val2 = opreands.pop();
                int val1 = opreands.pop();
                
                if(op=='+'){
                    opreands.push(val1+val2);
                }
                else if(op=='-'){
                    opreands.push (val1-val2);
                }
                else if(op=='*'){
                      opreands.push (val1*val2);
                }
                else if(op=='/'){
                      opreands.push ( val1/val2);
                }
            }
            
            // push the character at last to the opreator stack
            
            opreator.push(ch);
            
        }
        
        // if character is a closing bracket
        
        else if(ch==')'){
            while(opreator.peek()!='('){
               char op = opreator.pop();
                int val2 = opreands.pop();
                int val1 = opreands.pop();
                
             if(op=='+'){
                    opreands.push(val1+val2);
                }
                else if(op=='-'){
                    opreands.push (val1-val2);
                }
                else if(op=='*'){
                      opreands.push (val1*val2);
                }
               else if(op=='/'){
                      opreands.push ( val1/val2);
                } 
            }
            // pop the opening bracket at last
            opreator.pop();
            
        }
        // if character is a single digit number
        else if(ch>='0'&&ch<='9'){
        
        opreands.push(Integer.parseInt(ch+""));
            
        }
    }
    
    while(opreator.size()>0){
                char op = opreator.pop();
                int val2 = opreands.pop();
                int val1 = opreands.pop();
                
               if(op=='+'){
                    opreands.push(val1+val2);
                }
                else if(op=='-'){
                    opreands.push (val1-val2);
                }
                 else if(op=='*'){
                      opreands.push (val1*val2);
                }
                else if(op=='/'){
                      opreands.push ( val1/val2);
                }
                
            }
            
       return opreands.pop();
}
 
 // find precedence       
 public static int precedence(char op){
     if(op=='+'||op=='-'){
         return 2;
     }
     else{
         return 4;
     }
}

}
      