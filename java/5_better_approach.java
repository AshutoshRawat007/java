package java;
//5
//ASHUTOSH RAWAT || 19/B || uni roll : 2018248
import java.util.*;
class Student
{
    int ID;String name,branch;
    static String uni;
    void setDetails(int id,String n,String branch){
        ID=id;
        name=n;
        this.branch=branch;
        
    }

    void showDetails(){
        System.out.println("Name :"+name);
        System.out.println("ID :"+ID);
        System.out.println("Branch is :"+branch);
        System.out.println("University :"+uni);

    }
    public static void main(String args[]) 
    {
        //Scanner k=new Scannner(System.in);
        Student obj=new Student();
    
        Student.uni="GEHU";
        obj.setDetails(24567,"rahul","btech");
        obj.showDetails();
        
    }
}