package java;

//2
//Ashutosh Rawat || 19/B || uni roll : 2018248
public class BankingSystem
{
    String name; 
    long account_no;
    float amount;

    void deposit()
    {
        Scanner k=new Scanner(System.in);
        System.out.println("enter the amount to be deposited in your account:");
        float dp=dp.nextFloat();
        amount=amount+dp;       

    }
    void withdraw()
    {
        Scanner k=new Scanner(System.in);
        System.out.println("enter the amount to be withdrawn in your account:");
        float wthr=wthr.nextFloat();
        if(amount>wthr)
            amount=amount-wthr;
        else
            System.out.println(": can't withdraw not enouh money in account:");        

    }

    void checkBalance()
    {
        System.out.println("The amount on account is : "+ amount);
        
    }

    void insert(String name,float amount , long account_no,)
    {
        this.name=name;
        this.amount=amount;
        this.account_no=account_no;

    }

    void display()
    {
        System.out.println("the details are :");
        System.out.println("Name : "+name+"\n"+"Account number :"+account_no+"\n"+"Amount :"+amount);
    }

    
    public static void main(String args[])
    {
        BankingSystem obj=new BankingSystem();
        //Scanner k=new Scanner(System.in);
        obj.insert("ashutosh",1000000.85f,123456789001);
        obj.deposit();
        obj.withdraw();;
        obj.checkBalance();
        obj.display();
        
    }
    
}
