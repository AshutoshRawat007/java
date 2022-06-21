//Ashutosh Rawat
//By me with the little help from internet a bit different
// find Minimum Spanning Tree of a given
//connected, undirected and  weighted graph
import java.util.Arrays;
import java.util.Collection;

public class Kruskal {

// creating an Edge clas to store source and destination 
//implements comparable so we can sort it as we are provided with compareTo function
    class Edge implements Comparable<Edge>{
            int src,dest,wt;
            
            public int compareTo(Edge CompareEdge) {
            return this.wt - CompareEdge.wt; 
            }
    };

//no of verticces and edges and a parent array as used in disjoint set code for union find    
    int V,E,parent[];
    Edge edge[];

//Kruskal constructior for assigning values and intializaion
    Kruskal(int v,int e)
    {
        V=v;E=e;
        parent= new int[V];
        for(int i=0;i<V;i++)
            parent[i]=-1;
        edge =new Edge[E];
    
    //we are doing it because Edge is a class contang src, dest,wt. 
    // so with this we create an object e times so we can store the values => e edges 
        for (int i = 0; i < e; ++i)
            edge[i] = new Edge();
    }

 //find for union fine   
    int find(int x)
    {
        if(parent[x]<0)
            return x;
        else
           return find(parent[x]);
    }
// union for union find
    void union(int x,int y)
    {
        int xr=find(x);int xy=find(y);
        if(parent[xy]==-1&& parent[xr]==-1)
            {
               parent[xy]=xr;
               parent[xr]=parent[xr]-1;
            }
        else if(  (parent[xr]) >  (parent[xy]) )
        {  parent[xr]=xy;
            parent[xy]=parent[xy]-1;
            
        }
        else if(  (parent[xr]) <  (parent[xy]) )
        {   parent[xy]=xr;
            parent[xr]=parent[xr]-1;
        }
        else 
            return;  
        //print();
    }
//Kruskal main Algo 
//sort the edges -----> then select each edge and compare if there is cycle with unuion find
// if cycle discard else calculate the weight and repeat 2 step V-1 times as MST has V-1 edges

    void KruskalAlgo()
    {
        Arrays.sort(edge);
        int sum=0;

        Edge result[] = new Edge[V];
        for (int i = 0; i < V; ++i)
            result[i] = new Edge();

        int e=0; 

        for(int i=0;i<V;i++)
        {
            Edge edges=edge[i];
            int xr=find(edges.src);
            int xy=find(edges.dest);

            if(xy!=xr){
            
            //copying only the edges which has passed our barries of cycle to result
                result[e++] = edges;
                union(edges.src,edges.dest);
                sum=sum+edges.wt;
            }
        }
        System.out.println("The minimun weight of graph is : "+sum);
        for (int i = 0; i < e; ++i)
            System.out.println(result[i].src + " -- "+ result[i].dest+ " == " + result[i].wt);

    }
   
    public static void main(String[] args) {

        int V=4;
        int E=5;
        Kruskal kru=new Kruskal(V, E);

        kru.edge[0].src = 0;
        kru.edge[0].dest = 1;
        kru.edge[0].wt = 10;
 
        // add edge 0-2
        kru.edge[1].src = 0;
        kru.edge[1].dest = 2;
        kru.edge[1].wt = 6;
 
        // add edge 0-3
        kru.edge[2].src = 0;
        kru.edge[2].dest = 3;
        kru.edge[2].wt = 5;
 
        // add edge 1-3
        kru.edge[3].src = 1;
        kru.edge[3].dest = 3;
        kru.edge[3].wt = 15;
 
        // add edge 2-3
        kru.edge[4].src = 2;
        kru.edge[4].dest = 3;
        kru.edge[4].wt = 4;

        kru.KruskalAlgo();
        
    }
    
}
