import java.io.*;
import java.util.*;

public class Main{
  

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String exp = br.readLine();

    // code
    
    solve(exp);
    
 }
 
 public static void solve(String exp){
     // create 3 stack for evaluation,prefix expression & infix expression
     
     Stack<Integer> eval = new Stack<>();
     
     Stack <String> InfixExp = new Stack<>();
     
     Stack <String >PrefixExp = new Stack<>();
     
     // FIND OUT ALL CHRACTER
     for(int i=0;i<exp.length();i++){
        char  ch = exp.charAt(i);
      // if characters are opreator then  continue special opreation for each stack if they are not opreator then push them as intreger & string format
        if(ch=='+'||ch=='-'||ch=='*'||ch=='/'){
            
            EvaluationBuild(eval,ch);
            InfixExpBuild(InfixExp,ch);      
            PreFixExpBuild(PrefixExp,ch);
            
        }
        else{
            eval.push(Integer.parseInt(ch+""));
            // convert char to string bcz stack is string type
            InfixExp.push(ch+"");
            PrefixExp.push(ch+"");
        }
          

     }
     
     // lastly our answer on the top
     System.out.println(eval.peek());
     System.out.println(InfixExp.peek());
     System.out.println(PrefixExp.peek());
     
     
 }
 
 // for evaluation(interger) stack we have to calculate the value  [v1]
 public static void EvaluationBuild(Stack<Integer>eval,char op){
     
        int val2 = eval.pop(), val1=  eval.pop();

       // for specified opreator do appropiate opreation 
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
 // for infix stack push with bracket [format=(v1 op v2)]
 public static void InfixExpBuild(Stack<String> InfixExp,char op){
     
     String val2 = InfixExp.pop(), val1=  InfixExp.pop();
     
     InfixExp.push("("+val1+op+val2+")");
     

 }
 public static void PreFixExpBuild(Stack<String> PrefixExp,char op){
        String val2 = PrefixExp.pop(), val1=  PrefixExp.pop();
     
     PrefixExp.push(op+val1+val2);
     
 }
 
}