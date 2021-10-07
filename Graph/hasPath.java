import java.io.*;
import java.util.*;

public class Main {
   static class Edge {
      int src;
      int nbr;
      int wt;

      Edge(int src, int nbr, int wt){
         this.src = src;
         this.nbr = nbr;
         this.wt = wt;
      }
   }
   public static void main(String[] args) throws Exception {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

      int vtces = Integer.parseInt(br.readLine());
      ArrayList<Edge>[] graph = new ArrayList[vtces];
      for(int i = 0; i < vtces; i++){
         graph[i] = new ArrayList<>();
      }

      int edges = Integer.parseInt(br.readLine());
      for(int i = 0; i < edges; i++){
         String[] parts = br.readLine().split(" ");
         int v1 = Integer.parseInt(parts[0]);
         int v2 = Integer.parseInt(parts[1]);
         int wt = Integer.parseInt(parts[2]);
         graph[v1].add(new Edge(v1, v2, wt));
         graph[v2].add(new Edge(v2, v1, wt));
      }

      int src = Integer.parseInt(br.readLine());
      int dest = Integer.parseInt(br.readLine());

      // create a function haspath which will take input of graph,source,destination and a boolean array which will of size of vertices (default value false)
      
      boolean res = hasPath(graph,src,dest, new boolean[vtces] );
      System.out.println(res);
    }
    
    public static boolean hasPath(ArrayList<Edge> graph[],int vtx,int dest,boolean visited[]){
        
        // while visiting if we reached destination vertex then return true
        
        if(vtx==dest){
            return true;
        }
        
        // at first make the visited array true for all vertices
        
        visited[vtx]=true;
        
        // go through all edges and find if there child visited or not
        
        for(Edge e : graph[vtx]){
            
            // if their childs are not visited then call haspath function for their children
            
            if(visited[e.nbr]==false){
              boolean rres =  hasPath(graph,e.nbr,dest,visited);
              
              // if result is true then return true
              if(rres){
                  return true;
              }
            }
            
        }
       
       // if result is false then return false 
        return false ;
    
        
    }

}