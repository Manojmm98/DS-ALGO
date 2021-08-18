public import java.io.*;
import java.util.*;

public class Main {

  public static class CustomQueue {
    int[] data;
    int front;
    int size;

    public CustomQueue(int cap) {
      data = new int[cap];
      front = 0;
      size = 0;
    }

    int size() {
      // it will return the size of queue we just have to return size only
      return size;
    }

    void display() {
        // in display function we are printing the values of all index  by (font+idx)%data.length
        for(int i=0;i<size;i++){
            System.out.print(data[(front+i)%data.length]+" ");
        }
        System.out.println();
    }

    void add(int val) {
      if(size==data.length){
          //System.out.println("Queue overflow");
          // create newdata array of double length
          
          int newData[]= new int[2*data.length];
          // copy elements from old array
          for(int i=0;i<data.length;i++){
              newData[i]=data[(front+i)%data.length];
          }
          // change reference of old data to newdata
          data=newData;
          // correct the front index
          front=0;
          // add the value
          add(val);
      }
      else{
      int idx = (front+size) % data.length;
       data[idx]=val;
      size++;
      }
    }

    int remove() {
       if(size==0){
          System.out.println("Queue underflow");
          return -1;
      }
      int val = data[front];
      data[front]=0;
      front= (front+1)%data.length;
      size--;
      return val;
      
    }

    int peek() {
        if(size==0){
          System.out.println("Queue underflow");
          return -1;
      }
      int val = data[front];
      return val;
    }
  }

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    CustomQueue qu = new CustomQueue(n);

    String str = br.readLine();
    while(str.equals("quit") == false){
      if(str.startsWith("add")){
        int val = Integer.parseInt(str.split(" ")[1]);
        qu.add(val);
      } else if(str.startsWith("remove")){
        int val = qu.remove();
        if(val != -1){
          System.out.println(val);
        }
      } else if(str.startsWith("peek")){
        int val = qu.peek();
        if(val != -1){
          System.out.println(val);
        }
      } else if(str.startsWith("size")){
        System.out.println(qu.size());
      } else if(str.startsWith("display")){
        qu.display();
      }
      str = br.readLine();
    }
  }
}class DynamicQueue {
    
}
