package classesandobjects;

class Outer // Outer.class
{
	// We can have static class same as method and variable
	static int a;// member variable
	public static void show()// member method
	{
		
	}
	
	static class Inner // Its name will be Outer$Inner.class. 
	{
		public void display()
		{
			System.out.println("In Display");
		}
	
	}
}

public class Innerclass {

	public static void main(String[] args) 
	{
		Outer obj = new Outer();
		obj.show();
		
		// Outer.Inner obj1 = obj.new Inner();  To create object of inner class, we need object of outer class
		// Above one is in case class is non static
		
		Outer.Inner obj1 = new Outer.Inner(); // in case if the class is static
		obj1.display();
	}

}

