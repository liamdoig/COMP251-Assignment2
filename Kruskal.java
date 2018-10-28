package A2;
import java.util.*;

public class Kruskal{

    public static WGraph kruskal(WGraph g){

        /* Fill this method (The statement return null is here only to compile) */
        WGraph minSpan = new WGraph();
        DisjointSets djs = new DisjointSets(g.getNbNodes());
        
        ArrayList<Edge> sortedEdges = g.listOfEdgesSorted();
        
        for (Edge e : sortedEdges) {
        	if (IsSafe(djs, e)) {
        		minSpan.addEdge(e);
        		djs.union(e.nodes[0], e.nodes[1]);
        	}
        }
        
        return minSpan;
    }

    public static Boolean IsSafe(DisjointSets p, Edge e){

        /* Fill this method (The statement return 0 is here only to compile) */
    	int u = e.nodes[0];
    	int v = e.nodes[1];
    	
    	if (p.find(u) != p.find(v)) {
    		return true;
    	}
        return false;
    
    }

    public static void main(String[] args){

        String file = args[0];
        WGraph g = new WGraph(file);
        WGraph t = kruskal(g);
        System.out.println(t);
        
       

   } 
}
