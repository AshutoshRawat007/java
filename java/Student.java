package java;

import java.util.*;


//1
//Ashutosh Rawat || 19/B || uni roll : 2018248
class Student
{
    int ID;String name,branch,uni;
    void setDetails(int id,String n,String branch,String uni){
        ID=id;
        name=n;
        this.branch=branch;
        this.uni=uni;
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
    

        obj.setDetails(24567,"rahul","btech","GEHU");
        obj.showDetails();
        
    }
}