package classesandobjects;
class Calculator 
{
	public void add(int a, int b)
	{
		System.out.println("Addition of " + a + " and " + b + " is " + (a+b));
	}
}
class AdvCalculator extends Calculator 
{
	public void sub(int a, int b)
        {
                System.out.println("Subtraction of " + a + " and " + b + " is " + (a-b));
        }

}
class SuperAdvCalculator extends AdvCalculator 
{
	public void mult(int a, int b)
        {
                System.out.println("Multiplication of " + a + " and " + b + " is " + (a*b));
        }

}

public class Inheritance
{
	public static void main(String[] args)
	{
		SuperAdvCalculator casio = new SuperAdvCalculator();
		casio.add(3,5);
		casio.sub(90,18);
		casio.mult(20,89);
	}
}
//object of sub class calls constructor of both  sub and super class
