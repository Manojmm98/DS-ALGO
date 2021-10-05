import java.io.*;

import java.util.*;

public class Main {

  public static class QueueToStackAdapter {
    Queue< Integer> mainQ;
    Queue< Integer> helperQ;

    public QueueToStackAdapter() {
      mainQ = new ArrayDeque< >();
      helperQ = new ArrayDeque< >();
    }

    int size() {
        
        //retun the size
        return mainQ.size();
    }

    void push(int val) {
        // push value to the main queue
        mainQ.add(val);
    }

    int pop() {
        // remove element from mainQ and add them to helperQ till the the last element present in stack
        
        if(size()==0){
            System.out.println("stack underflow");
            return -1;
        }
        else{
            // till the last element present remove item from mainq and add them to helper queue
            while(size()>1){
                // remove value from mainQ
                int removedval = mainQ.remove();
                // add it back to helper queue
                helperQ.add(removedval);            
            }
        }
            
            // store the last element present in queue
            
            int val = mainQ.remove();
            
            // change the mainq to helperQ and helperQ to mainQ( swap ) because after removing 1 element we have to show other element also 
            
            Queue<Integer> tempQ= mainQ;
            mainQ=helperQ;
            helperQ=tempQ;
            
            // at last return the value at the top
            
            return val;
    
    }

    int top() {
         // remove element from mainQ and add them to helperQ till the the last element present in stack
        
        if(size()==0){
            System.out.println("stack underflow");
            return -1;
        }
        else{
            // till the last element present remove item from mainq and add them to helper queue
            while(size()>1){
                // remove value from mainQ
                int removedval = mainQ.remove();
                // add it back to helper queue
                helperQ.add(removedval);

                
            }
        }
            
            // remove the last element present in the mainQ and store it in the helperQ if we will only remove then one queue will be empty
            
            int val = mainQ.remove();
            helperQ.add(val);
            
            // change the mainq to helperQ and helperQ to mainQ( swap ) because after removing 1 element we have to show other element also 
            
            Queue<Integer> tempQ= mainQ;
            mainQ=helperQ;
            helperQ=tempQ;
            
            // at last return the value at the top
            
            return val;
    
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