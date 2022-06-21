//8

public class Student 
{
    int id;
    String name,Branch,city,university;

    Student(int id)
    {
        this.id=id;
    }

    Student(int id,String name)
    {
        this(id);
        this.name=name;
    }

    Student(int id,String name,String Branch)
    {
        this(id,name);
        this.Branch=Branch;
    }

    Student(int id,String name,String Branch,String city)
    {
        this(id,name,Branch);
        this.city=city;
    }

    Student(int id,String name,String Branch,String city,String university)
    {
        this(id,name,Branch,city);
        this.university=university;

    }
    public static void main(String args[])
    {
       Student obj=new Student(12,"ashu","btech","Dehradun","GEHU");
    }
}
