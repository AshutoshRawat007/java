package java;
//6
//
//ASHUTOSH RAWAT || 19/B || uni roll : 2018248
public class String_fn 
{
    public static void main(String args[])
    {
        String  str="Java";

        String cstr=str.concat("Welcome");
        System.out.println("concat function:"+cstr);

        System.out.println("char at of function:"+str.charAt(1));

        System.out.println("index of first a function:"+str.indexOf('a'));

        System.out.println("index of second a function:"+str.indexOf('a',2));

        System.out.println("compare java JAVA: "+str.equals("JAVA"));

        System.out.println("compare java JAVA ignoreCase :"+str.equalsIgnoreCase("JAVA"));

        System.out.println("last index of a"+str.lastIndexOf('a'));
    }


    
}
