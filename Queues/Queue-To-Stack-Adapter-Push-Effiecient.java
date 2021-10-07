import java.io.*;
import java.util.*;

 public class Main {

  public static class QueueToStackAdapter {
    Queue<Integer> mainQ;
    Queue<Integer> helperQ;

    public QueueToStackAdapter() {
      mainQ = new ArrayDeque<>();
      helperQ = new ArrayDeque<>();
    }

    int size() { 
      // return size of main queue
      
      return mainQ.size();
      
    }

    void push(int val) {
      // add the values to helperq first
      
      helperQ.add(val);
      // till the size of helperQ is greater than 0 push element from main queue to helperQ
      while(mainQ.size()>0){
          helperQ.add(mainQ.remove());
      }
      // swap the refrences
      
      Queue<Integer> tempQ=mainQ;
      mainQ=helperQ;
      helperQ=tempQ;
      
    }

    int pop() {
      // if the size of queue is 0 the return -1 otherwise remove item from mainQ
      if(mainQ.size()==0){
          System.out.println("stack underflow");
          return -1;
      }
      else{
          return mainQ.remove();
      }
      
    }

    int top() {
      // peek the element at top
        
       if(mainQ.size()==0){
          System.out.println("stack underflow");
          return -1;
       }
       else{
           return mainQ.peek();
       }
      
    }
  }

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    QueueToStackAdapter st = new QueueToStackAdapter();

    String str = br.readLine();
    while (str.equals("quit") == false) {
      if (str.startsWith("push")) {
        int val = Integer.parseInt(str.split(" ")[1]);
        st.push(val);
      } else if (str.startsWith("pop")) {
        int val = st.pop();
        if (val != -1) {
          System.out.println(val);
        }
      } else if (str.startsWith("top")) {
        int val = st.top();
        if (val != -1) {
          System.out.println(val);
        }
      } else if (str.startsWith("size")) {
        System.out.println(st.size());
      }
      str = br.readLine();
    }
  }
}