import java.io.*;
import java.util.*;

public class Main {
   static class Edge {
      int src;
      int nbr;
      int wt;

      Edge(int src, int nbr, int wt) {
         this.src = src;
         this.nbr = nbr;
         this.wt = wt;
      }
   }

   public static void main(String[] args) throws Exception {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

      int vtces = Integer.parseInt(br.readLine());
      ArrayList<Edge>[] graph = new ArrayList[vtces];
      for (int i = 0; i < vtces; i++) {
         graph[i] = new ArrayList<>();
      }

      int edges = Integer.parseInt(br.readLine());
      for (int i = 0; i < edges; i++) {
         String[] parts = br.readLine().split(" ");
         int v1 = Integer.parseInt(parts[0]);
         int v2 = Integer.parseInt(parts[1]);
         int wt = Integer.parseInt(parts[2]);
         graph[v1].add(new Edge(v1, v2, wt));
         graph[v2].add(new Edge(v2, v1, wt));
      }

      int src = Integer.parseInt(br.readLine());

      // write all your codes here
      
      hPath(graph,src,new HashMap<>(),src+"",src);
   }
   // we have to find hamiltanian path and cycle 
   // all path are hamiltonian path but a path will be hamiltonian cycle if there will be a single direct edge between source vetrex and destination/end vertex
   
   // here we pass src at last in the function to check source vertex
   
   public static void hPath(ArrayList<Edge> graph[],int vtx,HashMap<Integer,Boolean> visited,String psf,int orsc){
       
       // when we reached the length-1 index then we will check if there will be a direct edge between src or destination vetex or not
       
       // here we are not taking visited.size()== graph.length because we are marking the vetex as true at first if we will take equal to length then we will mark it true 
       // so e.nbr will be true and our loop for e.nbr will not work
       
       if(visited.size()==graph.length-1){
          
          boolean directEdge = false;
          
          // when the nbr of the end vertex will be equal to sorce then there is no edge here src=0 and nbr od end vetex is also 0
        
          for(Edge e : graph[vtx]){
              if(e.nbr==orsc){
                  
                  directEdge=true;
              }
          }
          
          if(directEdge==true){
             System.out.println(psf+"*");
          }
          else{
          
              System.out.println(psf+".");
          }
       }
       
       visited.put(vtx,true);
       for(Edge e : graph[vtx]){
           if(visited.containsKey(e.nbr)==false){
               hPath(graph,e.nbr,visited,psf+e.nbr,orsc);
           }
       }
       visited.remove(vtx);
       
   }


}