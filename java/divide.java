
import java.util.*;
public class divide {
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        System.out.println("Ashutosh Rawat || 2018248 || sec - B");
        int a=k.nextInt();     int b=k.nextInt();
        int c;
         try{
             c=a/b;
             System.out.println("a/b is : "+c);
         }
         catch(Exception e)
             {  System.out.println("denominatoopr is zero"); }
    }    
}
