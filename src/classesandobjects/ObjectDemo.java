package classesandobjects;


class Calc
{
	int num1,num2,result; // instance variables
	
	
	
	public Calc() // Default Constructor
	{
		num1=5;
		num2=5;
	}
	// We can create two constructor in the same class provided they have different signature.
	
	public Calc(int n)
	{
		num1 = n;
		num2 = n;
	}
	
	public Calc(double d,int n)// Parameterized Constructor
	{
		num1 = (int)d;
		num2 = n;
	}
	
	public Calc(int num1,int num2)
	{
		this.num1=num1;
		this.num2=num2;
	}
	
}


public class ObjectDemo 
{
	public static void main(String[] args) // Execution of your code starts with the main function
	{
		Calc obj = new Calc(8.9,9); // Constructor
		
		System.out.println(obj.num1+" "+obj.num2);
		
	}
	
}



