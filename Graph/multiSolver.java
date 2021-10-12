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

   static class Pair implements Comparable<Pair> {
      int wsf;
      String psf;

      Pair(int wsf, String psf){
         this.wsf = wsf;
         this.psf = psf;
      }

      public int compareTo(Pair o){
         return this.wsf - o.wsf;
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
      int dest = Integer.parseInt(br.readLine());

      int criteria = Integer.parseInt(br.readLine());
      int k = Integer.parseInt(br.readLine());

      boolean[] visited = new boolean[vtces];
      multisolver(graph, src, dest, visited, criteria, k, src + "", 0);
      
      System.out.println("Smallest Path = " + spath + "@" + spathwt);
      System.out.println("Largest Path = " + lpath + "@" + lpathwt);
      System.out.println("Just Larger Path than " + criteria + " = " + cpath + "@" + cpathwt);
      System.out.println("Just Smaller Path than " + criteria + " = " + fpath + "@" + fpathwt);
      System.out.println(k + "th largest path = " + pq.peek().psf + "@" + pq.peek().wsf);
   }



   static String spath;
   static Integer spathwt = Integer.MAX_VALUE;
   static String lpath;
   static Integer lpathwt = Integer.MIN_VALUE;
   static String cpath;
   static Integer cpathwt = Integer.MAX_VALUE;
   static String fpath;
   static Integer fpathwt = Integer.MIN_VALUE;
   static PriorityQueue<Pair> pq = new PriorityQueue<>();
   public static void multisolver(ArrayList<Edge>[] graph, int vtx, int dest, boolean[] visited, int criteria, int k, String psf, int wsf) {
       
       // when source(vertex) and destination become equal then find out smallest,largest,just largest & smallest and kth largest path
       
       if(vtx==dest){
           // smallest weighted path(small path according to weight)
           if(wsf<spathwt){
               // small weight path will be wsf
               spathwt=wsf;
               // also smallest path will be the current path
               spath=psf;
           }
           // for larger weighted path
           if(wsf>lpathwt){
               lpathwt=wsf;
               lpath=psf;
           }
           // for kth largest path
           
           // use priority queue to find kth largest element
           // if the size of priorty queue is less than k's value then add the element into priority queue
           
           if(pq.size()<k){
               pq.add(new Pair(wsf,psf));
           }
           // if we got k element then we will check if the weight of smalles weighted element in the queue is less than the current weighted element then remove that element and add the current element pair into queue with psf and wsf
           else{
               if(pq.peek().wsf<wsf){
               pq.remove();
               pq.add(new Pair(wsf,psf));
               }
           }
           
           
           // for ceil path---> just larger-->minimum among larger
           
           // ceil value--> weight so far will be greater than the criteria and will smaller than the larger ceil path
           if(wsf>criteria && wsf<cpathwt){
               cpathwt=wsf;
               cpath=psf;
               
           }
           
           // for floor path-->just smaller-->maximum among smaller
           //floor-> less than criteria and will be larger among fpathwt
            if(wsf<criteria && wsf>fpathwt){
               fpathwt=wsf;
               fpath=psf;
               
           }
           // at last return 
           return;
           
       }
       
       
     // itreate through all the edges and we want to give chance to all node so make make all vertex visted first and before rreturning make it false
     
     visited[vtx]=true;
     
     for(Edge e : graph[vtx]){
        // if the child node is not visited then  call the multisolver function
        if(visited[e.nbr]==false){
            // call the function and here source will be neighbour and in path sofar we will add neighbours path and in weigth sofar we will add weight of current edge
          multisolver(graph,e.nbr,dest,visited,criteria,k,psf+e.nbr,wsf+e.wt);  
        }
     }
     visited[vtx]=false;
      
   }
}