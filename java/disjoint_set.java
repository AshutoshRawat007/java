//import java.util.*;
public class Main
{
    int n; int parent[];
    Main(int n)
    {
        this.n=n;
        parent=new int[n];
        set();
    }
    void set()
    {
        for(int i=0;i<n;i++)
            parent[i]=-1;
    }

    int find(int x)
    {
        if(parent[x]<0)
            return x;
        else
           return find(parent[x]);
      

    }
    void union(int x,int y)
    {
        int xr=find(x);int xy=find(y);

        System.out.println("parent of : "+x+" is :"+parent[xr]+" []"+xr);
        System.out.println("parent of : "+y+" is :"+parent[xy]+" []"+xy);

        if(parent[xy]==-1&& parent[xr]==-1)
            {
                System.out.println("..........................else if -1 -1-");
               parent[xy]=xr;
               parent[xr]=parent[xr]-1;
               System.out.println("..........................//////parentsy   "+parent[xy]);
            }
        else if(  (parent[xr]) >  (parent[xy]) )
        {   
            System.out.println("...............................else if xr less");

            parent[xr]=xy;
            parent[xy]=parent[xy]-1;
            
        }
        else if(  (parent[xr]) <  (parent[xy]) )
        {   
            System.out.println("................................else if xr more");
            parent[xy]=xr;
            parent[xr]=parent[xr]-1;
        }
        else 
           { 
               System.out.println("................................return");
             return;  
           }

          print();
    }
    void print(){
        System.out.print("parent "  );
        for(int i=0;i<n;i++)
            System.out.print(parent[i]+" ");
            System.out.println();
        for(int i=0;i<n;i++)
            System.out.print(i+" ");
            System.out.println();
    }

    public static void main(String[] args) {
        //0 1 2 3 4
        Main obj=new Main(5);
        obj.union(0,2);
        obj.union(1,3);
        obj.union(1,4);

        if (obj.find(4) == obj.find(1))
             System.out.println("Yes");
         else
            System.out.println("No");        
    }
}