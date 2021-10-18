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
    
    ArrayList<ArrayList<Integer>> comps = gcc(graph);
    System.out.println(comps);
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