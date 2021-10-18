import java.io.*;
import java.util.*;

public class Main {
    
    static class Edge{
        int src;
        int nbr;
        int wt;
        Edge(int src,int nbr,int wt){
            this.src=src;
            this.nbr=nbr;
            this.wt = wt;
        }
    }

   public static void main(String[] args) throws Exception {
      Scanner scn = new Scanner(System.in);
      int vtces = scn.nextInt();
      ArrayList<Edge>graph[]=new ArrayList[vtces];
      for(int i=0;i<vtces;i++){
          graph[i]=new ArrayList<>();
      }
      int k = scn.nextInt();
      for(int i=0;i<k;i++){
          int v1=scn.nextInt();
          int v2=scn.nextInt();
          int wt =0;
          
          graph[v1].add(new Edge(v1,v2,wt));
          graph[v2].add(new Edge(v2,v1,wt));
      }
      
       //find out all connected component from conneted graph
       
       ArrayList<ArrayList<Integer>> allcomps= gcc(graph);
       // to show the result create res variable
       int res =0;
       
       // travel through allcomps and start the first loop from 0th position and 2nd loop from 1st position and get ith and jth arraylist and multiply it
       for(int i=0;i<allcomps.size();i++){
           for(int j=i+1;j<allcomps.size();j++){
               ArrayList<Integer> ith = allcomps.get(i);
               ArrayList<Integer> jth = allcomps.get(j);
               
               res = res + (ith.size()*jth.size());
           }
       }
       // print the res
       System.out.println(res);
   }
   

    public static ArrayList<ArrayList<Integer>> gcc(ArrayList<Edge>[] graph) {

      // create a arraylist which store all components

      ArrayList<ArrayList<Integer>> allcomps = new ArrayList<>();

      // create a visited array

      boolean visited[] = new boolean[graph.length];

      // itreate through all the vertex

      for (int vtx = 0; vtx < graph.length; vtx++) {
        // create a res arraylist to store the ans

        ArrayList<Integer> res = new ArrayList<>();

        // check if the vertex is not visited then go inside and call gcc for all the neighbour edges

        if (visited[vtx] == false) {

          // call the gcc function for all vertex which will return the arraylist which will store all visited vertex

          gcc(graph, vtx, res,visited);

          // add res to all component

          allcomps.add(res);
        }
      }
      
      // return all components
      return allcomps;
    }

    // define gcc function

    public static void gcc(ArrayList<Edge>[] graph, int vtx, ArrayList<Integer> res,boolean visited[] ){
    

      // add the vertex to res arraylist

      res.add(vtx);

      // mark all vertex  as visited

      visited[vtx] = true;

      // go through all the edges of graph

      for (Edge e : graph[vtx]) {

        // if the neighbou is not visited then go inside and call gcc

        if (visited[e.nbr] == false) {
          gcc(graph, e.nbr, res,visited);
        }

      }

    }

   
   

}