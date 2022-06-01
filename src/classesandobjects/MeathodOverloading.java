package classesandobjects;

class Casio
{
	int num1;
	int num2;
	String operation;
	
	public Casio()   // CONSTRUCTOR OVERLOADNG
	{
		num1=0;
		num2=0;
		operation= "Nothing";
	}
	
	public Casio(int i)
	{
		num1=i;
		num2=0;
		operation= "Nothing";
	}
	
	public Casio(int i, int j)
	{
		num1=i;
		num2=j;
		operation= "Nothing";
	}
	

		
	
	public void add (int i , int j) // METHOD OVERLOADING
	{
		System.out.println(i+j);
	}
	
	public void add(int i , int j, int k)
	{
		System.out.println(i+j+k);
	}
	
	public void add(double i, double k)
	{
		System.out.println(i+k);
	}
}

public class MeathodOverloading
{
	public static void main(String[] args)
	{
		Casio obj = new Casio();
		obj.add(5,2);
		
		obj.add(4,3,5);
		
		obj.add(4.5,3.8);
	}
}