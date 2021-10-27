import java.io.*;
import java.util.*;

public class Main {
   static class Edge {
      int src;
      int nbr;

      Edge(int src, int nbr) {
         this.src = src;
         this.nbr = nbr;
      }
      
   }
   
   // create a pair class to store our pair class for vetex and path so far
   public static class Pair{
       int vtx;
       String psf;
       Pair(int vtx,String psf){
           this.vtx=vtx;
           this.psf=psf;
       }
   }
   // create a function BFS which will take the graph and source vertex as argument
   public static void Bfs(ArrayList<Edge>[] graph,int src){
       
       // create a queue and add the pair into it
       Queue<Pair> queue = new ArrayDeque<>();
       // add the pair
       queue.add(new Pair(src,src+""));
       // create a viisted array to track the source is visited or not
       boolean visited[]= new boolean[graph.length];
       
       // till there is a elemnt in the queue remove the elemnt from queue
       while(queue.size()>0){
           // store it in pair variable front pair
           Pair fpair=queue.remove();
           
           // check if the vetex false then it is not visited then visit it and print it
           
           if(visited[fpair.vtx]==false){
               // after visiting mark that vetex true
               visited[fpair.vtx]=true;
               System.out.println(fpair.vtx+"@"+fpair.psf);
           }
           
           // call the edges which are rising from this vetex and add them into pair class
           for(Edge e:graph[fpair.vtx]){
               // if the edge is not visited then visit it and the path and vertex
               if(visited[e.nbr]==false){
                   // add to queue now source is e.nbr and psf = e.nbr+psf
                   queue.add(new Pair(e.nbr,fpair.psf+e.nbr));
               }
           }
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
         graph[v1].add(new Edge(v1, v2));
         graph[v2].add(new Edge(v2, v1));
      }

      int src = Integer.parseInt(br.readLine());

      // write your code here  
      Bfs(graph,src);
   }
}import java.io.*;
import java.util.*;

public class Main {
   static class Edge {
      int src;
      int nbr;

      Edge(int src, int nbr) {
         this.src = src;
         this.nbr = nbr;
      }
      
   }
   
   // create a pair class to store our pair class for vetex and path so far
   public static class Pair{
       int vtx;
       String psf;
       Pair(int vtx,String psf){
           this.vtx=vtx;
           this.psf=psf;
       }
   }
   // create a function BFS which will take the graph and source vertex as argument
   public static void Bfs(ArrayList<Edge>[] graph,int src){
       
       // create a queue and add the pair into it
       Queue<Pair> queue = new ArrayDeque<>();
       // add the pair
       queue.add(new Pair(src,src+""));
       // create a viisted array to track the source is visited or not
       boolean visited[]= new boolean[graph.length];
       
       // till there is a elemnt in the queue remove the elemnt from queue
       while(queue.size()>0){
           // store it in pair variable front pair
           Pair fpair=queue.remove();
           
           // check if the vetex false then it is not visited then visit it and print it
           
           if(visited[fpair.vtx]==false){
               // after visiting mark that vetex true
               visited[fpair.vtx]=true;
               System.out.println(fpair.vtx+"@"+fpair.psf);
           }
           
           // call the edges which are rising from this vetex and add them into pair class
           for(Edge e:graph[fpair.vtx]){
               // if the edge is not visited then visit it and the path and vertex
               if(visited[e.nbr]==false){
                   // add to queue now source is e.nbr and psf = e.nbr+psf
                   queue.add(new Pair(e.nbr,fpair.psf+e.nbr));
               }
           }
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
         graph[v1].add(new Edge(v1, v2));
         graph[v2].add(new Edge(v2, v1));
      }

      int src = Integer.parseInt(br.readLine());

      // write your code here  
      Bfs(graph,src);
   }
}import java.io.*;
import java.util.*;

public class Main {
   static class Edge {
      int src;
      int nbr;

      Edge(int src, int nbr) {
         this.src = src;
         this.nbr = nbr;
      }
      
   }
   
   // create a pair class to store our pair class for vetex and path so far
   public static class Pair{
       int vtx;
       String psf;
       Pair(int vtx,String psf){
           this.vtx=vtx;
           this.psf=psf;
       }
   }
   // create a function BFS which will take the graph and source vertex as argument
   public static void Bfs(ArrayList<Edge>[] graph,int src){
       
       // create a queue and add the pair into it
       Queue<Pair> queue = new ArrayDeque<>();
       // add the pair
       queue.add(new Pair(src,src+""));
       // create a viisted array to track the source is visited or not
       boolean visited[]= new boolean[graph.length];
       
       // till there is a elemnt in the queue remove the elemnt from queue
       while(queue.size()>0){
           // store it in pair variable front pair
           Pair fpair=queue.remove();
           
           // check if the vetex false then it is not visited then visit it and print it
           
           if(visited[fpair.vtx]==false){
               // after visiting mark that vetex true
               visited[fpair.vtx]=true;
               System.out.println(fpair.vtx+"@"+fpair.psf);
           }
           
           // call the edges which are rising from this vetex and add them into pair class
           for(Edge e:graph[fpair.vtx]){
               // if the edge is not visited then visit it and the path and vertex
               if(visited[e.nbr]==false){
                   // add to queue now source is e.nbr and psf = e.nbr+psf
                   queue.add(new Pair(e.nbr,fpair.psf+e.nbr));
               }
           }
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
         graph[v1].add(new Edge(v1, v2));
         graph[v2].add(new Edge(v2, v1));
      }

      int src = Integer.parseInt(br.readLine());

      // write your code here  
      Bfs(graph,src);
   }
}