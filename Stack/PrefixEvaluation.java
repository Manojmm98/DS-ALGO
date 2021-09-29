import java.io.*;
import java.util.*;

public class Main{
  

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String exp = br.readLine();

    
    solve(exp);
 }
 
 public static void solve(String exp){
    
    // create 3 stacks

    Stack<Integer> eval = new Stack<>();
    Stack<String> infix = new Stack<>();
    Stack<String> postfix = new Stack<>();
    
    for(int i=exp.length()-1;i>=0;i--){
        char ch = exp.charAt(i);
        
        if(ch=='+'||ch=='-'||ch=='*'||ch=='/'){
            
            evaluation(eval,ch);
            infixBuild(infix,ch);
            postfixBuild(postfix,ch);
            
        }
        else{
            eval.push(Integer.parseInt(ch+""));
            infix.push(ch+"");
            postfix.push(ch+"");
        }
        
    }
     System.out.println(eval.peek());
        System.out.println(infix.peek());
        System.out.println(postfix.peek());
 }
    
    public static void evaluation(Stack<Integer>eval,char op ){
        
        if(op=='*'|| op=='+'|| op =='-'||op=='/'){
            
            int val1 = eval.pop(),val2=eval.pop();
            if(op=='+'){
                eval.push(val1+val2);
            }
            if(op=='-'){
                eval.push(val1-val2);
            }
            if(op=='*'){
                eval.push(val1*val2);
            }
            if(op=='/'){
                eval.push(val1/val2);
            }
        }
    }
    
    public static void infixBuild(Stack<String>infix,char op ){
        
        //for infix = val1+op+val2
        String val1= infix.pop(),val2=infix.pop();
        
        infix.push("("+val1+op+val2+")");
        
        
    }
    
    public static void postfixBuild(Stack<String>postfix, char op ){
        
        // for postfix => val1+val2+op
         String val1= postfix.pop(),val2=postfix.pop();
        
        postfix.push(val1+val2+op);
        
        
    }
 
 
 
}