package java;
//7
public class StringBuffer_fn
{
    public static void main(String args[])
    {
        StringBuffer str =new StringBuffer("HELLO"); 

        str.append(" Java");
        System.out.println("append Java: "+str);

        str=new StringBuffer("HELLO");
        str.insert(1,"Java");
        System.out.println("insert Java at 1st : "+str);

        str=new StringBuffer("HELLO");
        str.replace(1,3,"Java");
        System.out.println("replace 1 and 2 index with Java: "+str);

        str=new StringBuffer("HELLO");
        str.delete(1,3);
        System.out.println("Delete 1,3 : "+str);

        str=new StringBuffer("HELLO");
        str.reverse();
        System.out.println("Delete 1,3 : "+str);       


    }
    
}
