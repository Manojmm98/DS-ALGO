import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        // we took input as n from user and we filled the array for values and weight which is of n length
        int n= scn.nextInt();
        int value[]= new int[n];
        for(int i=0;i<n;i++){
            value[i]=scn.nextInt();
        }
        int weight[]= new int[n];
        for(int i=0;i<n;i++){
            weight[i]=scn.nextInt();
        }
      int cap= scn.nextInt();
      System.out.println(fraknapsack(value,weight,cap));
    }
    // we have to compare the values and weight ratio and the highest one have highest vaklue so we use comparable
    public static class Pair implements Comparable<Pair>
    {
        int wts;
        int vls;
        // we take ratio as double because ratio can be fractionall
        double ratio;
    public int compareTo(Pair o){
        if(o.ratio<this.ratio){
            return -1;
        }
        else if(o.ratio==this.ratio){
            return 0;
        }
        else{
            return 1;
        }
    }
    }
    public static double  fraknapsack (int value[],int weight[],int cap){
        // to store item and compare items we created a items array of length of value given
       Pair items[]= new Pair[value.length];
       // now travel to all items and find the weight value & ratio correpondly
       for(int i=0;i<value.length;i++){
           // as we have to compare it so we have to store in a pair values so create a pair and give values to that
           Pair p = new Pair();
           p.wts=weight[i];
           p.vls=value[i];
           p.ratio= (p.vls*1.0)/p.wts;
           items[i]=p;
       }
       // we have to sort it in descending order so we use array.sort and we also implements sort to sortting
       Arrays.sort(items);
       int idx=0;
       double tval=0;
       // we will check if capacity is greater than 0 and if idx of item not greater than length which seems to be impossible
       while(cap>0&&idx<items.length){
           // there will be a two condition while comparing with weight weight will be less than capacity 
           if(items[idx].wts<=cap){
               // capacity of every idx wil be capacity- weight of that idx
              cap = cap- items[idx].wts;
              // total value will be previous totalvalue plus items value correponds to index
              tval+=items[idx].vls;
              // we have to travel all index so we are increasing indexses
              idx++;
           }
           else{
               // here weight is grater than capacity so totalvalue will be cap *ratio vls & weight
               tval +=cap*items[idx].ratio;
               // we use all capacity so cap==0
               cap=0;
           }
       } 
    return tval;
    }
}