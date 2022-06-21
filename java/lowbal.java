import java.util.*;
class LowbalanceException extends RuntimeException {
    LowbalanceException(String s)
    {  super(s);
    }
}
public class lowbal{
    void withdraw(int bal, int n)
    {
        if(bal<n)
            throw new LowbalanceException("insufficient balancef");
        else
            System.out.print("The remaining balance is : "+(bal-n));
    }
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        System.out.println("Ashutosh Rawat || 2018248 || sec - B");
        lowbal ob=new lowbal();
        System.out.println("balance is :");int x=k.nextInt();
        System.out.println("amt to withdraw :");int y=k.nextInt();
        ob.withdraw(x,y);

    }
}
