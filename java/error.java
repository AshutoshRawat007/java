import java.util.*;

class ba extends RuntimeException
{
    ba(String s)
      {  super(s);}
}
public class error {

   
    public static void main(String[] args) {
       
        try{
            
            throw new ba("wtf");

        }catch(Exception e)
        {   
                System.out.println(e+"sooos");

        }
       finally
        {
            System.out.println("happy man");
        }
    }
}
