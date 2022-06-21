import java.util.*;
public class heap {


    void heapsort(int a[])
    {
        System.out.println("building heap");
        int n=a.length;
        for(int i=(n/2)-1;i>=0;i--)
            heapify(a,n,i);


        System.out.println("max heap builedf");
        print(a);

        for(int i=n;i>0;i--)
        {    
            swap(a[0],a[i]);
            heapify(a,i-1,0);
        }

    }

    void heapify(int a[],int n,int k)
    {
        System.out.println("heapyfy called");
        int l=(2*k)+1;
        int r=(2*k)+2;
        int c=0;
        if(l<n && a[l]>a[k])
        {    swap(a[k],a[l]);
            c=l;
        }
        if(r<n && a[r]>a[k])
        {   swap(a[k],a[r]);
            c=r;
        }
        if(c!=0)
        heapify(a,n,c);
        

    }
    void swap(int a , int b)
    {
        int temp=a;
        a=b;        b=temp;;
    }
    void print(int a[])
    {    for(int i=0;i<a.length;i++)
            System.out.print(" "+a[i]);
    }
    public static void main(String args[])
    {
        Scanner k= new Scanner(System.in);
        int n=10;
        int a[]=new int[n];
        System.out.println("Enter elements");
        for(int i=0;i<n;i++)
            a[i]=k.nextInt();

        System.out.println("calling heap fn");

        heap obj=new heap();
        obj.heapsort(a);  
        System.out.println("printing sorted element");

        obj.print(a);
        
    }
    
}
