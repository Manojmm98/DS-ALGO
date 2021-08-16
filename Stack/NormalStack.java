import java.io.*;
import java.util.*;

public class Main {

  public static class CustomStack {
    int[] data;
    int tos;

    public CustomStack(int cap) {
      data = new int[cap];
      tos = -1;
    }

    int size() {
      //here tos pointing to the index of top of the stack as it is starting from -1 so size= tost+1
      return tos + 1;
    }

    void display() {
      // the elements are printed in lifo manner so we will start from tos to 0th index
      for(int i=tos;i>=0;i--){
      System.out.print(data[i]+" ");
      }
  System.out.println();
    }

    void push(int val) {
      // while pushing a elemnt the tos have to increase by one because intially tos is pointing to before index
      if(size() == data.length){
      System.out.println("Stack overflow");
      return;
      }
      tos++;
      data[tos]=val;
    }

    int pop() {
      // if we want to delete an element from stack first we have to remove the element and make it 0  then decrease the tos return the val
      if(size()==0){
       System.out.println("Stack underflow");
       return -1;
      }
      int val= data[tos];
      data[tos]=0;
      tos--;
      return val;
    }
    int top() {
       // in top we just have to see the  element at the top
        if(size() == 0){
       System.out.println("Stack underflow");
       return -1;
      }
      int val = data[tos];
      return val;
      
    }
  }

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    CustomStack st = new CustomStack(n);

    String str = br.readLine();
    while(str.equals("quit") == false){
      if(str.startsWith("push")){
        int val = Integer.parseInt(str.split(" ")[1]);
        st.push(val);
      } else if(str.startsWith("pop")){
        int val = st.pop();
        if(val != -1){
          System.out.println(val);
        }
      } else if(str.startsWith("top")){
        int val = st.top();
        if(val != -1){
          System.out.println(val);
        }
      } else if(str.startsWith("size")){
        System.out.println(st.size());
      } else if(str.startsWith("display")){
        st.display();
      }
      str = br.readLine();
    }
  }
}