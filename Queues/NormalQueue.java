import java.io.*;
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
      // if we want to add an element into a queue then we just have to find the idx where we have to add the value and will drop the value there
      if(size==data.length){
          System.out.println("Queue overflow");
          return;
      }
      int idx = (front+size) % data.length;
       data[idx]=val;
      size++;
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
}