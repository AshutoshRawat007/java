public class multi_thread_no {
    public static void main(String[] args) {
        A a=new A();
        B b=new B();
        C c=new C();

        a.start();
        b.start();
        c.start();
    }   
}

class A extends Thread{
    public void run()
    {
	//System.out.print("A");
        for(int i=1;i<10;i++)
            System.out.print("A"+i +" ");
	System.out.println(" ");
    }
}
class B extends Thread{
    public void run()
    {
	//System.out.print("B");
        for(int i=1;i<10;i++)
            System.out.print("B"+i +" ");
	System.out.println(" ");
    }
}
class C extends Thread{
    public void run()
    {
	//System.out.print("C");
        for(int i=1;i<10;i++)
            System.out.print("C"+i +" ");
	System.out.println(" ");
    }
}

