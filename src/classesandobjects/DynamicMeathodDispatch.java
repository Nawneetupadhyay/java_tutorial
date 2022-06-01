package classesandobjects;

class Aa
{
	public void show()
	{
		System.out.println("in A");
	}
}
class Bb extends Aa
{
	public void show()
	{
		System.out.println("in B");
	}
}
class Cc extends Aa
{
	public void show()
	{
		System.out.println("in C");
	}
	public void displayInfo()
	{
		System.out.println("C is the subclass and A is Super");
	}
}
public class DynamicMeathodDispatch
{
	public static void main(String[] args)
	{
		Aa obj1 = new Bb(); //runtime polymorphism
		obj1.show();

		obj1 = new Cc(); 
		obj1.show(); // dynamic method dispatch
		//obj1.displayInfo();   Invalid access

	}

}
