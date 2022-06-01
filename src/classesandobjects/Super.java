package classesandobjects;

class A
{
	public A()
	{
		System.out.println("I am in A(Default)");
	}
	public A(int a)
        {
                System.out.println("I am in A(int)");
        }

}
class B extends A
{
	public B()
        {
		super();
		// super(30); This will call A's parametrized constructor
                System.out.println("I am in B(Default)");
        }
	public B(int a)
       	{
		super(a);
               	System.out.println("I am in B(int)");
        }

}
public class Super
{
	public static void main(String[] args)
	{
		B obj = new B();
	}
}