package java;

//4
//ASHUTOSH RAWAT || 19/B || uni roll: 2018248
import java.util.*;

public class Employe
{
    int Id;
    String name;
    String Department;
    float salary;

    void setDetails(int id,String name,String Department,float salary)
    {
        Id=id;
        this.name=name;
        this.Department=Department;
        this.salary=salary;

    }

    void showDetails()
    {
        System.out.println("The name of employe : "+ name);
        System.out.println("ID : "+ id);
        System.out.println("The Department : "+ department);
        System.out.println("The salary : "+ salary);

    }

    public static void main(String args[])
    {
        Scanner k =new Scanner(System.in);

        System.out.print("enter name : ";
        String name=k.nextLine();
        System.out.print("enter id :");

        int id=k.nextInt();

        System.out.print("Department :");
        String Department=k.nextLint();
        
        System.out.print("Salary : ");
        float salary=k.nextFloat();

        Employe ob=new Employe();
        ob.setDetails(id,name,Department,salary);
        ob.showDetails();

        
    }
}
